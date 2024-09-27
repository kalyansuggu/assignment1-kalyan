package encapsulation;

public class BankTransactions {
	
	static int balance = 100000;
	
	void deposit(int depositAmount){
		
		if(depositAmount <= 200000) {
			BankTransactions.balance = BankTransactions.balance + depositAmount;
		}else{
			System.out.println("Deposit amount exceeds daily limit, Please deposit less than 200000");
		}
	}
	
	void withdrawl(int withdrawlAmount){
		
		if(BankTransactions.balance > withdrawlAmount) {
			BankTransactions.balance = BankTransactions.balance - withdrawlAmount;
		}else {
			System.out.println("Insufficent Balance");
		}
	}
	
	void checkBalance() {
		System.out.println("Balance in your account : "+ BankTransactions.balance);
	}

	public static void main(String[] args) {
		
		BankTransactions ameerpetBranch = new BankTransactions();
		
		ameerpetBranch.checkBalance();
		
		ameerpetBranch.deposit(500000);
		
		ameerpetBranch.checkBalance();
		
		BankTransactions lbNagarBranch = new BankTransactions();
		
		lbNagarBranch.withdrawl(125000);
		
		lbNagarBranch.checkBalance();
	}

}
