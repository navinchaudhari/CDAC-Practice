class Employee{

	int id;
	String name;
	static String companyName="C-DAC";

	Employee(){
	System.out.println("Inside Constructor block");
	companyName="C-DAC Mumbai 2026";
	System.out.println(companyName);
	System.out.println("-------------------------------");
	}

	{
	System.out.println("Inside instance block");
	companyName="C-DAC Mumbai";
	System.out.println(companyName);
	System.out.println("-------------------------------");
	}

	static{
	System.out.println("Inside static block");
	companyName="C-DAC 26";
	System.out.println(companyName);
	System.out.println("-------------------------------");
	}

}

class EmployeeDemo{

	public static void main(String args[]){

		System.out.println(Employee.companyName);
		System.out.println("-------------------------------");
		Employee e= new Employee();
		System.out.println(e.companyName);
	
	}

}