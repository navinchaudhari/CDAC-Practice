#include <iostream>
#include <string>
using namespace std;

	class Books{
		
		int id;
		string name;
		string author;
		float price;

	public:
		Books(){
			id = 1;
			name = "Books";
			author = "writer";
			price = 1;
		}

		//Default Parameter Constructor
		Books(int i, string n, string a = "Chetan Bhagat", float p = 250){
			id = i;
			name = n;
			author = a;
			price = p;
		}
		
		void disp(){
			cout<<"Book Details"<<endl;
			cout<<"Id     : "<<id<<endl;
			cout<<"Name   : "<<name<<endl;
			cout<<"Author : "<<author<<endl;
			cout<<"Price  : "<<price<<endl;
		}
	};


	int main(void){
		Books b;
		Books b1(45, "400 Days");
		b.disp();
		b1.disp();
		return 0;
	}