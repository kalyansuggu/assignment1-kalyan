package assignments.kalyan;

public class Assignment1 {
	
	public static void main(String[] args){
	       String s1="123456789";
	       int sum = 0;
		   for(int i=0; i<s1.length(); i++)
		
		   {
	             sum = sum+Character.getNumericValue(s1.charAt(i));
	             System.out.print(s1.charAt(i));
	             if(i<s1.length()-1) {
	            	 System.out.print("+");
	             }
		   }
		   
	       		   System.out.print("=" + sum);
		}

	}

