package xframe.example.pattern.chainofresp;

import java.util.Random;

public class TimerPlayer extends Handler {

	private int num;

	public TimerPlayer(int num){
		this.num = num;
	}
	
	@Override
	public void handle(Request<?> request, Response resp) {
		if(TimerDrumBeaterMain.stop==true){
			System.err.println("player of "+num+" drinked");
		}else{
			try {
				Thread.sleep(new Random().nextInt(10));
				System.out.println("player of "+num+" pass");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			next(request,resp);
		}

	}

}
