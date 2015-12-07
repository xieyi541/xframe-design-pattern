package xframe.example.pattern.composite;

public class Main {

	public static void main(String[] args) {
		Node root = new BranchNode<String>();
		root.setV("root").add(new LeafNode<String>().setV("leaf1"));
		Node childBranch = new BranchNode<String>().setV("child-branch");
		childBranch.add(new LeafNode<String>().setV("leaf2") );
		root.add(childBranch);
		
		root.traverse("");
		System.out.println();
		childBranch.traverse("");
		
	}
}
