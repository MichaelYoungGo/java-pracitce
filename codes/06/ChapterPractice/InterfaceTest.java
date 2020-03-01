interface GraphInterface {
	int circumference();
	int area();
}
public class InterfaceTest{
	public void test(GraphInterface graph){
		System.out.println("图形的面积：" + graph.circumference());
		System.out.println("图形的周长：" + graph.area());
	}
	public static void main(String[] args){
		var it = new InterfaceTest();
		it.test(new GraphInterface(){
			final int hight = 5;
			final int width = 4;
			@Override
			public int circumference(){
				return 2*(hight + width);
			}
			@Override
			public int area(){
				return hight*width;
			}
		});
	}
}
