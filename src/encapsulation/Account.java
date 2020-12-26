package encapsulation;

public class Account {
	
	private int pinNum=1234;
	private int otpwd=1456;
	int balance = 100000;
	int accountNum;
	
	
	public void withdraw(int pinno, int amtToWithdraw ) {
		
		if(pinNum==pinno) {
			System.out.println("user is allowed to withdraw amount");
			balance = balance-amtToWithdraw;
			
		}else {
			System.out.println("user is not allowed to withdraw amount");
		}
		
		System.out.println("balance in the user account is "+balance);
		
	}
	
	public void updatePin(int otp, int pinno) {
		if(otpwd==otp) {
			System.out.println("allow user to change the pin");
			pinNum=pinno;
		}else {
			System.out.println("user is unauthorized");
		}
		
		
	}

}

