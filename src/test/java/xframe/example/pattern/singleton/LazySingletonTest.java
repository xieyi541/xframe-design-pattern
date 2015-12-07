package xframe.example.pattern.singleton;

import junit.framework.Assert;

import org.junit.Test;

public class LazySingletonTest {

	@Test
	public void testGetinstance(){
		System.out.println(LazySingleton.msg);
		LazySingleton inst1 = LazySingleton.getInstance();
		LazySingleton inst2 = LazySingleton.getInstance();
		Assert.assertEquals(inst1, inst2);
	}
}
