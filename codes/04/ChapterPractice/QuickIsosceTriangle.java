public class QuickIsosceTriangle{
	public static void main(String[] args){
		int size = 6;
		for(int i = 1; i < size; i++){
			for(int j = size - i; j > 0; j--){
				System.out.print(" ");
			}
			for (int num = 1; num <= i; num++){
				System.out.print("* ");
			}				
			System.out.print("\n");
		}
	}
}
