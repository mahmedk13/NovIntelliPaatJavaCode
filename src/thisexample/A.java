package thisexample;

public class A {
	
	public void x() {
		System.out.println("inside x");
	}
	
	public void y() {
		x();
		System.out.println("inside y");
	}

}
