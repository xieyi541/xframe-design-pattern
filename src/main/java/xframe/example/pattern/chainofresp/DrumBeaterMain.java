package xframe.example.pattern.chainofresp;

public class DrumBeaterMain {

	public static void main(String[] args) {
		Handler player1 = new Player(1, null);
		Handler player2 = new Player(2, null);
		Handler player3 = new Player(3, null);
		Handler player4 = new Player(4, null);
		Handler player5 = new Player(5, null);
		Handler player6 = new Player(6, null);
		
		player1.setNextor(player2);
		player2.setNextor(player3);
		player3.setNextor(player4);
		player4.setNextor(player5);
		player5.setNextor(player6);
		player6.setNextor(null);
		
		Request request = new Request<Integer>();
		request.setValue(5);
		Response resp = null ;
		player1.handle(request, resp );
	}
}
