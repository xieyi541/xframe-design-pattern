package xframe.example.pattern.prototype;

import java.util.Date;

public class DeepMain {
	public static void main(String[] args) throws Exception {
		//原型模式通过Object中的clone本地方法实现原型拷贝
		//克隆拷贝通过底层内存拷贝来实现原型复制，效率非常高
		Date date = new Date(12312321331L);
		String name = "shallow";
		Shallow proto = new Shallow(name, date );
		Shallow cloned = (Shallow)(proto.clone());
		
		System.out.println("------------proto -----------");
		System.out.println(proto);
		System.out.println(proto.getName());
		System.out.println(proto.getDate());
		System.out.println();
		
		System.out.println("------------cloned -----------");
		
		System.out.println(cloned);
		System.out.println(cloned.getName());
		System.out.println(cloned.getDate());
		
		System.out.println("------------changed proto value --------------");
		date.setTime(23432432423L);
		
		
		System.out.println("------------After changed proto, proto value --------------");
		System.out.println(proto);
		System.out.println(proto.getName());
		System.out.println(proto.getDate());
		
		System.out.println("------------After changed proto, cloned value --------------");
		System.out.println(cloned);
		System.out.println(cloned.getName());
		System.out.println(cloned.getDate());
	}
}
