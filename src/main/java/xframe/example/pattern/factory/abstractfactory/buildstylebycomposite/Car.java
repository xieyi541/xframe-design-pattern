package xframe.example.pattern.factory.abstractfactory.buildstylebycomposite;

import xframe.example.pattern.factory.abstractfactory.buildstylebycomposite.component.Engine;
import xframe.example.pattern.factory.abstractfactory.buildstylebycomposite.component.Seat;
import xframe.example.pattern.factory.abstractfactory.buildstylebycomposite.component.Tyre;





//结合构造模式
public class Car {

	//发动机
	private Engine engine;
	
	//座椅
	private Seat seat;
	
	//轮胎
	private Tyre tyre;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	
	//款式：经济、商务、豪华
	//private Style style;
	
	
}
