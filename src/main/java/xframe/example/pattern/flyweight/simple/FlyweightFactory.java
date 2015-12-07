package xframe.example.pattern.flyweight.simple;

import java.util.HashMap;
import java.util.Map.Entry;

public class FlyweightFactory {

	private HashMap<String, Flyweight> map = new HashMap<String, Flyweight>();
	private static FlyweightFactory instance = new FlyweightFactory();
	private FlyweightFactory(){
		
	}
	
	public static FlyweightFactory getInstance(){
		return instance;
	}
	
	public synchronized Flyweight getFlyweight(String intrincState){
		if(map.containsKey(intrincState)){
			return map.get(intrincState);
		}else{
			Flyweight flyweight = new ContreteFlyweight(intrincState);
			map.put(intrincState, flyweight);
			return flyweight;
		}
	}
	
	public void checkFlyweight(){
		
		for(Entry<String, Flyweight> entry: map.entrySet()){
			System.out.println(entry.getKey());
		}
		
		
		
	}
}
