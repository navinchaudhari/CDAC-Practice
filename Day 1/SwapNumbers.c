#include <stdio.h>

void swapNumbers(int a, int b);


int main(void){

swapNumbers(10,20);

return 0;
}

void swapNumbers(int a, int b){

	printf("Before Swap:\n");
	printf("a: %d\n",a);
	printf("b: %d\n",b);

	int temp=a;
	a=b;
	b=temp;
	
	printf("After Swap:\n");
	printf("a: %d\n",a);
	printf("b: %d\n",b);
}