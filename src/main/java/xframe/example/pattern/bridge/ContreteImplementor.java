package xframe.example.pattern.bridge;

public class ContreteImplementor extends Implementor {
	
	@Override
	public void run() {
		System.out.println("call ContreteImplementor method of run.");
	}
}
