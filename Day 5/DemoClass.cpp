#include <iostream>
using namespace std;

	class Employee{
	public:
		int id;
		char name[60];
		int salary;
	

		void acceptData(){
			cout<<"Id: ";
			cin>>id;

			cout<<"Name: ";
			cin>>name;

			cout<<"Salary: ";
			cin>>salary;

		}

		void displayData(){
			cout << "Employee : " << id << " " << name<<" " << salary << endl;
		}
	};

	int main(){
		Employee e;
		e.acceptData();
		e.displayData();

		//cout<<e.id<<endl;
		//cout<<e.name<<endl;
		//cout<<e.salary<<endl;
		//e.func();
		return 0;
	}