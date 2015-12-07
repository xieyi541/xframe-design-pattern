package xframe.example.pattern.factory.abstractfactory.buildstylebycomposite.component;

import xframe.example.pattern.factory.abstractfactory.buildstylebycomposite.Fanshion;


public class Engine {
	
	private static Engine engine = new Engine();
	
	Engine(){
		
	}
	
	public static Engine getInstance(){
		return engine;
	}
	
	public  static Engine createEngine(Fanshion fanshion){
		if(fanshion == Fanshion.ECONOMIC){
			return new EconomicEngine();
		}else if(fanshion == Fanshion.LUXURY){
			return new LuxuryEngine();
		}else{
			return null;
		}
	}

	

	
}
