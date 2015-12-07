package xframe.example.pattern.flyweight.composite;

public class ContreteFlyweight extends Flyweight{

	private Character innerState;
	
	ContreteFlyweight(Character c){
		this.innerState = c;
	}
	
	@Override
	public void operate(String outState) {
		if(outState.equals("error")){
			System.err.print(innerState);
		}else if(outState.equals("info")){
			System.out.print(innerState);
		}
		
	}
}
