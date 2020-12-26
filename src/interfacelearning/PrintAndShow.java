package interfacelearning;

public class PrintAndShow implements Printable, Showable {

	public static void main(String[] args) {
		PrintAndShow p = new PrintAndShow();
		p.show();
		p.print();

	}

	public void show() {
		System.out.println("Showing");
	}

	public void print() {
		System.out.println("Printing");		
	}

}
