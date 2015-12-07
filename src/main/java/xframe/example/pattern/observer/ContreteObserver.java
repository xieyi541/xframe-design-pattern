package xframe.example.pattern.observer;

public final class ContreteObserver implements Observer {//具体观察者

	public void update(Observable observable, Object arg) {
		System.out.println(this.toString() + " received notify.");
		
	}
}
