#include <iostream>
using namespace std;

int absoluteValue(int n);
int clamp(int val, int lo, int hi);

int main(void)
{
    int n = -20;
    int val = -15;
    int lo = -10;
    int hi = 10;

    // cout << absoluteValue(0) << endl;
    cout << "val\t" << " lo\t" << " hi\t" << "Absolute Value\t" << "clamp(val,lo,hi)" << endl;
    cout << -15 << "\t" << lo << "\t" << hi << "\t" << absoluteValue(n) << "\t\t" << clamp(val, lo, hi) << endl;

    return 0;
}

int clamp(int val, int lo, int hi)
{

    return val < lo ? lo : val > hi ? hi
                                    : val;
}

int absoluteValue(int n)
{
    return n > 0 ? n : n + (2 * -n);
}