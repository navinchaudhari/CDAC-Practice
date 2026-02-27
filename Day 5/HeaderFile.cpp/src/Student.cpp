/*
 * Student.cpp
 *
 *  Created on: 27-Feb-2026
 *      Author: Navin
 */
#include <iostream>
#include "Student.h"
using namespace std;

void Student::acceptData() {
	cout << "Enter Roll No:";
	cin >> rollNo;
	cout << "Enter Marks:";
	cin >> marks;
}

void Student::displayData() {
	cout << "Student: " << rollNo << " " << marks << endl;
}

