import java.lang.invoke.MethodHandles;
import java.util.Arrays;

class User {
	String name;
	static int MAX_AGE;
}
public class VarHandleTest {
	public static void main(String[] args) throws Throwable{
		var sa = new String[] {"Java", "Kotlin", "Go"};
		var avh = MethodHandles.arrayElementVarHandle(String[].class);
		var r = avh.compareAndSet(sa, 2, "Go", "Lua");
		System.out.println(r);
		System.out.println(sa);
		System.out.println(Arrays.toString(sa));

		var vh1 = MethodHandles.lookup().findVarHandle(User.class, "name", String.class);
		var user = new User();
		System.out.println(vh1.get(user));
		vh1.set(user, "孙悟空");
		System.out.println(user.name);

		var vh2 = MethodHandles.lookup().findStaticVarHandle(User.class, "MAX_AGE", int.class);
		System.out.println(vh2.get());
		vh2.set(100);
		System.out.println(User.MAX_AGE);
	}
}
