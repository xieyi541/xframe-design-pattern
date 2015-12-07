package xframe.example.pattern.factory.abstractfactory.buildstylebyextends.builder;

import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.component.EconomicEngine;
import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.component.EconomicSeat;
import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.component.EconomicTyre;
import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.component.Engine;
import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.component.Seat;
import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.component.Tyre;
import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.CarBuilder;


//抽象工厂方法用来生成某一风格的产品系列
//建造者用来建造产品系列
public class EconomicCarBuilder implements CarBuilder{

	public Engine buildEngine() {
		return new EconomicEngine();
	}

	public Seat buildSeat() {
		return new EconomicSeat();
	}

	public Tyre buildTyre() {
		return new EconomicTyre();
	}
}
