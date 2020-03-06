import java.util.Arrays;

public class StringReg {
	public static void main(String[] args){
		String[] msgs = {
			"Java has regular expression in 1.4",
			"regular expression now expressing in java",
			"Java represses oracular expressions"
		};
		for (var msg : msgs){
			System.out.println(msg.replaceFirst("re\\w", "哈哈:)"));
			System.out.println(Arrays.toString(msg.split(" ")));
		}
	}
}
