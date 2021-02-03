import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Collections;
import java.util.HashSet;

public class CrazyitMap<K,V>
{
	//创建一个线程安全的HashMap
	public Map<K,V> map = Collections.synchronizedMap(new HashMap<K,V>());
	//根据value来删除指定项
	public synchronized void removeByValue(Object value)
	{
		for (var key : map.keySet())
		{
			if(map.get(key) == value || map.get(key).equals(value))
			{
				map.remove(key);
				break;
			}
		}
	}
	//获取所有的value组成的set集合
	public synchronized Set<V> valueSet()
	{
		Set<V> result = new HashSet<>();
		map.forEach((key, value) -> result.add(value));
		return result;
	}
	//根据value查找key
	public synchronized K getKeyByValue(V val)
	{
		for(var key : map.keySet())
		{
			if (map.get(key) == val || map.get(key).equals(val))
			{
				return key;
			}
		}
		return null;
	}
	// 实现put()方法，该方法不允许value重复
	public synchronized V put(K key, V value)
	{
		for (var val : valueSet())
		{
			if (val.equals(value) && val.hashCode() == value.hashCode())
			{
				throw new RuntimeException("CrazyitMap实例中不允许有重复value");
			}
		}
		return map.put(key, value);
	}

}
