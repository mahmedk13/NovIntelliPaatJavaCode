package abstractionexample;

public abstract class ICICIBank extends Bank {
	
	
	//non abstract method
	int getRateOfInterest() {
		return 9;
	}
	
	//abstract method
	abstract int checkBalance();

}
