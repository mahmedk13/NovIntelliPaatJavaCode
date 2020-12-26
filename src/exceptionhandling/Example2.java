package exceptionhandling;

public class Example2 {

	public static void main(String[] args) {
		
		try {
			int a[]=new int[5];
			a[4]=50/10;
		}catch(ArithmeticException a) {
			System.out.println("Arithmetic exception");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound exception");	
		}catch(Exception n) {
			System.out.println("Parent exception");
		}finally {
			System.out.println("always executed");
		}
		
		System.out.println("rest of the code");

	}

}
