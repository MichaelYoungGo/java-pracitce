public class ConstructorTest {
	public String name;
	public int count;
	public ConstructorTest(String name, int count){
		this.name = name;
		this.count = count;
	}
	public static void main(String[] args){
		var tc = new ConstructorTest("疯狂的JAVA讲义", 9000);
		System.out.println(tc.name);
		System.out.println(tc.count);
	}
}
