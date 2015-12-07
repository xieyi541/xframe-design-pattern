package xframe.example.pattern.factory.abstractfactory.buildstylebycomposite.component;

import xframe.example.pattern.factory.abstractfactory.buildstylebycomposite.Fanshion;


public class Seat {

	private static Seat seat = new Seat();
	
	Seat(){
		
	}
	
	public static Seat getInstance(){
		return seat;
	}
	
	public  static Seat createSeat(Fanshion fanshion){
		if(fanshion == Fanshion.ECONOMIC){
			return new EconomicSeat();
		}else if(fanshion == Fanshion.LUXURY){
			return new LuxurySeat();
		}else{
			return null;
		}
	}
}
