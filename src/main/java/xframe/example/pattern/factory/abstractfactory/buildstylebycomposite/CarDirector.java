package xframe.example.pattern.factory.abstractfactory.buildstylebycomposite;

public class CarDirector {

	private CarBuilder carBuilder;
	
	public CarDirector(CarBuilder carBuilder){
		this.carBuilder = carBuilder;
	}
	
	public Car direcCar(){//指导构建，关注构建过程
		Car car = new Car();
		car.setEngine(carBuilder.buildEngine());
		car.setSeat(carBuilder.buildSeat());
		car.setTyre(carBuilder.buildTyre());
		return car;
	}
}
