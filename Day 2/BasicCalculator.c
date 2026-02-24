#include <stdio.h>
	void add ();
	void subtract ();
	void multiply ();
	void division ();
	void menuDrivenCalculator();



	int main(void){
			menuDrivenCalculator();
		return 0;
	}

	void add (){
		int a,b;

		printf("========================================================\n");
		printf("Enter number 1 :");
		scanf("%d", &a);
		printf("\nEnter number 2 :");
		scanf("%d", &b);

		int sum = a + b;
		printf("Addition of %d and %d is %d\n", a, b, sum);
		printf("========================================================\n");
	}

	void subtract (){
		int a,b;
		printf("========================================================\n");
		printf("Enter number 1 :");
		scanf("%d", &a);
		printf("\nEnter number 1 :");
		scanf("%d", &b);

		int sub = a - b;
		printf("Substraction of %d and %d is %d\n", a, b, sub);
		printf("========================================================\n");
	}

	void multiply (){
		int a,b;
		printf("========================================================\n");
		printf("Enter number 1 :");
		scanf("%d", &a);
		printf("\nEnter number 1 :");
		scanf("%d", &b);

		int mult = a * b;
		printf("Multiplication of %d and %d is %d\n", a, b, mult);
		printf("========================================================\n");
	}

	void division (){
		int a,b;
		printf("========================================================\n");
		printf("Enter number 1 :");
		scanf("%d", &a);
		printf("\nEnter number 1 :");
		scanf("%d", &b);

		int div = a / b;
		int rem = a % b;
		printf("Division of %d and %d is %d and remainder is %d\n", a, b, div, rem);
		printf("========================================================\n");
	}

	void menuDrivenCalculator(){
		int num;
		do{
			printf("********************************************************\n");
			printf("For Addition Enter 1 \n");
			printf("For Substraction Enter 2 \n");
			printf("For Multiplication Enter 3 \n");
			printf("For Division Enter 4 \n");
			printf("For EXIT 5 \n");
			printf("*********************************************************\n");

			printf("Enter number: ");
			scanf("%d",  &num);

			switch(num){
				case 1 : add();
					break;
				case 2 : subtract();
					break;
				case 3 : multiply();
					break;
				case 4 : division();
					break;
				case 5 : printf("EXIT");
					break;				
				default : printf("You have entered wrong number\n");
					break;
			}
		} while (num != 5);
	}

