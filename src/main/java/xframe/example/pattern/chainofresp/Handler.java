package xframe.example.pattern.chainofresp;

public abstract class Handler {

	protected Handler nextor;
	
	public Handler getNextor() {
		return nextor;
	}

	public void setNextor(Handler nextor) {
		this.nextor = nextor;
	}

	//首先调用自身的handle 方法，在调用next方法 
	public abstract void handle(Request<?> request, Response resp);
	
	public void next(Request request, Response resp){
		if(nextor!=null){
			nextor.handle(request,resp);
		}else{
			System.out.println("chain of responsibility end!");
			return;
		}
	}
}
