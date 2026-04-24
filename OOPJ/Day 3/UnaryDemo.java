class UnaryDemo{

	public static void main(String args[]){
		
		int a = 5;
		int b = a++ + a++ - --a + ++a;

		System.out.println(a);
		System.out.println(b);
		
		int c = b-- + ++a - b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		int x = 10;
		int y = x--;
		System.out.println(x);
		System.out.println(y);
 

	}


}