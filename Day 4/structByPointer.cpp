#include <iostream>
using namespace std;

	struct Employee{
	
		int id;
		char name[40];
		int salary;
		
	};
		void acceptData(Employee *e){
			cout << "Enter Id: ";
			cin >> e->id;
			cout << "Enter Name: ";
			cin >> e->name;
			cout << "Enter Salary: ";
			cin >> e->salary;
		}
	
		void display(Employee *e){
			cout << "Id: "<<e->id << endl;
			cout << "Name: "<<e->name << endl;
			cout << "Salary: "<<e->salary << endl;
		}

	int main(void){
		
		//Call By Reference
		Employee e;
		acceptData(&e);
		display(&e);
		
		return 0;
	}
	