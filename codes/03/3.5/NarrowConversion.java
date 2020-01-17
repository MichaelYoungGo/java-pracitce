public class NarrowConversion {
	public static void main(String[] args){
		var iValue = 223;
		byte bValue = (byte) iValue;
	       	System.out.println(bValue);
		var dValue = 3.98;
		int tol = (int) dValue;
		System.out.println(tol);	
	}
}
