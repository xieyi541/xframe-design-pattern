package xframe.example.pattern.factory.abstractfactory.buildstylebyextends;

public class CarDirector {

	private CarBuilder carBuilder;
	
	public CarDirector(CarBuilder carBuilder){
		this.carBuilder = carBuilder;
	}
	
	public Car direcCar(){
		Car car = new Car();
		car.setEngine(carBuilder.buildEngine());
		car.setSeat(carBuilder.buildSeat());
		car.setTyre(carBuilder.buildTyre());
		return car;
	}
}
