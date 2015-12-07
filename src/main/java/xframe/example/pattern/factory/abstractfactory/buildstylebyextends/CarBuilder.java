package xframe.example.pattern.factory.abstractfactory.buildstylebyextends;

import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.component.Engine;
import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.component.Seat;
import xframe.example.pattern.factory.abstractfactory.buildstylebyextends.component.Tyre;


public interface CarBuilder {

	public Engine buildEngine();
	public Seat buildSeat();
	public Tyre buildTyre();
	
}
