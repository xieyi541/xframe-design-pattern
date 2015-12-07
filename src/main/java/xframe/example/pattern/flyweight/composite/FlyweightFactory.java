package xframe.example.pattern.flyweight.composite;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class FlyweightFactory {

	private Map<Character, Flyweight> map = new HashMap<Character, Flyweight>();
	
	private static FlyweightFactory instance = new FlyweightFactory();
	private FlyweightFactory(){
		
	}
	
	public static FlyweightFactory getInstance(){
		return instance;
	}
	private synchronized Flyweight getFlyweight(Character  innerState){
		if(map.containsKey(innerState)){
			return map.get(innerState);
		}else{
			Flyweight flyweight = new ContreteFlyweight(innerState);
			map.put(innerState, flyweight);
			return flyweight;
		}
	}
	
	public void checkFlyweight(){
		
		for(Entry<Character, Flyweight> entry: map.entrySet()){
			System.out.println(entry.getKey());
		}
	}
	
	public Flyweight add(String complex){
		CompositeFlyweight compositeFlyweight = new CompositeFlyweight();
		for(int i =0 ; i<complex.length(); i++){
			Flyweight contrete = this.getFlyweight(complex.charAt(i));
			compositeFlyweight.add(contrete);
		}
		return compositeFlyweight;
	}
}
