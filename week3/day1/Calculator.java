package week3.day1;

public class Calculator {

	public int add(int num1,int num2) {
		return num1+num2;}
	
	public int add(int num1,int num2,int num3) {
		return num1+num2+num3;}
	
	public double mul(int num1, int num2) {
		return num1*num2;
	}
	
	
	public double mul(int num1,double num2) {
			return num1*num2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		System.out.println(calc.add(2, 3));
		System.out.println(calc.mul(2, 3.0));
		
	}

}
