package xframe.example.pattern.strategy;

public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void contextMethod(){
		strategy.strategyMethod();
	}
}
