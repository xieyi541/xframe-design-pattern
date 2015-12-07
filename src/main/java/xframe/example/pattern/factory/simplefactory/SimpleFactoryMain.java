package xframe.example.pattern.factory.simplefactory;


public class SimpleFactoryMain {
	public static void main(String[] args) {
		//通过参数来区分不同的产品类型
		Car benz = SimpleFactory.createCar("benz");
		Car byd = SimpleFactory.createCar("byd");
		
		//Car bmw = new Bmw();
	}
}
