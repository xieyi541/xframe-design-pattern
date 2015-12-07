package xframe.example.pattern.bridge;

public class Main {

	public static void main(String[] args) {
		//客户端调用Abstraction中的抽象方法，通过组合的方式构造具体的refined abstraction【装配好具体的实现者】
		Abstraction abstraction  = new RefinedAbstraction(new ContreteImplementor());
		abstraction.doWork();
	}
}
