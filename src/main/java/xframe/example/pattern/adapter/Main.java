package xframe.example.pattern.adapter;

public class Main {

	public static void main(String[] args) {
		Adapter adapter = new Adapter(new Adaptee());
		adapter.operation();
	}
}
