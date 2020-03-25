import java.util.Collections;
import java.util.HashMap;

public class UnmodifiableTest {
	public static void main(String[] args){
		var unmodifiableList = 	Collections.emptyList();
		var unmodifiableSet = Collections.singleton("疯狂Java讲义");
		//创建一个普通的MAp对象
		var scores = new HashMap();
		scores.put("语文", 80);
		scores.put("数学", 82);
		//返回普通的Map对象对应的不可变版本
		var unmodifiableMap = Collections.unmodifiableMap(scores);

		unmodifiableList.add("测试元素");
		unmodifiableSet.add("测试元素");
		unmodifiableMap.put("语文", 90);
	}
}
