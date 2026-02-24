class Employee{

	int id;
	String name;
	int age;
	String department;
	static String companyName="C-DAC Mumbai";

	Employee(){
	id=1000;
	name="Employee";
	age=25;
	department="New Joinee";
	
	}

	Employee(int i, String n, int a, String d){
		
	id=i;
	name=n;
	age=a;
	department=d;
	 
	}

	void login(float time){
	System.out.println("Login at "+time);
	}
	
	void logout(float time){
	System.out.println("Login at "+time);
	}

	int workComplete(int percentage){
	return percentage;
	}

	public static void main(String[] args){
	
	System.out.println(companyName);


	//Employee Object with parameterless constructor
	Employee e1=new Employee();
	System.out.println(e1.id);
	System.out.println(e1.name);
	System.out.println(e1.age);
	System.out.println(e1.department);


	//Employee object with parameterize const.
	System.out.println("-----------------------------------------");

	Employee e2=new Employee(13,"Navin", 25,"Backend");
	System.out.println(e2.id);
	System.out.println(e2.name);
	System.out.println(e2.age);
	System.out.println(e2.department);
	
	System.out.println("-----------------------------------------");
	e1.login(10);
	e1.logout(4);
	System.out.println(e1.workComplete(0));

	System.out.println("-----------------------------------------");
	e2.login(9.0f);
	e2.logout(5.30f);
	System.out.println(e2.workComplete(70)+"%");



	}









}