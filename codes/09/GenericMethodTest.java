import java.util.Collection;
import java.util.ArrayList;

public class GenericMethodTest {
	static <T> void fromArrayToCollection(T[] a, Collection<T> c){
		for (T o: a){
			c.add(o);
		}
	}
	public static void main(String[] args){
		var oa = new Object[100];
		Collection<Object> co = new ArrayList<>();

		fromArrayToCollection(oa, co);
	}
}
