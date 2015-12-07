package xframe.example.pattern.singleton;

public class LazySingleton {
	
	public static String msg = "LazySingleton";

	private LazySingleton(){
		System.out.println("call LazySingleton constructor.");
	};
	
	private static class Holder{
		private static LazySingleton instance = new LazySingleton();
	}
	
	public static LazySingleton getInstance(){
		return Holder.instance;
	}
}
