package demo;

public class ConditionalStatements {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;

		if (a > b) {
			System.out.println("A value with if condition " + a);
		}

		if (a > b) {
			System.out.println("B value with if condition " + b);
		} else {
			System.out.println("A value with if condition " + a);
		}

		if (a > b || a < c) {
			System.out.println("B value with if condition " + b);
		} else {
			System.out.println("A value with if condition " + a);
		}

		if (a > b) {
			System.out.println("B value with if condition " + b);
		} else if (a < c) {
			System.out.println("C value with if condition " + c);
		}

		if (a > b) {
			System.out.println("B value with if condition " + b);
		} else if (a > c) {
			System.out.println("C value with if condition " + c);
		} else {
			System.out.println("Not saisfying any condition");
		}

		if (a > b) {
			System.out.println("B value with if condition " + b);
		} else if (a > c) {
			System.out.println("C value with if condition " + c);
		} else {

			if (b < c) {
				System.out.println("B value with if condition " + b);
			} else {
				System.out.println("Not saisfying any condition");
			}
		}

		if (a > b) {
			System.out.println("B value with if condition " + b);
		} else if (a > c) {
			System.out.println("C value with if condition " + c);
		} else if (a > c) {
			System.out.println("C value with if condition " + c);
		} else if (a > c) {
			System.out.println("C value with if condition " + c);
		} else if (a > c) {
			System.out.println("C value with if condition " + c);
		} else if (a > c) {
			System.out.println("C value with if condition " + c);
		} else if (a > c) {
			System.out.println("C value with if condition " + c);
		} else if (a != c) {
			System.out.println("C value with if condition " + c);
		}

		String string1 = "Hello";

		switch (string1) {
			case "APPLE":
				System.out.println("I'm Apple");
				break;
	
			case "BANANA":
				System.out.println("I'm Banana");
				break;
	
			default:
				System.out.println("No match found");
				break;
		}

		int number = 10;

		switch (number) {
			case 10:
				System.out.println("I'm 10");
				int key = 10;	
				int e  = 50;
				switch (key) {
					case 10:						
						break;
	
					default:
						break;
					}
				break;
	
			case 20:
//				System.out.println(e);
				System.out.println("I'm 20");
				break;
	
			default:
				System.out.println("No match found");
				break;
		}
		
		
		

		if (a > b) {
			int d = 40;
			System.out.println("A value with if condition " + a);
		}
		

		if (a > b) {
//			System.out.println(d);
			System.out.println("B value with if condition " + b);
		} else {
			System.out.println("A value with if condition " + a);
		}

	}

}
