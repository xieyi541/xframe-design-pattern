package xframe.example.pattern.flyweight.simple;

public class ContreteFlyweight extends Flyweight{

	//内涵状态
	private String intrinsicState;
	
	public ContreteFlyweight(String intrinsicState){
		this.intrinsicState = intrinsicState;
	}
	
	@Override
	public void operate(String extrinsicState) {
		System.out.println("intrinsic State = " + intrinsicState +
            ", extrinsic State = " + extrinsicState);
		
	}
}
