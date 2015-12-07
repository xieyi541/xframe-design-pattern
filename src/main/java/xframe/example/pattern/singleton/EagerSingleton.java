package xframe.example.pattern.singleton;

public class EagerSingleton {
	
	private static EagerSingleton instance = new EagerSingleton();
	public static String message =  "EagerSingleton";

	private EagerSingleton(){
		System.out.println("call EagerSingleton constructor method.");
	}
	
	public static EagerSingleton getInstance(){
		return instance;
	}
	
}
