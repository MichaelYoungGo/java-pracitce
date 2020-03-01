@FunctionalInterface
interface GraphInterface{
	int area();
}
public class  LambdaTest {
	void test(GraphInterface graph){
		System.out.println(graph.area());
	};
	public static void main(String[] args){
		var gt = new LambdaTest();
		gt.test(() -> {
			int hight = 5;
			int width = 4;
			return hight*width;
		});
	}
}
