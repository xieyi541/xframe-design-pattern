package xframe.example.pattern.factory.factorymethod;

public class BenzFactory extends CarFactory{

	private BenzFactory(){
		
	}
	
	private static BenzFactory instance = new BenzFactory();
	
	public static BenzFactory getInstance(){
		return instance;
	}
	
	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Benz();
	}

	
}
