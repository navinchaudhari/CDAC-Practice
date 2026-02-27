#include <iostream>
using namespace std;

	int x = 100;

	namespace A {
		int x=20;
	};
	
	namespace B {
		int x=50;
	};

	inline namespace C {
		void disp(){
			cout<<"Inside Inline Func";
		}
	};

	int main(void){

		using A::x;
		//int x = 30;

		cout<< x <<endl;
		disp(); //inline function can be called directly
		return 0;
	}