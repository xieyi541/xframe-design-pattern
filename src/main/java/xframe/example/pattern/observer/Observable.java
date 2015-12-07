package xframe.example.pattern.observer;

import java.util.Vector;

public class Observable {
	//使用了synchronized就不需要使用volatile
	private boolean changed = false; 

	private Vector<Observer> vector = new Vector<Observer>(); 
	
	public synchronized boolean add(Observer oberver){
		return vector.add(oberver);
	}
	public synchronized boolean remove(Observer oberver){
		return vector.remove(oberver);
	}
	public void notifyObservers(Object arg){
		Object[] arrLocal;
		synchronized(this){
			if(!changed){
				return;
			}
			arrLocal = vector.toArray();
			clearChanged();
		}
		
		for (int i = arrLocal.length-1; i>=0; i--)
	        ((Observer)arrLocal[i]).update(this, arg);
       
    }

	protected void setChanged(){
		changed = true;
	}
	
	public boolean hasChanged(){
		return changed;
	}
	
	protected void clearChanged(){
		changed = false;
	}
	
}
