package xframe.example.pattern.factory.abstractfactory.buildstylebyextends;

import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.builder.EconomicCarBuilder;
import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.builder.LuxuryCarBuilder;


public class AbstractFactoryMain {

	public static void main(String[] args) {
		CarBuilder luxCBuilder = new LuxuryCarBuilder();
		//CarBuilder ecoBuilder = new EconomicCarBuilder();
		CarDirector carDirector = new CarDirector(luxCBuilder);
		Car car = carDirector.direcCar();
		
		
		CarBuilder ecoBuilder = new EconomicCarBuilder();
		carDirector = new CarDirector(luxCBuilder);
		car = carDirector.direcCar();
	}
}
