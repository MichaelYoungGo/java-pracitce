import java.util.Calendar;

public class CalenderTest {
	public static void main(String[] args){
		var c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		c.set(2003, 10, 23, 12, 32, 23);
		c.add(1, -1);
		c.roll(2, -8);
		System.out.println(c.getTime());
	}
}
