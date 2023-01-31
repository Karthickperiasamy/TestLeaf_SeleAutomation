package week3.day1;

public class AxisBank extends BankInfo{

	@Override
	public void deposit() {
		System.out.println("Axis Deposit");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AxisBank axisBank = new AxisBank();
		axisBank.saving();
		axisBank.fixed();
		axisBank.deposit();
		
	}

	
	
}
