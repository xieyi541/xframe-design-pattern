package xframe.example.pattern.factory.factorymethod;



public class FactoryMethodMain {
	public static void main(String[] args) {
		//与简单工厂相比，工厂方法能很好的遵循了开闭原则，
		//如果有新的产品需要加入，无需像简单工厂修改实现，只需新增即可
		
		Car benz = BenzFactory.getInstance().createCar();
		Car bmw = BMWFactory.getInstance().createCar();
		Car byd = BydFactory.getInstance().createCar();
	}
}
