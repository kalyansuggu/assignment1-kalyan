package encapsulation;

public class Calculator {
	
	int a = 10;
	int b;  //0
	int c = 30; // instance
	
	static int d = 40;

	void addition() {			
		System.out.println(a+b);
	}

	void substraction() {
		System.out.println(a-b);
	}

	void multiplication() {
		int c =30;  //instant
		int d; // no default
		
		System.out.println(a*b);
		
//		System.out.println(c*d);
	}

	void division() {
		System.out.println(c);
	}

	void modDivision() {

	}

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.addition();
		calc.substraction();		
		calc.division();
		
		Calculator calc1 = new Calculator();		
		calc1.addition();
		calc1.substraction();		
		calc1.division();
		
		
		
	}

}
