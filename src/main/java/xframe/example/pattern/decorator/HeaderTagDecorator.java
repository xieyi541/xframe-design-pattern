package xframe.example.pattern.decorator;

public class HeaderTagDecorator extends Decorator {

	public HeaderTagDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.println("<head></head>");
		component.print();
	}

}
