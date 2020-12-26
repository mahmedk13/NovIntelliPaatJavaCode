package exceptionhandling;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		
		try {
			int a =50/0;
			System.out.println("after division");
			
		}catch(ArithmeticException  a) {
			System.out.println("dividing a number by zero because I hate maths");
			//
			//
			//
			//
			//
		}
		
		System.out.println("cool");
		
				

	}

}
