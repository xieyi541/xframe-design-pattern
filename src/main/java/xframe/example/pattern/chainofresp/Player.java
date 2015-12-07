package xframe.example.pattern.chainofresp;

public class Player extends Handler{

	private Integer seed;

	public Player(Integer seed, Handler nextor){
		this.seed = seed;
		super.nextor = nextor;
	}
	
	@Override
	public void handle(Request request, Response resp) {
		Integer predictNum  = (Integer)request.getValue();
		
		if(predictNum == seed){
			System.err.println("player of " + this.seed + " drink");
		}else{
			next(request,resp);
		}
	}
}
