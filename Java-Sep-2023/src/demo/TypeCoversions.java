package demo;

public class TypeCoversions {
	
	
	short addition(){
		
		short a = 32767;
		short b = 32767;
		
		short c = (short)(a+b);
		return 10;
	}

	public static void main(String[] args) {
		
		int int1 = 1000;
		
		short short1 = 100;
		
		byte byte1 = 100;
		
		int int2 = int1; //int2 = 100
		
		byte byte2 = (byte)int1; //error
//		
//		short short2 = int1; //error
//		
//		byte byte3 = short1; //error
		
		System.out.println(int1);
		System.out.println(byte2);
		
		int int3 = byte1; // implicit conversion
		
		float float1 = 100.5F;
		
		int int4 = (int)float1; //explicit conversion
		
		long long1 = (long)float1;
		
		System.out.println(float1);
		System.out.println(int4);
		System.out.println(long1);
		
		String string1 = "10";
		
		System.out.println(string1);
		
//		int int5 = (int)string1;   //Wrapper classes
//		
//		long long2  = (long)string1;  //Wrapper classes
		 
		
		char char1 = '#';
		
		
		int int6 = char1;
		
		short short3 = (short)char1;
		
		System.out.println(char1);
		System.out.println(int6);
		System.out.println(short3);

	}

}
