#include <iostream>
using namespace std;

//By Default Data Members and Member Functions are public in Structure
	struct Employee{
	
	private:
		int id=56;
		char name[40]="Navin";
		int salary=12356;

	public:
		void acceptData(){
			cout << "Enter Id: ";
			cin >> id;
			cout << "Enter Name: ";
			cin >> name;
			cout << "Enter Salary: ";
			cin >> salary;
		}
	
		void display(){
			cout << "Id: "<<id << endl;
			cout << "Name: "<<name << endl;
			cout << "Salary: "<<salary << endl;
		}
		
	};
		

	int main(void){
		
		Employee e;
		//e.id=65;
		e.acceptData();
		e.display();
		
		return 0;
	}
	