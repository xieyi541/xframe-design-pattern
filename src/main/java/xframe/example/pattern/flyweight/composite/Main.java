package xframe.example.pattern.flyweight.composite;

public class Main {

	public static void main(String[] args) throws Exception {
		Flyweight composite1 = FlyweightFactory.getInstance().add("read");
		
		Flyweight composite2 = FlyweightFactory.getInstance().add("book");
		Flyweight composite3 = FlyweightFactory.getInstance().add("apple");
		Flyweight composite4 = FlyweightFactory.getInstance().add("pear");
		Flyweight composite5 = FlyweightFactory.getInstance().add("banana");
		Flyweight composite6 = FlyweightFactory.getInstance().add("peach");
		
		composite1.operate("info");
		Thread.sleep(100);
		composite2.operate("info");
		Thread.sleep(100);
		composite3.operate("error");
		Thread.sleep(100);
		composite4.operate("info");
		Thread.sleep(100);
		composite5.operate("error");
		Thread.sleep(100);
		composite6.operate("info");
		System.out.println("------------check flyweight--------------");
		FlyweightFactory.getInstance().checkFlyweight();
		
	}
}
