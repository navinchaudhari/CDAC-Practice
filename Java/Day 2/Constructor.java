class Constructor{

	int variables;
	String methodsName;
	int blocks;

	Constructor(){
	variables=3;
	methodsName="Static and Instance";
	blocks = 2;
	
	}

	Constructor(int i, String s, int b){
	variables=i;
	methodsName=s;
	blocks=b;
	
	}
		

public static void main(String args[]){

	Constructor c1=new Constructor();
	c1.methodsName="instance";
	System.out.println(c1.variables);
	System.out.println(c1.methodsName);
	System.out.println(c1.blocks);

	System.out.println("---------------------");


	Constructor c2=new Constructor();
	System.out.println(c2.variables);
	System.out.println(c2.methodsName);
	System.out.println(c2.blocks);

	System.out.println("---------------------");


	Constructor c3=new Constructor(45,"static", 7);
	System.out.println(c3.variables);
	System.out.println(c3.methodsName);
	System.out.println(c3.blocks);	
	

	
}

}