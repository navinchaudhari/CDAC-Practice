#include <stdio.h>


void sumOfPtr(int *n1, int *n2, int *sum){
	*sum = *n1 + *n2;
}
void subOfPtr(int *n1, int *n2, int *sub){
	*sub = *n1 - *n2;
}
void divOfPtr(int *n1, int *n2, int *div){
	*div = *n1 / *n2;
}
void mulOfPtr(int *n1, int *n2, int *mul){
	*mul = *n1 * *n2;
}
void modOfPtr(int *n1, int *n2, int *mod){
	*mod = *n1 % *n2;
}

int main(void){
	int n1=151;
	int n2=26;
	int mod=789;
	
	printf("Rem: %d\n", mod);
	modOfPtr(&n1, &n2, &mod);

	printf("Rem: %d\n", mod);
return 0;
}