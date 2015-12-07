package xframe.example.pattern.proxy.statical;

public class ProxySubject implements  Subject{

	private RealSubject realSubject;

	public ProxySubject(RealSubject realSubject) {
		super();
		this.realSubject = realSubject;
	}
	
	public void doWork() {
		System.out.println("++++++++++++");
		realSubject.doWork();
		System.out.println("++++++++++++");
	}
}
