abstract class Car {
	abstract void speed();
	abstract void size();
	abstract void prince();
}
class Tractor extends Car {
	@Override
	void speed(){
		System.out.println("20km/h");
	}
	@Override
	void size(){
		System.out.println("大型汽车");
	}
	@Override
	void prince(){
		System.out.println("太贵了，买不起！！");
	}
}
public class AbstractTest {
	public static void  main(String[] args){
		var tractor = new Tractor();
		tractor.speed();
	}
}
