package ExceptionContinued;

public class Example2 {
	
	void test() {
		throw new ArrayIndexOutOfBoundsException();
	}
	
	public static void main(String[] args) {
		Example2 e = new Example2();
		e.test();
	}

}
