package xframe.example.pattern.factory.abstractfactory.buildstylebyextends.builder;

import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.component.Engine;
import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.component.LuxuryEngine;
import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.component.LuxurySeat;
import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.component.LuxuryTyre;
import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.component.Seat;
import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.component.Tyre;
import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.CarBuilder;

public class LuxuryCarBuilder implements CarBuilder {

	public Engine buildEngine() {
		return new LuxuryEngine();
	}

	public Seat buildSeat() {
		return new LuxurySeat();
	}

	public Tyre buildTyre() {
		return new LuxuryTyre();
	}

}
