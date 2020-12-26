package methodoverloading;

public class Student {
	
	int rollNum;
	String studentName;
	int age;
	
	//non parameterized
	Student(){
		System.out.println("I am inside non param constructor");
	}
	
	Student(String name){
		studentName=name;
	}
	
	
	
	public void display() {
		System.out.println("Student name "+studentName);
		System.out.println("Student roll Num "+rollNum);
		System.out.println("Student age "+age);
	}
	
	public static void main(String[] args) {
		Student s = new Student("Mike");
		s.display();
		
	}

}
