package xframe.example.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		Subject real = new RealSubject();
		Subject dynamicProxy = (Subject)Proxy.newProxyInstance(real.getClass().getClassLoader(), new Class[]{Subject.class}, new MyInvocationHandler(real));
		System.out.println(dynamicProxy.getClass().getName());
		dynamicProxy.run();
		dynamicProxy.doOther();
		
		//Exception in thread "main" java.lang.IllegalArgumentException: object is not an instance of declaring class
		/*Other other = new Other();
	    dynamicProxy = (Subject)Proxy.newProxyInstance(real.getClass().getClassLoader(), new Class[]{Subject.class}, new MyInvocationHandler(other));
		System.out.println(dynamicProxy.getClass().getName());
		dynamicProxy.run();
		dynamicProxy.doOther();*/
		
	}
}
