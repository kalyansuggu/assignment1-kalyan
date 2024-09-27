package encapsulation;

public class ConstructorExample {
	
	//static variables declaration
	static byte byte1;static short short1;static int int1;static long long1;static float float1;
	static double double1;static char char1;static boolean boolean1;static String string1;static Object object1;
	
//	instance variables declaration
	byte byte2;short short2;int int2;long long2;float float2;double double2;char char2;boolean boolean2;String string2;Object object2;
	
	ConstructorExample(){
		
	}
	
	ConstructorExample(int byte2, int short2){
		this.byte2 = (byte)byte2;
		this.short2 = (short)short2;
	}

	ConstructorExample(int byte2, int short2, int int2, long long2, double float2, double double2, char char2, boolean boolean2, String string2,Object object2){
		this.byte2 = (byte)byte2;
		this.short2 = (short)short2;
		this.int2 = int2;
		this.long2 = long2;
		this.float2 = (float)float2;
		this.double2 = double2;
		this.char2 = char2;
		this.boolean2 = boolean2;
		this.string2 = string2; 
		this.object2 = object2;
	}
	
	void displayInstanceVarbles(){
		System.out.println(this.byte2);System.out.println(this.short2);System.out.println(this.int2);System.out.println(this.long2);
		System.out.println(this.float2);System.out.println(this.double2);System.out.println(this.char2);System.out.println(this.boolean2);
		System.out.println(this.string2);System.out.println(this.object2);
	}
		
	public static void main(String[] args) {
		//local variables declaration
		byte byte3;short short3;int int3;long long3;float float3;double double3;char char3;boolean boolean3;String string3;Object object3;
		
		//print static variables
		System.out.println("--------------------static variables---------------------------------------");
		System.out.println(byte1);System.out.println(short1);System.out.println(int1);System.out.println(long1);System.out.println(float1);
		System.out.println(double1);System.out.println(char1);System.out.println(boolean1);System.out.println(string1);System.out.println(object1);
		
		
////		print instance variables
		System.out.println("--------------------instance variables---------------------------------------");
		ConstructorExample consEx = new ConstructorExample(10, 100, 1000, 10000, 100.00, 1000.00, 'A', true, "Hello", null);
		ConstructorExample consEx1 = new ConstructorExample();		
		ConstructorExample consEx2 = new ConstructorExample(100,200);
		System.out.println(consEx.byte2);System.out.println(consEx.short2);System.out.println(consEx.int2);System.out.println(consEx.long2);
		System.out.println(consEx.float2);System.out.println(consEx.double2);System.out.println(consEx.char2);System.out.println(consEx.boolean2);
		System.out.println(consEx.string2);System.out.println(consEx.object2);
		
		
		
//		//print local variables
		System.out.println("--------------------local variables---------------------------------------");
		byte3 = 0;
		short3 = 0;
		int3 = 0;
		long3 = 0L;
		float3 = 0.0F;
		double3 = 0.0D;
		char3 = ' ';
		boolean3 = false;
		string3 = null;
		object3 = null;
		
		System.out.println(byte3);System.out.println(short3);System.out.println(int3);System.out.println(long3);System.out.println(float3);
		System.out.println(double3);System.out.println(char3);System.out.println(boolean3);System.out.println(string3);System.out.println(object3);
		
	};

}
