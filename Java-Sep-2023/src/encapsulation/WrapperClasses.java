package encapsulation;

public class WrapperClasses {

	public static void main(String[] args) {
		
		byte byte1 = 100; 
		
		int int1 = 100;
		
		byte byte2 = (byte)int1; 
		short short1 = (short)int1;
		
		int int2 = byte1;
		
//		Object obj1 = 100;
//		
//		byte b1 = obj1;
		
		String string1 = "10";
		
		System.out.println(string1);
		
//		long int5 = (long)string1;   //Wrapper classes
		
//		int -> Integer
		
		int a = 100;
		Integer b = a;
		Integer c = 1000;
		int d = c;
		
		int a1 = Integer.parseInt(string1);
		
		byte b2 = Byte.parseByte(string1);
		
		short s2 = Short.parseShort(string1);
		
		long l2 = Long.parseLong(string1);
		
		float f2 = Float.parseFloat(string1);
				
		double d2 = Double.parseDouble(string1);
		
		String strn2 = "false";
		
		boolean bool2 = Boolean.parseBoolean(strn2);
		System.out.println(bool2);
		
		String strn3 = "A";
		
		char ch2 = strn3.charAt(0);
		
		Character ch3 = 'A';
		
		char ch4 = ch3; 
		
		String  ch5 = String.valueOf(ch3);
		
		int num = 10000;
		
		String.valueOf(num);
		
		String str6 = "Ten";
		
		int int7 = Integer.parseInt(str6);
	}

}
