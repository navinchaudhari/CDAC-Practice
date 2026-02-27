//============================================================================
// Name        : cpp.cpp
// Author      : Navin
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
//#include <Student.h> // Student.h: No such file or directory
#include "Student.h"

// It gives error
/*class Student{
public:
	int rollNo;
	int marks;

	void Student::acceptData() {
		cout << "Enter Roll No:";
		cin >> rollNo;
		cout << "Enter Marks:";
		cin >> marks;
	}

	void Student::displayData() {
		cout << "Student: " << rollNo << " " << marks << endl;
	}

};*/



int main() {
	Student s;
	s.acceptData();
	s.displayData();
	return 0;
}
