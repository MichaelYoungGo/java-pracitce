import java.util.TreeSet;

class Z implements Comparable {
	int age;
	public Z(int age ){
		this.age = age;
	}
	public boolean equals(Object obj ) {
		return true;
	}
	public int compareTo(Object obj ){
		return 1;
	}
}

public class TreeSetTest2 {
	public static void main(String[] args){
		var set = new TreeSet();
		var zl = new Z(6);
		set.add(zl);
		System.out.println(set.add(zl));
		System.out.println(set);
		((Z) (set.first())).age = 9;
		System.out.println(((Z)(set.last())).age);
	}
}
