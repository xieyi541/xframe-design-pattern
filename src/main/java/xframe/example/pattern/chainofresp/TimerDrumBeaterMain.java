package xframe.example.pattern.chainofresp;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDrumBeaterMain {
	
	public static volatile boolean stop = false;

	public static void main(String[] args) {
		
		Handler timerPlayer1 = new TimerPlayer(1);
		Handler timerPlayer2 = new TimerPlayer(2);
		Handler timerPlayer3 = new TimerPlayer(3);
		Handler timerPlayer4 = new TimerPlayer(4);
		Handler timerPlayer5 = new TimerPlayer(5);
		Handler timerPlayer6 = new TimerPlayer(6);
		Handler timerPlayer7 = new TimerPlayer(7);
		Handler timerPlayer8 = new TimerPlayer(8);
		//无限循环
		timerPlayer1.setNextor(timerPlayer2);
		timerPlayer2.setNextor(timerPlayer3);
		timerPlayer3.setNextor(timerPlayer4);
		timerPlayer4.setNextor(timerPlayer5);
		timerPlayer5.setNextor(timerPlayer6);
		timerPlayer6.setNextor(timerPlayer7);
		timerPlayer7.setNextor(timerPlayer8);
		timerPlayer8.setNextor(timerPlayer1);
		
		
		
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("Drum beating stopped!");
	            stop = true;
	            timer.cancel(); //Terminate the timer thread
			}
		}, 500);
		
		timerPlayer1.handle(null, null);
	}
}
