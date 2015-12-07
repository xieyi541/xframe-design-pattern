package xframe.example.pattern.strategy;

public class Main {

	public static void main(String[] args) {
		Context ctx = new Context(new ContreteStrategy());
		ctx.contextMethod();
	}
}
