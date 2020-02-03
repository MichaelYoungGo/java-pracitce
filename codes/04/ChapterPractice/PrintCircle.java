import java.lang.Math;
public class PrintCircle{
	public static void main(String[] args){
		paint(10);
	}
	public static void paint(int r){
		int y = r * 2;
		int x = 0;
		int c = 0;
		int z = 2;
		for (int j = r * 2; j >= 0; j -= z){
			x = getX(r, y);
			System.out.print(getSpace(x) + "*");
			c = (r - x ) * 2;
			System.out.println(getSpace(c) + "*");
			y -=z;
		}
	}
	public static int getX(int r, int y){
		int h = y -r;
		double l = Math.sqrt((r*r)-(h*h));
		return (int)Math.round(r-l);
	}
	public static String getSpace(int i){
		String s = " ";
	       	for (int j = 0; j < i; j++){
			s += " ";
		}
		return s;
	}
}
