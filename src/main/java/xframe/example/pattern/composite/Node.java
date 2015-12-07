package xframe.example.pattern.composite;

public abstract class Node<V> {

	private V v;
	


	public V getV() {
		return v;
	}

	//连缀
	public Node setV(V v) {
		this.v = v;
		return this;
	}
	
	public abstract void traverse(String space);
	
	public abstract boolean add(Node node);
}
