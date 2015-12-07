package xframe.example.pattern.factory.abstractfactory.buildstylebycomposite;



public class AbstractFactoryMain {

	public static void main(String[] args) {
		CarBuilder luxCBuilder = new CarBuilder(Fanshion.ECONOMIC);
		//CarBuilder ecoBuilder = new EconomicCarBuilder();
		CarDirector carDirector = new CarDirector(luxCBuilder);
		Car car = carDirector.direcCar();
		
		
	}
}
