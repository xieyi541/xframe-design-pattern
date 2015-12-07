package xframe.example.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{

	private Object real;
	
	public MyInvocationHandler(Object real){
		this.real = real;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		if(method.getName().equals("run")){
			System.out.println("before call method.");
			Object ret = method.invoke(real, args);
			System.out.println("after call method");
			return ret;
		}else{
			return method.invoke(real, args);
			//return null;
		}
		
	}

	
}
