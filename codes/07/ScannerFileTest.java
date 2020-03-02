import java.util.Scanner;
import java.io.File;

public class ScannerFileTest {
	public static void main(String[] args) throws Exception {
		var sc = new Scanner(new File("ScannerFileTest.java"));
		System.out.println("ScannerFileTest.java的内容如下：");
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
	}
}
