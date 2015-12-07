package xframe.example.pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

public class EagerSingletonTest {

	@Test
	public void testGetinstance(){
		//call EagerSingleton constructor method.
		//EagerSingleton
		System.out.println(EagerSingleton.message);//访问EagerSingleton类的静态成员变量之前，先执行类的初始化。
		EagerSingleton instance1 = EagerSingleton.getInstance();
		EagerSingleton instance2 = EagerSingleton.getInstance();
		Assert.assertEquals(instance1, instance2);
	}
}
