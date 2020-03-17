import java.util.EnumSet;

enum Season {
	SPRING, SUMMER, FALL, WINTER
}
public class EnumSetTest {
	public static void main(String[] args){
		//创造一个Enum集合，集合元素就是Season枚举类的全部枚举值
		var es1 = EnumSet.allOf(Season.class);
		System.out.println(es1);
		//创造一个EnumSet空集合，指定其集合元素是Season类的枚举值
		var es2 = EnumSet.noneOf(Season.class);
		System.out.println(es2);
		//手动添加两个元素
		es2.add(Season.WINTER);
		es2.add(Season.SPRING);
		System.out.println(es2);
		//以指定枚举类创建EnumSet集合
		var es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
		System.out.println(es3);
		var es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
		System.out.println(es4);
		//
		var es5 = EnumSet.complementOf(es4);
	}
}
