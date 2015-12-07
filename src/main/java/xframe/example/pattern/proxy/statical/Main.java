package xframe.example.pattern.proxy.statical;

public class Main {
	public static void main(String[] args) {
		Subject subject = new ProxySubject(new RealSubject());
		subject.doWork();
	}
}
