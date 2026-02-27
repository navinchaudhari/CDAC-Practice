#include <iostream>
using namespace std;


	typedef class Room {
	public:
		int win = 5;
	} R;

	typedef struct Home{
		int room=25;
	} H;

	//Cannot define typedef with functions
	/*int typedef func(){
		return 56;
	} F;*/

	int main(void){


		Room r1;
		cout<<"Windows: "<<r1.win << endl;	
		
		R r2;
		cout<<"Windows: "<<r2.win << endl;	

		Home h;
		cout<<"Rooms: "<<h.room << endl;
		
		H h1;
		cout<<"Rooms: "<<h1.room << endl;
		


		typedef int OddNum;

		OddNum n1 = 1;
		OddNum n2 = 3;
		int num = 4;

		cout<<"OddNum:"<<n1<<endl;
		cout<<"OddNum:"<<n2<<endl;
		cout<<"int:"<<num<<endl;

		return 0;
	}