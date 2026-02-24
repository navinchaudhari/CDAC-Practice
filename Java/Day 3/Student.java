class Student{

	int id;
	String name;
	static String batch= "Feb26";

	Student(){
	batch="PGCP_AC Feb 26";
	//System.out.println("Inside constructor block");
	
	}
	
	static{
	System.out.println("Inside static block 2");	
	}
	
	static{
	System.out.println("Inside static block 1");	
	}

	{
	System.out.println("Inside instance block 2" );
	}

	{
	System.out.println("Inside instance block 1");
	}


	

}


class Demo{

	public static void main(String[] args){
		Student s1=new Student();
	}
	

}