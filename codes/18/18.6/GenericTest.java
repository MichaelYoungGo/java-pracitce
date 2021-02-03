import java.util.Map;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;

public class GenericTest
{
	private Map<String, Integer> score;
	public static void main(String[] args) throws Exception
	{
		Class<GenericTest> clazz = GenericTest.class;
		Field f = clazz.getDeclaredField("score");
		// 直接使用getType()取出类型指定普通类型的成员有效
		Class<?> a = f.getType();
		//
		System.out.println("score的类型是：" + a);
		Type gType = f.getGenericType();
		if(gType instanceof ParameterizedType)
		{
			//强制类型转换
			var pType = (ParameterizedType) gType;
			//获取原始类型
			Type rType = pType.getRawType();
			System.out.println("原始类型是" + rType);
			//取得泛型的泛型参数
			Type[] tArgs = pType.getActualTypeArguments();
			System.out.println("泛型信息是：");
			for (var i = 0; i < tArgs.length; i++)
			{
				System.out.println("第" + i + "个泛型类型是：" + tArgs[i]);
			}
		}
		else 
		{
			System.out.println("获取泛型类型出错！！");
		}
	}
}
