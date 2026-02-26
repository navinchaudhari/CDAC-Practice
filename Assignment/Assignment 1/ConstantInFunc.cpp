#include <iostream>
#include <iomanip>
using namespace std;

const float PI = 3.14159f;

float circleArea(float radius);
float circlePerimeter(float radius);

int main(void)
{
    // We cannot Reassign Constant Value
    //PI = 3.0f; //error: assignment of read-only variable 'PI'
    std::cout << std::fixed << std::setprecision(4);
    cout << "Area of Circle: " << circleArea(7.0f) << endl;
    cout << "Perimeter of Circle: " << circlePerimeter(7.0f) << endl;

    return 0;
}

float circleArea(float radius)
{
    float area = PI * (radius * radius);
    return area;
}

float circlePerimeter(float radius)
{
    float area = 2 * PI * radius;
    return area;
}