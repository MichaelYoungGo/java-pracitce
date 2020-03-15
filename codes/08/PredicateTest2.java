import java.util.HashSet;
import java.util.Collection;
import  java.util.function.Predicate;

public class PredicateTest2 {
	public static void main(String[] args){
		var books = new HashSet();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		//统计书中包含“疯狂”的图书数量
		System.out.println(calAll(books, ele -> ((String) ele).contains("疯狂")));
		//统计书中包含“Java”的图书数量
		System.out.println(calAll(books, ele -> ((String) ele).contains("Java")));
	}
		public static int calAll(Collection books, Predicate p){
			int total = 0;
			for(var obj : books){
				//使用Pridicate的test()方法判断对象是否满足Predicate的指定条件
				if(p.test(obj)) {
					total++;
				}
			}
			return total;
		}
}
