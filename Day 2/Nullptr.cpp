#include <iostream>

using namespace std;



	void func(int ptr){

		cout<<"inside int func"<<endl;

	}

	void func(int *ptr){

		cout<<"inside *int func"<<endl;

	}

	int main(void){
	
	int *ptr = NULL;
	int *ptr1 = nullptr;
	
	func(*ptr);
	func(ptr1);

	cout<<"NULL ptr "<<ptr<<endl;
	cout<<"nullptr ptr "<<ptr1<<endl;

	return 0;
	}