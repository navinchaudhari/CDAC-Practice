package packB;
import packA.Parent;

class Child extends Parent{

	public Child(){
		this(10,20);
		System.out.println("Inside 0 param. child ");
		
	}

	public Child(int n1){
		super();
		System.out.println("Inside 1 param. child " + n1);
	}

	public Child(int n1, int n2){
		this(30);
		System.out.println("Inside 2 param. child "+ n1 + n2);
	}



	public static void main(String args[]){
		//Parent p = new Parent();
		
		Child c = new Child();
	
	}


}