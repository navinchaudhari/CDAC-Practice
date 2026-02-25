#include <stdio.h>

	int main(){

 		int n1 = 100;
		int *ptrNum = & n1;
		
		// Reference Varible is not present in C
 		//int &n = n1;

	 	printf("%u\n", &n1);
		printf("%p\n", ptrNum);
		return 0;
	}