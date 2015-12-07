package xframe.example.pattern.decorator;

public class BodyTagDecorator extends Decorator {

	public BodyTagDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.println("<body>");
		super.component.print();
		System.out.println("</body>");
	}

	
}
