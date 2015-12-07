package xframe.example.pattern.template;

public class Main {

	public  static void main(String[] args) {
		AbstractTemplate template = new ContreteImpl();
		template.templateMethod();
	}
}
