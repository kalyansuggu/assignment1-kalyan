package encapsulation;

public class ArithematicOperatios {

	int a = 40;
	int b = 50;
	static int c = 60;

	int addition(int a, int b) {
		System.out.println("Addition: " + (a + b));
		return a + b;
	}

	void substraction(int a, int b) {
		System.out.println("Substraction: " + (a - b));
	}

	void multiplication(int a, int b) {
		System.out.println("Multiplication: " + a * b);
	}

	void division(int a, int b) {
		System.out.println("Division: " + a / b);
	}

	void modDivision(int a, int b) {
		System.out.println("Modular Divisio: " + a % b);
	}

	void display(int a, int b) {
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("Instance A: " + this.a);
		System.out.println("Instance B: " + this.b);
		System.out.println("Static C: " + ArithematicOperatios.c);
	}

	void globalData() {
		System.out.println("Global A: " + this.a);
		System.out.println("Global B: " + this.b);
		System.out.println("Global C: " + ArithematicOperatios.c);
	}

	static int storeGlobalData() {
		int a = 2000;
		return a;
	}

	int getA() {
		return this.a;
	}

	int getB() {
		return this.b;
	}

	static int getC() {
		return ArithematicOperatios.c;
	}
	
	
	void disPlayGlobalData() {
		System.out.println("Global A: " + this.getA());
		System.out.println("Global B: " + this.getB());
		System.out.println("Global C: " + ArithematicOperatios.getC());
	}
	
	public static void main(String[] args) {
		ArithematicOperatios ariOps = new ArithematicOperatios();

		ariOps.addition(100, 100);
		ariOps.substraction(100, 25);
		ariOps.multiplication(5, 5);
		ariOps.division(10, 2);
		ariOps.modDivision(61, 30);

		ariOps.display(10, 20);
		ariOps.globalData();

		int a = 100;
		int b = a;

//		int addResult = ariOps.addition(100,100);
		ariOps.multiplication(ariOps.addition(100, 100), 5);

		ariOps.modDivision(ArithematicOperatios.storeGlobalData(), 6);
		
		ariOps.disPlayGlobalData();
	}

}
