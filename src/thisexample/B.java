package thisexample;

public class B {
	
	B(){
		System.out.println("inside constructor of B");
	}
	
	B(int x){
		this();
		System.out.println("value of x is" +x);
	}
	
	public static void main(String[] args) {
		B b = new B(5);
	}

}
