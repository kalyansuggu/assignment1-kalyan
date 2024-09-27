package encapsulation;

public class TypesOfMethods {
	
	int a = 10;
	int b = 20;
	
	static int c = 30;
	
	void addition() {			
		System.out.println(this.a+this.b);
	}

	void substraction() {
		System.out.println(this.a-this.b);
	}

	void multiplication() {
		System.out.println(this.a*this.b);
	}

	void division() {
		System.out.println(this.a/this.b);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(TypesOfMethods.c);
	}

	void modDivision() {
		System.out.println(this.a%this.b);
	}
	
	static void display() {
		TypesOfMethods calc = new TypesOfMethods();
//		System.out.println(calc.a);
//		System.out.println(calc.b);
		System.out.println(TypesOfMethods.c);
		
	}

	public static void main(String[] args) {
		
		TypesOfMethods calc = new TypesOfMethods();
		
		System.out.println(calc.a);
		
		calc.addition();
		
		System.out.println(TypesOfMethods.c);
		
		TypesOfMethods.display();
		
		calc.division();

	}

}
