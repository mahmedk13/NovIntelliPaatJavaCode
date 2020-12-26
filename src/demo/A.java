package demo;

 class A {
	
	public int x=10;
	
	 public void display() {
		System.out.println("Hello world");
	}
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.x);
		a.display();
	}

}
