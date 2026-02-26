#include <stdio.h>

void sizeOfOperator();

int main(void)
{

	sizeOfOperator();
	return 0;
}

void sizeOfOperator()
{
	// sizeof: short int, int, long int, long long int, unsigned int, float, double, long double, char

	printf("Size of  short is %d\n", sizeof(short));
	printf("Size of  long is %d\n", sizeof(long));
	printf("Size of  short int is %d\n", sizeof(short int));
	printf("Size of  int is %d\n", sizeof(int));
	printf("Size of  long int is %d\n", sizeof(long int));
	printf("Size of  long long int is %d\n", sizeof(long long int));
	printf("Size of  unsigned int is %d\n", sizeof(unsigned int));
	printf("Size of  float is %d \n", sizeof(float));
	printf("Size of  double is %d \n", sizeof(double));
	printf("Size of  long double is %d\n", sizeof(long double));
	printf("Size of  char is %d\n", sizeof(char));

	// sizeof short, short int is same i.e 2 byte
	// sizeof long, int, long int, unsigned int, float is same i.e 4 byte
	// sizeof long long int and double is same i.e 8 byte
	// sizeof long double is 12 byte
	// sizeof char is 1 byte
}