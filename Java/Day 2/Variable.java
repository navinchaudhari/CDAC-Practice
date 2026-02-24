class ClassAndObject{

	// Instance Variable
	//Memory provided inside Heap
	//One per Object
	int id;
	
	// Static Metod
	//Memory provided inside Method Area
	//One per class
	static String name;


	public static void main(String args[]){

		//Local variable
		//It does not default value
		//Memory provided inside stack
		//Multiple copies can be create
		int localVariable;
		localVariable=15;
		System.out.println(localVariable);

		//Instance variable cannot be accessed directly
		//We have to create Object of the class first
		//System.out.println(id);


		ClassAndObject c1=new ClassAndObject();
		//Instance variable has default value
		System.out.println(c1.id);


		//Static method can be access directly inside same class satatic method
		//Or by using classname/Object reference of that class

		//Static variable has default value
		System.out.println(name);


	}
}

