import java.lang.Math;
public class PrintCircle{
	public static void main(Sting[] args){
		paint(10);
	}
	public static void paint(int r){
		int y = r * 2；
		int x = 0;
		int c = 0;
		int z = 2;
		for (int j = r * 2; j >= 0; j -= z){
			x = getX(r, y);
			System.out.print(getSpace(x) + "*");
			c = (r - x ) * 2;

		}
	}
}
