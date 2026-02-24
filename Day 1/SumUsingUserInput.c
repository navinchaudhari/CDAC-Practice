#include <stdio.h>

int sum(int n1, int n2);



int main(void){

	int n1, n2;
	printf("Enter num1: ");
	scanf("%d", &n1);

	printf("Enter num2: ");
	scanf("%d", &n2);
	
	printf("Sum of Numbers is %d", sum(n1,n2));


return 0;
}

int sum(int n1, int n2){
	return n1+n2;
}