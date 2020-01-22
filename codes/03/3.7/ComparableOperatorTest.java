public class ComparableOperatorTest {
	public static void main(String[] args) {
		System.out.println("5是否大于4.0："+ (5>4.0));
		System.out.println("5和5.0是否相同:"+ (5==5.0));
		System.out.println("true和false是否相同:"+(true == false));
		var t1 = new ComparableOperatorTest();
		var t2 = new ComparableOperatorTest();
		System.out.println("t1是否等于t2:"+(t1 == t2));
		var t3 = t1;
		System.out.println("t3是否等于t1:"+(t1 == t3));
	}
}
