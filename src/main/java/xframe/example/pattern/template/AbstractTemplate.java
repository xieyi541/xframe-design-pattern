package xframe.example.pattern.template;

public abstract class AbstractTemplate {

	//模板方法
	public final void templateMethod(){
		doOperation1();
		hook1();
		doOperation2();
		hook2();
		doOperation3();
		doPrivateSth();
	}
	
	//抽象方法需要子类实现，protected
	protected abstract void doOperation1();
	protected abstract void doOperation2();
	protected abstract void doOperation3();
	
	//钩子方法，默认为空实现，子类可以扩展
	protected void hook1(){
		//默认实现
		System.out.println("call AbstractTemplate method of hook1");
	}
	protected void hook2(){
		//默认实现
		System.out.println("call AbstractTemplate method of hook2");
	}
	
	//模板类中需要使用到的私有方法
	private void doPrivateSth(){
		System.out.println("call AbstractTemplate method of doPrivateSth");
	}
	
	
}
