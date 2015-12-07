package xframe.example.pattern.observer.java;

import java.util.Observable;
import java.util.Observer;

public class JavaMain {

	public static void main(String[] args) {
		ContreteObservable subject = new ContreteObservable();
		
		Observer observer = new Observer() {
			
			public void update(Observable o, Object arg) {
				System.out.println(this.toString());
				
			}
		};
		System.out.println(observer.toString());
		subject.addObserver(observer);
		subject.setChanged();
		subject.notifyObservers();
	}
}
