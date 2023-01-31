package week3.day1;

public class Automation extends MultipleLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation automation = new Automation();
		automation.python();
		automation.Java();
		automation.ruby();
		automation.Selenium();
		

	}

	@Override
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	@Override
	public void ruby() {} {
		System.out.println("ruby");
	}
	
	
	
}
