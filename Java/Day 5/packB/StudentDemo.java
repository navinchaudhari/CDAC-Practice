import packA.Student;
package packB;

class StudentDemo extends Student{

	public int id=13;
	public String name="Bhavesh";
	public float marks=84.6f;
	public char div='B';

	public int avg(){

		return 63;
	}
	
	public void printName(){
		System.out.println("CDAC");
	}


	public static void main(String args[]){

		//Student sD = new Student();

		//StudentDemo sD = new StudentDemo();
		
		
		Student sD = new StudentDemo();

		// cannot create
		//StudentDemo s2 = new Student();
		
		
		
		System.out.println(sD.id);
		System.out.println(sD.name);
		System.out.println(sD.marks);
		System.out.println(sD.div);

		System.out.println(sD.avg());
		System.out.println(sD.perc());
		//sD.printName();

	}


}