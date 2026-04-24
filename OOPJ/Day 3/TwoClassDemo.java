class TwoClassDemo {

	public static void main(String args[]){
		
		System.out.println("Two Class Demo");

		SecondClass sc = new SecondClass();

		System.out.println(sc.rollno);
		System.out.println(sc.name);
		
	}
}

class SecondClass{
	int rollno = 15;
	String name = "Navin";

	public static void main(String args[]){
		
		System.out.println("Second Class Demo");

		SecondClass sc = new SecondClass();

		System.out.println(sc.rollno);
		System.out.println(sc.name);
		
	}


}