import java.util.HashSet;

public class CollectionStream {
	public static void main(String[] args){
		var books = new HashSet();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂的IOS讲义");
		books.add("疯狂的Ajax讲义");
		books.add("疯狂的Android讲义");
		System.out.println(books.stream()
				.filter(ele->((String) ele).contains("疯狂"))
				.count()
				);
		System.out.println(books.stream()
				.filter(ele->((String) ele).contains("Java"))
				.count()
				);
	}
}
