package xframe.example.pattern.decorator;

public class PTagDecorator extends Decorator {

	public PTagDecorator(Component component) {
		super(component);
	}

	@Override
	public void print() {
		//前装饰
		System.out.println("<p>");
		component.print();
		System.out.println("</p>");
		//尾装饰
	}
}
