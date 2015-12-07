package xframe.example.pattern.factory.factorymethod;

public class BMWFactory extends CarFactory{

	private BMWFactory(){
		
	}
	
	private static BMWFactory instance = new BMWFactory();
	
	public static BMWFactory getInstance(){
		return instance;
	}
	
	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new BMW();
	}

	
}
