package superexample;

public class Dog extends Animal {
	
	String color="black";
	
	public void eat() {
		System.out.println("dog is eating");
	}
	
	public void bark() {
		System.out.println("dog is barking");
	}
	
	public void work() {
		super.eat();
		bark();
		
	}
	
	public void printColor() {
		System.out.println(color); //black
		System.out.println(super.color);
	}

}
