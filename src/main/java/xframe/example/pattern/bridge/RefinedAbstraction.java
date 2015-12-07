package xframe.example.pattern.bridge;

public class RefinedAbstraction extends Abstraction{
	
	public RefinedAbstraction(Implementor impl){
		super.impl = impl;
	}

	@Override
	public void doWork() {
		impl.run();
	}
}
