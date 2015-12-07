package xframe.example.pattern.prototype;

import java.util.Date;

public class Deep implements Cloneable{
	private String name ;
	private Date date ;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();  //直接调用object对象的clone()方法！
		
		//添加如下代码实现深复制(deep Clone)
		Deep s = (Deep) obj;
		s.date = (Date) this.date.clone();  //把属性也进行克隆！
		return obj;
	}
	public Deep(String name, Date date) {
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
