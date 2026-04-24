class Practice{

	public static void ASCIIofChar(){
		for(int i = 0; i < 500; i++){
			System.out.print((char) i + " ");
		}
	}

	public static void main(String args[]){
		//ASCIIofChar();
		//System.out.println(args[0]);
		dataType();
		
	}

	static void dataType(){

		int i = 45;
		byte b = 78;
		short s = 115;
		long l = 14789632;
		float f = 53.62f;
		double d = 98.21;
		char c = 'J';
		boolean bool = true;

		System.out.println((int) s);
	}
}