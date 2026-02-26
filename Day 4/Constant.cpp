#include <iostream>
using namespace std;

	void constant();
	void pointerToConstantData();
	void constantPointer();
	void constantPointerToConstantData();

	int main(void){
		
		//pointerToConstantData();
		//constantPointer();
		constantPointerToConstantData();

		return 0;
	}
	
	void constantPointerToConstantData(){
		
		int num = 13;
		const int * const ptr = &num;
		cout<<num<<endl;
		cout<<*ptr<<endl;
	
		//We cannot change value
		//*ptr = 15; //error: assignment of read-only location '*(const int*)ptr'
		
		int num2 = 17;

		//We cannot change address also
		//ptr = &num2; //error: assignment of read-only variable 'ptr'
	}
	
	void constantPointer(){

		/*
		int num = 70;
		int *const ptr = &num;

		cout<<num<<endl;
		cout<<*ptr<<endl;
	
		// We cange the value 
		*ptr = 140;

		cout<<num<<endl;
		cout<<*ptr<<endl;

		int num2 = 210;
		*/
		
		//We can not change the pointer address
		//ptr = &num2; //error: assignment of read-only variable 'ptr'

		int num = 60;
		//*const int ptr = &num; //Invalid

		cout<<num<<endl;
		//cout<<*ptr<<endl;		


	}
		
	
	void pointerToConstantData(){

		/*
		int num = 50;
		const int* ptr = &num;
		
		cout<<num<<endl;
		cout<<*ptr<<endl;
		
		num = 100;
		cout<<num<<endl;

		//We cannot change value
		//*ptr = 150; // error: assignment of read-only location '* ptr'
		//cout<<ptr<<endl;

		int num2 = 150;
		//We can change the address
		ptr = &num2;


		cout<<"Num: "<<num<<endl;
		cout<<"Num2: "<<num2<<endl;
		cout<<"Ptr: "<<*ptr<<endl;

		cout<<"Add Num2: "<<&num2<<endl;
		cout<<"Add Ptr: "<<ptr<<endl;
		*/

		
		int num = 30;
		int const* ptr= &num;

		//const * int ptr = &num; //Invalid
		cout<<"Num: "<<num<<endl;
		cout<<"Ptr: "<<*ptr<<endl;
		
		//*ptr = 60;
		//cout<<"New ptr: "<<num<<endl;

		int num2 = 120;
		ptr = &num2;
		cout<<"Num2: "<<num2<<endl;
		cout<<"Ptr: "<<*ptr<<endl;
	}

	void constant(){
		float const PI = 3.14;
		//cin >> PIf;
		//PI = 4.7895;
		cout << PI << endl;	
	}
