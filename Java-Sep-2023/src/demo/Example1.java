package demo;

public class Example1 {
	
	static byte byte1 = 127;
	
	short short1 = 32767;
	
	int int1 = 2147483647;
	
	long long1 = 2147483648L;
	
	float float1 = 100.5F;
	
	double double1 = 100.5D;
	
	char char1 = 'A';
	
	char char2 = '@';
	
	static char char3 = '1';
	
	static int int2 = 1;
	
	boolean boolean1 = true;  //false
	
	String string1 = "ashklahvkhlvhkhvsvpdshvkldshvklhdsklvhkdshvkhdskvhsdvkdshkvhkldshvkdlsvhkdslhvkdshvkdshvkldshvkldshvhsdkhvsvhkldvhdskl";
	
	Object object1 = "kldashlksahdghdskghdskgdsklghdshkl";
	
	static Object object2 = 10;
	
	Object object3 = 'A';
	
	Object object4 = false;
	
	
    void display(){    	
    	System.out.println(object2);    	
    }
    
    int addition(){
    	return 10+20;
    }
	
	
	public static void main(String[] args) {
		
		var var1=10;
		
		var var2=10.5;
		var var3='A';
		
		var var4="ahhkdsdshgdsklg";
		
		var var5 = true;
		
		int a = 10;
		
		byte byte1 = 127;
		
		System.out.println("Char3: "+ char3);
		
		System.out.println("int2: "+ int2);
		
		System.out.println(char3-'0'+int2);
		
//		System.out.println(object2 * byte1);
		
	}

}
