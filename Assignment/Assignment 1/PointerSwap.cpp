#include <iostream>
using namespace std;

void swapByUsingPointer();

int main(void)
{
    swapByUsingPointer();
    return 0;
}

void swapByUsingPointer()
{
    int x = 10;
    int y = 20;
    int z = 30;

    cout << "Before Swapping" << endl;
    cout << "X: " << x << endl;
    cout << "Z: " << z << endl;

    int *px = &x;
    int *py = &y;
    int *pz = &z;

    *py = *px;
    *px = *pz;
    *pz = *py;

    cout << "After Swapping" << endl;
    cout << "X: " << x << endl;
    cout << "Z: " << z << endl;
}