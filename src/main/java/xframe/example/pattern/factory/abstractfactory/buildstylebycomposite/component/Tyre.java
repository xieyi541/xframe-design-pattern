package xframe.example.pattern.factory.abstractfactory.buildstylebycomposite.component;

import xframe.example.pattern.factory.abstractfactory.buildstylebycomposite.Fanshion;


public class Tyre {

	private static Tyre tyre = new Tyre();
	
	Tyre(){
		
	}
	
	public static Tyre getInstance(){
		return tyre;
	}
	
	public  static Tyre createTyre(Fanshion fanshion){
		if(fanshion == Fanshion.ECONOMIC){
			return new EconomicTyre();
		}else if(fanshion == Fanshion.LUXURY){
			return new LuxuryTyre();
		}else{
			return null;
		}
	}
}
