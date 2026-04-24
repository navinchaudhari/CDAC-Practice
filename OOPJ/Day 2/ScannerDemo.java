import java.util.Scanner;

class ScannerDemo{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		//First character of an String
		char c = sc.next().charAt(0);
	
		// This will take input till encounter with space
		String s1 = sc.next();

		/// This will take input till next line
		String s2 = sc.nextLine();
		
		System.out.println(s2);

	}

}