/*
 * Employee.cpp
 *
 *  Created on: 27-Feb-2026
 *      Author: Navin
 */

#include <iostream>
#include <string>
#include "Employee.h"

using namespace std;

//Setters
void Employee::setId(int i) {
	id = i;
}
void Employee::setName(std::string s) {
	name = s;
}
void Employee::setSalary(int sl) {
	salary = sl;
}


//Getters
int Employee::getId() {
	return id;
}
std::string Employee::getName() {
	return name;
}
int Employee::getSalary() {
	return salary;
}

//Display Employee Details
void Employee::disp() {
	cout << "Employee Details:" << endl;
	cout << "ID: " << id << endl;
	cout << "Name: " << name << endl;
	cout << "Salary: " << salary << endl;
}

