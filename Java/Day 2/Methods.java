class Methods{

	int id;
	String name;

	Methods(){
	
	}

	Methods(int i, String n){
		id=i;
		name=n;
	}


	void display(){
	
	System.out.println("Welcome to C-DAC Mumbai");

	}
	
	
	public static void main(String args[]){
		
		Methods m1=new Methods();
		
		m1.display();
	
	}





}