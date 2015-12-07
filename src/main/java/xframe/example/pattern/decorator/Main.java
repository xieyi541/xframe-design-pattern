package xframe.example.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		Component printContent  = new HtmlTagDecorator(new HeaderTagDecorator(new BodyTagDecorator(new PTagDecorator(new  ConcreteComponent("hello,world")))));;
		printContent.print();
	}
}
