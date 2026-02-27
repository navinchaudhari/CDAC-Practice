/*
 * Employee.h
 *
 *  Created on: 27-Feb-2026
 *      Author: Navin
 */
#include <string>
#ifndef EMPLOYEE_H_
#define EMPLOYEE_H_

class Employee{

	int id;
	std::string name;
	int salary;

public:
	void setId(int i);
	void setName(std::string s);
	void setSalary(int sl);

	int getId();
	std::string getName();
	int getSalary();

	void disp();

};




#endif /* EMPLOYEE_H_ */
