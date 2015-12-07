package xframe.example.pattern.observer;

public class Main {

	public static void main(String[] args) {
		Observable subject = new ContreteObservable();
		Observer observer1 = new ContreteObserver();
		Observer observer2 = new ContreteObserver();
		Observer observer3 = new ContreteObserver();
		
		subject.add(observer1);
		subject.add(observer2);
		subject.add(observer3);
		
		subject.setChanged();
		subject.notifyObservers(null);
		
		System.out.println(observer1.toString());
		System.out.println(observer2.toString());
		System.out.println(observer3.toString());
		
	}
}
