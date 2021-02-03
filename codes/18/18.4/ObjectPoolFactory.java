import java.util.Map;
import java.util.HashMap;
import java.util.Properties;
import java.lang.IllegalAccessException;
import java.lang.Exception; 
import java.io.FileInputStream;

public class ObjectPoolFactory
{
	private Map<String, Object> objectPool = new HashMap<>();
	private Object createObject(String clazzName)
		throws Exception, IllegalAccessException, ClassNotFoundException
	{
		Class<?> clazz = Class.forName(clazzName);
		return clazz.getConstructor().newInstance();
	}
	//该方法根据指定文件来初始化对象池
	//根据指定文件来创建对象
	public void initPool(String fileName)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		try(var fis = new FileInputStream(fileName))
		{
			var props = new Properties();
			props.load(fis);
			for (String name: props.stringPropertyNames())
			{
				objectPool.put(name, createObject(props.getProperty(name)));
			}
		}
		catch(Exception ex)
		{
			System.out.println("读取" + fileName + "异常");
		}
	}
	public Object getObject(String name)
	{
		return objectPool.get(name);
	}
	public static void main(String[] args) throws Exception
	{
		var pf = new ObjectPoolFactory();
		pf.initPool("obj.txt");
		System.out.println(pf.getObject("a"));
		System.out.println(pf.getObject("b"));
	}
}
