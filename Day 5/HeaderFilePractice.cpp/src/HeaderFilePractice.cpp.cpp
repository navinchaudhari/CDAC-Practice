//============================================================================
// Name        : cpp.cpp
// Author      : Navin
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "Employee.h"
using namespace std;


int main() {
	Employee e;
	e.setId(12);
	e.setName("Navin");
	e.setSalary(12345);
	e.disp();
	return 0;
}
