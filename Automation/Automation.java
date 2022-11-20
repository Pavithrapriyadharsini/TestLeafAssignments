package Automation;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public static void main(String[] args) {
		
		Automation automate=new Automation();
		automate.python();
		automate.Selenium();
		automate.Ruby();
		automate.Java();

	}

	public void Selenium() {
		System.out.println("Selenium");
		
	}

	public void Java() {
		System.out.println("Java");
		
	}

	void Ruby() {
		System.out.println("Ruby");
		
	}

}
