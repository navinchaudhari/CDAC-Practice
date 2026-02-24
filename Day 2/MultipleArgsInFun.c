#include <stdio.h>
#include <stdarg.h>

	int sum_of_Numbers(int howManynNm, ...){

		va_list ap;
		
		va_start(ap, howManynNm);

		int result = 0;
		
		for(int i = 0; i < howManynNm; i++){
		
			result += va_arg(ap, int);
		
		}
		
		va_end(ap);
	
		return result;
	}


	void printNumbers(int howManynNm, ...){

		va_list ap;
		
		va_start(ap, howManynNm);

		int result = 0;
		
		for(int i = 0; i < howManynNm; i++){
		
			printf("%d ", va_arg(ap, int));
		
		}
		
		va_end(ap);
	}


	int main(void){

		//printf("%d ", sum_of_Numbers(5,1,8,9,3,17));
		printNumbers(8,11,22,33,44,55,66,77,88);

	return 0;
	}