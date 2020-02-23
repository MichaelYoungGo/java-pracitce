import java.util.Arrays;
class Person {
	private int age;
	public Person(){}
	public Person(int age){
		this.age = age;
	}
}
public class FinalReferenceTest {
	public static void main(String[] args){
		final int[] iArr = {5, 6, 12, 9};
		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		iArr[2] = -9;
		System.out.println(Arrays.toString(iArr));
		final var p = new Person(45);
	}
}
