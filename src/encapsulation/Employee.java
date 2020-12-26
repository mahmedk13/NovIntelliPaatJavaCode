package encapsulation;

public class Employee {
	
	 private int empId;
	 private String empName;
	 
	 public void displayEmpDetails() {
		System.out.println("emp id is "+empId);
		System.out.println("empName is"+empName);
	 }

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	 
	 //Setters if you want to set values of variables through the methods
	 //Getters if you want to get values of variables through the methods
	
	

}
