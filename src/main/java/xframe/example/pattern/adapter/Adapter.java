package xframe.example.pattern.adapter;

public class Adapter implements Target{

	public Adaptee adaptee;
	
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	
	public void operation() {
		// TODO Auto-generated method stub
		adaptee.operation();
	}

	
}
