import java.util.HashSet;

public class IteratorEach {
	public static void main(String[] args){
		var books = new HashSet();
		books.add("三国演义");
		books.add("水浒传");
		books.add("红楼梦");
		books.add("西游记");
		var it = books.iterator();
		it.forEachRemaining(obj -> System.out.println("迭代集合元素:"+
					obj));
	}
}
