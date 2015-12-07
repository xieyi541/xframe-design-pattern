package xframe.example.pattern.chainofresp;

public class ContreteHandler extends Handler{

	public ContreteHandler(Handler handler){
		super.nextor = handler;
	}
	
	@Override
	public void handle(Request request, Response resp) {
		// TODO Auto-generated method stub
		System.out.println("Before do sth " + this.toString());
		next( request,  resp);
		System.out.println("After do sth " + this.toString());
	}
}
