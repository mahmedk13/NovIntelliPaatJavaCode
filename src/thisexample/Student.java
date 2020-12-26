package thisexample;

public class Student {
	
	int rollNum=124;
	String name;
	String subject;
	
	Student(){
		
	}
	
	//this refers to current class instance variable
	Student(int rollNum, String name, String subject){//local variables
		this.rollNum = rollNum; 
		this.name=name;
		this.subject=subject;
	}
	
	public void display() {
		
		
		int rollNum=123;
		System.out.println(this.rollNum);
	}
	
	public static void main(String[] args) {
//		Student s = new Student(123, "John", "Comp Science");
//		System.out.println(s.rollNum);
//		System.out.println(s.name);
//		System.out.println(s.subject);
		
		Student s = new Student();
		s.display();
		
		
		
	}

}
