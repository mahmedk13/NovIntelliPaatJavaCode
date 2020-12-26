package exceptionhandling;

public class Example1 {

	public static void main(String[] args) {
		
		try {
			int a = 50/0;
		}catch(Exception e) {
			try {
			int b = 100/0;
			}catch(Exception e1){
				System.out.println("Inside nestec catch block");
			}
			System.out.println("inside catch block");
		}
		
		System.out.println("rest of the code");

	}

}
