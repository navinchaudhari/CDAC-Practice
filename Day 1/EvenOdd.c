#include <stdio.h>
#include <stdbool.h>

	bool even(int num){
		if(num % 2 == 0)
			return true;
		else
			return false;
	}
	

	 int main(void){

		even(27) ? printf("Even number") : printf("Odd number");

		return 0;
	}