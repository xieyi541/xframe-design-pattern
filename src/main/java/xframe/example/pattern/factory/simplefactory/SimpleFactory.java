package xframe.example.pattern.factory.simplefactory;

public class SimpleFactory {

//	private SimpleFactory(){
//		
//	}
//	
//	private static SimpleFactory instance = new SimpleFactory();
//	
//	public static SimpleFactory getInstance(){
//		return instance;
//	}
	
	public static Car createCar(String type){
		//return new Car();
		if(type.equals("benz")){
			return new Benz();
		}else if(type.equals("byd")){
			return new Byd();
		}else{
			return null;
		}
	}
}
