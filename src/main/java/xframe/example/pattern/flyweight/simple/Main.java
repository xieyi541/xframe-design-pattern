package xframe.example.pattern.flyweight.simple;

public class Main {

	public static void main(String[] args) {
		FlyweightFactory factory = FlyweightFactory.getInstance();
		Flyweight coffeeFlavor = factory.getFlyweight("coffee");
		Flyweight milkFlavor = factory.getFlyweight("milk");
		Flyweight chocolateFlavor = factory.getFlyweight("chocolate");
		
		coffeeFlavor.operate("1");//外部状态为订单号
		coffeeFlavor.operate("2");
		milkFlavor.operate("3");
		coffeeFlavor.operate("4");
		chocolateFlavor.operate("5");
		
		System.out.println("-----------------check------------------");
		factory.checkFlyweight();
	}
}
