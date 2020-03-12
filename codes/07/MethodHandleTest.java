import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles;

public class MethodHandleTest {
	private static void hello(){
		System.out.println("hello world");
	}
	private String hello(String name){
		System.out.println("执行带参数的helle" + name);
		return name + ",您好";
	}
	public static void main(String[] args) throws Throwable{	
		var type = MethodType.methodType(void.class);
		var mtd = MethodHandles.lookup().findStatic(MethodHandleTest.class, "hello", type);
		mtd.invoke();
		var mtd2 = MethodHandles.lookup().findVirtual(MethodHandleTest.class, "hello",
			       	MethodType.methodType(String.class, String.class));
		System.out.println(mtd2.invoke(new MethodHandleTest(), "孙悟空"));
	}
}
