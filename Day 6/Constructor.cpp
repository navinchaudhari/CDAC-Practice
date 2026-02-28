#include <iostream>
#include <string>
using namespace std;

	
	class Student{
		int id;
		string name;



	public:
		// Default Constructor or Zero Parameter Const
		Student(){
			id = 0;
			name = "User";
		}
		Student(int i, string n){
			id = i;
			name = n;
		}
		void disp(){
			cout << "Id: " << id << " Name: " << name << endl;
		}
		
	
	};

	int main(void){
		Student s;
		Student s1(12,"Navin");
		s.disp();
		s1.disp();
		
		return 0;
	}