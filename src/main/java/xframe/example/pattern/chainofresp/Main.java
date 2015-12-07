package xframe.example.pattern.chainofresp;

public class Main {

	public static void main(String[] args) {
		//handler个数有限
		Handler first = new ContreteHandler(null);
		Handler second = new ContreteHandler(null);
		Handler third = new ContreteHandler(null);
		Handler fourth = new ContreteHandler(null);
		Handler fifth = new ContreteHandler(null);
		
		//维护next关系
		first.setNextor(second);
		second.setNextor(third);
		third.setNextor(fourth);
		fourth.setNextor(fifth);
		fifth.setNextor(null);
		
		first.handle(null, null);
	}
}
