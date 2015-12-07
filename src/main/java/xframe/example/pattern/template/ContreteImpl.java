package xframe.example.pattern.template;

public class ContreteImpl extends AbstractTemplate{

	@Override
	protected void doOperation1() {
		System.out.println("call ContreteImpl method of doOperation1");
		
	}
	
	@Override
	protected void doOperation2() {
		System.out.println("call ContreteImpl method of doOperation2");
	}
	
	@Override
	protected void doOperation3() {
		System.out.println("call ContreteImpl method of doOperation3");
	};
	
	@Override
	protected void hook1() {
		System.out.println("call ContreteImpl method of hook1");
	}
}
