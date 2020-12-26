
  class Programmer extends Employee{
	
 int variable_pay=4000;
	
	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("salary of programmer "+p.salary);
		System.out.println("variable pay of programmer "+p.variable_pay);
		int totalPay = p.salary+p.variable_pay;
		System.out.println("take home salary of programmer is "+totalPay);

		
		//HomePage does not need to write  take screenshot method
	}

}
