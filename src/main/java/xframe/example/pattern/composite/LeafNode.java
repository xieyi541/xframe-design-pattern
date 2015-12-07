package xframe.example.pattern.composite;

public class LeafNode<V> extends Node{

	@Override
	public boolean add(Node node) {
		throw new RuntimeException("leaf can not add node.");
	}

	@Override
	public void traverse(String space) {
		System.out.println(space + "+" +  super.getV());
		
	}
	
	



	
	
}
