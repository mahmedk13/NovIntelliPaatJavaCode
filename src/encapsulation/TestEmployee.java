package encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setEmpId(123);
		e.setEmpName("John");
		
		//e.displayEmpDetails();
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());

	}

}
