#include <iostream>
using namespace std;

	void singlePointer();
	void doublePointer();

	int main(void){
	
		doublePointer();
	
		return 0;
	}

	void doublePointer(){
	
		int num = 20;
		int *ptrNum = &num;
		int **pptrNum = &ptrNum;
		
		/*cout<<&num<<endl;
		cout<<&ptrNum<<endl;
		cout<<&pptrNum<<endl;

		
		cout<<num<<endl;
		cout<<*ptrNum<<endl;
		cout<<**pptrNum<<endl;

		cout<<&ptrNum<<endl;
		cout<<pptrNum<<endl;

		cout<<ptrNum<<endl;
		cout<<*pptrNum<<endl;*/

		cout<<"============================================================================"<<endl;

		cout<<num<<endl;
		cout<<*ptrNum<<endl;
		cout<<**pptrNum<<endl;
		cout<<"============================================================================"<<endl;
		
		cout<<&num<<endl;
		cout<<ptrNum<<endl;
		cout<<*pptrNum<<endl;
		cout<<"============================================================================"<<endl;
		
		cout<<&ptrNum<<endl;
		cout<<pptrNum<<endl;
		cout<<"============================================================================"<<endl;
		
		cout<<&pptrNum<<endl;
		cout<<"============================================================================"<<endl;

		//change num using num itself
		num = 40;
		cout<<num<<endl;
		
		//changing num using its pointer
		*ptrNum = 60;
		cout<<*ptrNum<<endl;

		//changing num using double pointer
		**pptrNum = 80;
		cout<<**pptrNum<<endl;

		
	}

	void singlePointer(){
	
		int num = 10;
		//pointer to int num
		int *ptrNum = &num;

		cout<<num<<endl;
		cout<<*ptrNum<<endl;

		cout << &num << endl;
		cout << ptrNum << endl;


		num=20;
		cout<<num<<endl;
		
		//change num using ptrNum
		*ptrNum=30;
		cout<<*ptrNum<<endl;

		int num1=40;
		ptrNum = &num1;

		cout<<num1<<endl;
		cout<<*ptrNum<<endl;
		cout<<ptrNum<<endl;
	}