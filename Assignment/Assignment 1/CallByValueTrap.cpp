#include <iostream>
using namespace std;

void doubleIt(int n)
{
    n = n * 2;
    printf("Inside doubleIt: %d\n", n);
}

void doubleItUsingRef(int &n)
{
    n = n * 2;
    printf("Inside doubleIt: %d\n", n);
}

int main()
{
    int num = 7;
    // doubleIt(num);
    doubleItUsingRef(num);
    printf("In main after call: %d\n", num);
    return 0;
}
