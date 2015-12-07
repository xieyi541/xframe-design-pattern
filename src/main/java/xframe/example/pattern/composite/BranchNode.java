package xframe.example.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class BranchNode<V> extends Node{

	
	private List<Node> list = new ArrayList<Node>(32);
	
	public boolean add(Node entry){
		return list.add(entry);
	}
	
	@Override
	public void traverse(String space) {
		space = space + "+";
		System.out.println(space + super.getV());           
		for(Node node : list){
			node.traverse(space);
		}
		
	}
}
