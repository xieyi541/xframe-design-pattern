package xframe.example.pattern.flyweight.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeFlyweight extends Flyweight{
	
	CompositeFlyweight(){
		
	}

	private List<Flyweight> list = new ArrayList<Flyweight>();
	
	
	public void add(Flyweight flyweight){
		list.add(flyweight);
	}
	
	@Override
	public void operate(String outState) {
		for(Flyweight f: list){
			f.operate(outState);
		}
		if(outState.equals("error")){
			System.err.println();
		}else if(outState.equals("info")){
			System.out.println();
		}
	}
}
