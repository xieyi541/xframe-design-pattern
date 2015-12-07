package xframe.example.pattern.decorator;

public class ConcreteComponent extends Component{

	public ConcreteComponent(String content) {
		super();
		this.content = content;
	}

	private String content;
	
	@Override
	public void print() {
		System.out.println(content);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
