#include <iostream>
using namespace std;

	struct Student {

		int prn;
		std::string name;
		float per;

	};

	struct Student1 {

		int prn=2536;
		std::string name;
		float per;

	};
	
	struct Student2 {

		int prn;
		std::string name;
		float per;
		
		void display(){
			cout<<prn<<endl;
			cout<<name<<endl;
			cout<<per<<endl;
		}

	}s2,s3={123, "Bhav", 56.96};

	int main(void){

		Student2 s1 = {1005, "Navin", 74.36};
		s1.display();
		
		s2 = {505, "Vinit", 88.63};
		s2.display();
		
		s3.display();
		
		/*cout << "PRN: "<<s1.prn << endl;
		cout << "Name: "<<s1.name << endl;
		cout << "Percentage: "<<s1.per << endl;*/

		return 0;
	}