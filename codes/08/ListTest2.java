import java.util.ArrayList;

class A {
	public boolean equals(Object obj){
		return true;
	}
}
public class ListTest2 {
	public static void main(String[] args){
		var books = new ArrayList();
		books.add("轻量级JavaEE企业级应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		System.out.println(books);
		//删除集合中的A对象，将导致第一个元素被删除
		books.remove(new A());
		books.remove(new A());
		System.out.println(books);
	}
}
