package xframe.example.pattern.factory.factorymethod;

public class BydFactory extends CarFactory{

	private BydFactory(){
		
	}
	
	private static BydFactory instance = new BydFactory();
	
	public static BydFactory getInstance(){
		return instance;
	}
	
	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Byd();
	}

	
}
