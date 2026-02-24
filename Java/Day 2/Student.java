class Student{

	int id;
	String name;
	int age;
	float marks;
	static String batch = "Feb 2026";
	


	public static void main(String args[]){

		System.out.println(batch);
	
		Student s1=new Student();

		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.marks);
		System.out.println(s1.batch);

		System.out.println("--------------------------------------");

		Student s2=new Student();
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.marks);
		System.out.println(s2.batch);

		s2.batch="C-DAC Mumbai Feb 2026";
		System.out.println(s1.batch);
		System.out.println(s2.batch);

}





}