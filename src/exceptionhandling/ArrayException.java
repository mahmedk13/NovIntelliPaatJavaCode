package exceptionhandling;

public class ArrayException {
	
	public static void main(String[] args) {
		
		int[] arr = {4, 7, 8, 9}; //last element is at 3rd index
		
		
		try {
		System.out.println(arr[4]); //4-1=3
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		System.out.println("This is the last line of my program");
		
		
		
	}

}
