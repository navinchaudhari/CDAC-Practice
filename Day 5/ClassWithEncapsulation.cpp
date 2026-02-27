#include <iostream>
using namespace std;


	class Voter{

	//public: // can be used to make data member and function public access
		int id;
		int age;
		
	public: // create public getter and setter to access and validate the private data members.
		void setId(int x){
			id=x;
		}
		void setAge(int x){
			age=x;
		}
		
		int getId(){
			return id;
		}

		int getAge(){
			return age;
		}


	};

	int main(){

		Voter e;
		e.setId(100);
		e.setAge(25);

		cout<<"ID: " << e.getId() <<endl;
		cout<<"Age: "<< e.getAge() <<endl;

		return 0;
	}