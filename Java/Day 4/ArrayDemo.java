import java.util.Scanner;
class ArrayDemo{

	public static void twoDArray(){

		/*int arr[][]={
			     {1,2,3},
			     {4,5,6},
			     {7,8,9}
			    };

			//System.out.println(arr[0][0]);
			//System.out.println(arr[2][1]);

		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.println(arr[i][j]);
			}
		}*/


		//int[][] arr=new int[3][3];
		
		//compile 
		/*int[][] arr=new int[3][];
		
		//NullpointerException: Cannot store to int array because "<local0>[1]" is null
		arr[0][0]=15;
		System.out.println(arr[0][0]);*/
		
		//error
		//int[][] arr=new int[][3];
		
	

		/*for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.println(arr[i][j]);
			}
		}*/

		/*int arr[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.println("Enter Value");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
	}


	public static void main(String a[]){
	
		//int arr[]={1,2,3,4,5};
		int arr[] = new int[5];
		
		/*System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);*/

		/*for(int i=0; i<5; i++){
			arr[i]=i;
		}
		for(int i=0; i<5; i++){
			System.out.println(arr[i]);
		}*/

		//.length is used tom find length of an array
		/*for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}*/

		/*for(int i=0; i<arr.size(); i++){
			System.out.println(arr[i]);
		}*/
		
		twoDArray();
		jaggedArray();
	
	}

	
	public static void jaggedArray(){
	
		int arr[][]=new int[3][];
		
		arr[0]=new int[6];
		arr[1]=new int[3];
		arr[2]=new int[8];
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	
	}








}