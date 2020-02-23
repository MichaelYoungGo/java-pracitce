public class Cow {
	private double weight;
	public Cow(){}
	public Cow(double weight)
	{
		this.weight = weight;
	}
	private class Cowleg {
		private double length;
		private String color;
		public Cowleg(){}
		public Cowleg(double length, String color){
			this.length = length;
			this.color = color;
		}
		public void info(){
			System.out.println("当前牛腿颜色是：" + color + ", 高：" + length);
			System.out.println("本牛腿所在奶牛牛重：" + weight);
		}
	}
	public void test(){
		var cl = new Cowleg(1.12, "黑白相同");
		cl.info();
	}
	public static void main(String[] args){
		var cow = new Cow(378.9);
		cow.test();
	}
}







