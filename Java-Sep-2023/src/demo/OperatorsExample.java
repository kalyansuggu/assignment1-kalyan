package demo;

public class OperatorsExample {

	public static void main(String[] args) {
		
		int a;
		a = 10;		
		System.out.println("a: "+a);
		
		a += 10;  // a = a+10;
		System.out.println("a: "+a);
		
		a -= 5;  //a = a-5;
		System.out.println("a: "+a);
		
		a *= 5;  //a = a*5;
		System.out.println("a: "+a);
		
		a /= 5; //a = a/5;
		System.out.println("a: "+a);
		
		a %= 2; //a = a%2;
		System.out.println("a: "+a);
		
		a++;		
		System.out.println("a: "+a);
		
		a--;		
		System.out.println("a: "+a);
		
		++a;
		System.out.println("a: "+a);
		
		--a;
		System.out.println("a: "+a);		
		
		System.out.println("a: "+ a++);
		System.out.println("a: "+a);
//		System.out.println("a: "+ ++a);
		
		a+=8;
		System.out.println("a: "+a);
		
		int b;
		b = 20;
		System.out.println("b: "+b);
		
		boolean bool1 =  a == b;
		System.out.println( bool1 ); // System.out.println( a == b );
		
		System.out.println( a < b );
		
		System.out.println( a > b );
		
		System.out.println( a <= b );  //(a<b or a == b)
		
		System.out.println( a >= b );  //(a>b or a == b)
		
		System.out.println( a != b );  //(a>b or a == b)
		
		int c = 30;
		
		
		System.out.println( a == c || a == b);
		System.out.println( a != c || a == b);  // any condition is true, returns true
		
		System.out.println( a != c || a == b );  // any condition is true, returns true
		
		System.out.println( a != c && a == b); // all conditions are true, returns true
		
		System.out.println( a != c || a == b || b == c || b != c || a < b || a<= b);
		
		System.out.println(a != c || a == b || b == c || b != c || a < b || a<= b && a>=b);
		
		System.out.println(!( a != c || a == b || b == c || b != c || a < b || a<= b && a>=b));
		
		
		System.out.println( a<b ? a : b );
		
		System.out.println( a<b ? true : false );
		
		System.out.println( a<b ? "A is small" : "B is big" );
		
		System.out.println( a<b ? "A" : "B" );
		
		System.out.println( a<b ?(a+b) : (a+b+c) );
		
		System.out.println( a>b ? (a+b) : (a+b+c));
		
		
		if(a>b) {
			System.out.println("A value with if condition "+ a);
		}
		
		if(a>b) {
			System.out.println("B value with if condition "+ b);
		}else {
			System.out.println("A value with if condition "+ a);
		}
		
		if(a>b || a < c) {
			System.out.println("B value with if condition "+ b);
		}else {
			System.out.println("A value with if condition "+ a);
		}
		
		if(a>b) {
			System.out.println("B value with if condition "+ b);
		}else if( a < c){
			System.out.println("C value with if condition "+ c);
		}
		
		if(a>b) {
			System.out.println("B value with if condition "+ b);
		}else if( a > c){
			System.out.println("C value with if condition "+ c);
		}else {
			System.out.println("Not saisfying any condition");
		}
		
		
		if(a>b) {
			System.out.println("B value with if condition "+ b);
		}else if( a > c){
			System.out.println("C value with if condition "+ c);
		}else {
			
			if(b <c ) {
				System.out.println("B value with if condition "+ b);
			}else {
				System.out.println("Not saisfying any condition");
			}
		}
		
		
		String str;
		str= "Hello";
		
		char ch;
		ch= 'A';
		
		
		
		
	}

}
