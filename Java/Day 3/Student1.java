class Student1{

	void study(){
		System.out.println("Doing Study.....");
	}

	/*void study(String name){
		System.out.println("Doing Study..... "+ name);
	}
	
	String study(String name){
		return name;
	}*/

	void study(int id){
		System.out.println("Doing Study..... "+ id);
	}

	int study(int id){
		return id;
	}
}

class Demo1{

	public static void main(String[] args){
		Student1 s1=new Student1();
		s1.study();
		s1.study(10);
		int i=s1.study(20);
	}


}