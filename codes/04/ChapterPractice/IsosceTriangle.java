import java.io.BufferedReader;
import java.io.InputStreamReader;
public class IsosceTriangle{
	private String[][] Triangle;
	private void buildTri(int size){
	//初始化等腰三角形
		int len = 2*size-1;
		Triangle = new String[size][len];
		for(var i = 0; i < size; i++){
			//去掉每行的null
			for(var z = 0; z < len; z++){
				Triangle[i][z] = " ";
			}
			//控制每行的*数量
			for(var j = 1; j <= 2*i+1; j++){
				for(var pos = (len-j)/2; pos<(len+j)/2; pos++) {
					Triangle[i][pos] = "*";
				}
			}
		}
	//打印出等腰三角形（偷懒了，应该重新定义一种方法，不应该在buildTri中打印）
		for(var i = 0; i < size; i++){
			for (var j = 0; j < len; j++){
				System.out.print(Triangle[i][j]);
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) throws Exception{
		var br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please input the size of isosceles triangle:");
		int size = Integer.parseInt(br.readLine());
		System.out.println("The isosceles triangle is as follow:" + size );
		var isoTri = new IsosceTriangle();
		isoTri.buildTri(size);


	}
}
