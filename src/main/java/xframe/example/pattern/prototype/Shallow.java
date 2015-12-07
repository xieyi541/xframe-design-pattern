package xframe.example.pattern.prototype;

import java.util.Date;

public class Shallow implements Cloneable {

	private String name ;
	private Date date ;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("call clone object");
		return super.clone();
	}
	public Shallow(String name, Date date) {
		super();
		this.name = name;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
}
