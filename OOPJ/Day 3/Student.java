class Student {

	int roll;
	String name;
	float marks;

	public static void main(String args[]){
		
		Student s1;
		s1 = null;
		Student s2 = new Student();
		
		s2.roll = 14;
		s2.name = "Navin";
		s2.marks = 78.53f;
	
		s1 = s2;
		
		System.out.println("S1 OBJ");
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.marks);	

		s1.roll = 84;
		s1.name = "Bhavesh";
		s1.marks = 45.32f;

		System.out.println("S2 OBJ");
		System.out.println(s2.roll);
		System.out.println(s2.name);
		System.out.println(s2.marks);

		System.out.println(s1);
		System.out.println(s2);

	}



}