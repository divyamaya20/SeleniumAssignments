package week3.day3;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public void selenium() {
		System.out.println("Selenium Language");
	}

	public void java() {
		System.out.println("Java Language");
		
	}
	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}
	

	
	public static void main(String[] args) {
		
		Automation obj=new Automation();
		obj.python();
		obj.selenium();
		obj.java();
		obj.ruby();
	}

	
	
	}

