package testng;

public class BankTransaction {
      
	static int balance =10000;
	
	void deposit(int depositamount) {
		BankTransaction.balance=balance+depositamount;
		
	}
	   void withdraw(int withdrawamount) {
		    if (balance  >= withdrawamount){
		    	BankTransaction.balance=balance - withdrawamount;
		    }  else{
		    	System.out.println("insufficient balance");
		    	}
		    }
		
	   
	   void checkbalance() {
		   
		   System.out.println("Balance in your account = " + balance);
	   }
	public static void main(String[] args) {
		
		BankTransaction gwk=new BankTransaction();
		
		gwk.deposit(10000);
		gwk.checkbalance();
		gwk.withdraw(30000);
		gwk.checkbalance();
		
		
		BankTransaction nad=new BankTransaction();
		gwk.withdraw(19999);
		gwk.checkbalance();
	}
}
