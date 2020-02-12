class Person {
	public void feed(Animal a){
		System.out.println("feeding.....");
		a.eat();
	}
}
class Animal {
	public void eat(){
		System.out.println("吃一般的食物！！");
	}
}
class Dog extends Animal {
	public void eat(){
		System.out.println("吃骨头");
	}
}
class Cat extends Animal {
	public void eat() {
		System.out.println("吃鱼");
	}
}

public class AnimalDemo {
	public static void main(String[] args){
		Person p = new Person();
		Dog d = new Dog();
		Cat c = new Cat();
		p.feed(d);
		p.feed(c);
	}
}
