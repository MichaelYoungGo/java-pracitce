import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		var nums = new TreeSet();
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		System.out.println(nums);
		System.out.println(nums.first());
		System.out.println(nums.last());
	}
}
