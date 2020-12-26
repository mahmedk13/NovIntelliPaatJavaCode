package interfacelearning;

public class TestInterface {

	public static void main(String[] args) {
		
		
		//you cant create object of abstract class and interface
		//Drawable d = new Circle();
		Drawable d = new Rectangle();
		d.draw(); //draw method from circle will be called
		

	}

}
