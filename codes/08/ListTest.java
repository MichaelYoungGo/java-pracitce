import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args){
		var books = new ArrayList();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂的Android讲义");
		System.out.println(books);
		//将新字符串对象插入第二个位置
		books.add(1, new String("疯狂Ajex讲义"));
		for (var i = 0; i < books.size(); i++){
			System.out.println(books.get(i));
		}
		//删除第三个元素
		books.remove(2);
		System.out.println(books);
		//判断元素位置
		System.out.println(books.indexOf(new String("疯狂Ajex讲义")));
		//
	}
}
