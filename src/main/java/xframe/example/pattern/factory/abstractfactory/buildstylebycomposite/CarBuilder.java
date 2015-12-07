package xframe.example.pattern.factory.abstractfactory.buildstylebycomposite;

import xframe.example.pattern.factory.abstractfactory.buildstylebycomposite.component.Engine;
import xframe.example.pattern.factory.abstractfactory.buildstylebycomposite.component.Seat;
import xframe.example.pattern.factory.abstractfactory.buildstylebycomposite.component.Tyre;




public class CarBuilder {

	private Fanshion fanshion;
	public Engine buildEngine(){
		return Engine.getInstance().createEngine(fanshion);
	}
	public CarBuilder(Fanshion fanshion) {
		this.fanshion = fanshion;
	}
	public Seat buildSeat(){
		return Seat.getInstance().createSeat(fanshion);
	}
	public Tyre buildTyre(){
		return Tyre.getInstance().createTyre(fanshion);
	}
	
}
