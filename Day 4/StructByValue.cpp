#include <iostream>
using namespace std;
	
	struct Employee{
	
		int id;
		char name[40];
		int salary;
		
	};
		void acceptData(Employee e){
			cout << "Enter Id: ";
			cin >> e.id;
			cout << "Enter Name: ";
			cin >> e.name;
			cout << "Enter Salary: ";
			cin >> e.salary;
		}
	
		void display(Employee e){
			cout << "Id: "<<e.id << endl;
			cout << "Name: "<<e.name << endl;
			cout << "Salary: "<<e.salary << endl;
		}	

	int main(void){
	
		Employee e1;

		//Call By Value
		acceptData(e1);
		
		//It shows garbage value
		display(e1);

		return 0;
	}