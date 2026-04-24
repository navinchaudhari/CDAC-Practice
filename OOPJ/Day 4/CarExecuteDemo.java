abstract class Car{
	
	String company;
	int model;
	
	Car(){}
	
	Car(String company, int model){
		this.company = company;
		this.model = model;
	}
	
	void engine(){
		System.out.println("Engine Works");
	}
	
	void printDetails(){
		System.out.println("Company: " + company);
		System.out.println("Model: " + model);
	}
	
	abstract void aiIntegrated();
}

class Mahendra extends Car{
	String type;
	
	Mahendra(String company, int model, String type){
		super(company, model);
		this.type = type;
	}
	
	Mahendra(){}

	void aiIntegrated(){
		System.out.println("It is AI Integrated");
	}

	void printDetails(){
		super.printDetails();
		System.out.println("Type: " + type);
	}

}

class CarExecuteDemo{

	public static void main(String args[]){
		Car c = new Mahendra("Mahendra", 2026, "XUV");
		c.printDetails();
		c.aiIntegrated();
	
	}


}