package week3.day1;

public class SmartPhone extends AndroidPhone{

	
	//takeVideo not printing
	public void connectWhatsApp() {
		System.out.println("Connect Whatsapp");
	}

	@Override
	public void takeVideo() {
		System.out.println("Take video from Smart Phone");
	}
	
	public static void main(String[] args) {
	SmartPhone phone = new SmartPhone();
	phone.sendMsg();
	phone.makeCall();
	phone.saveContact();
	phone.connectWhatsApp();
	phone.takeVideo();
		
		}
}