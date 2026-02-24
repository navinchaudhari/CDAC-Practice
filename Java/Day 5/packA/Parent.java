package packA;
public class Parent{

	public Parent(){
		this(10,20);
		System.out.println("Inside 0 param. Parent");
		
	}

	public Parent(int n1){
		System.out.println("Inside 1 param. Parent " + n1);
	}

	public Parent(int n1, int n2){
		this(30);
		System.out.println("Inside 2 param. Parent "+ n1 + n2);
	}


}