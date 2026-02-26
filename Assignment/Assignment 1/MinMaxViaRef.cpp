#include <iostream>
using namespace std;

void findMinMax(int a, int b, int c, int &minVal, int &maxVal);

int main()
{

    int hi = 10;
    int lo = 20;
    findMinMax(4756, 2354, 4521, lo, hi);
    cout << "High: " << hi << endl;
    cout << "Low: " << lo << endl;
    return 0;
}

void findMinMax(int a, int b, int c, int &minVal, int &maxVal)
{

    // cout << "Enter Num1:";
    // cin >> a;
    // cout << "Enter Num2:";
    // cin >> b;
    // cout << "Enter Num3:";
    // cin >> c;

    maxVal = (a > b && a > c) ? a : (b > a && b > c) ? b
                                                     : c;
    minVal = (a < b && a < c) ? a : (b < a && b < c) ? b
                                                     : c;
}