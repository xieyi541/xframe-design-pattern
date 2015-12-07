package xframe.example.pattern.decorator;

public class HtmlTagDecorator extends Decorator {

	public HtmlTagDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.println("<html>");
		super.component.print();
		System.out.println("</html>");
	}

	
}
