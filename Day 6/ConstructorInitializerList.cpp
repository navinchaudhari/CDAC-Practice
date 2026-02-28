#include <iostream>
#include <string>
using namespace std;

	class Aadhar{
		int aadharNo;
		string name;
		const int dob;

	public:

		// We cannot initialize constant data member inside constructor by following method
		/*Aadhar(int aadharNo, string name, int dob){
			this -> aadharNo = aadharNo;
			this -> name = name;
			this -> dob = dob;
		}*/

		// By using Constructor Initilizer List
		Aadhar(int aadharNo, string name, int dob) : aadharNo(aadharNo), name(name), dob(dob){

		}
		
		//Getters
		int getAadharNo() const {
			return aadharNo;
		}
		string getName() const {
			return name;
		}	

		int getDob() const {
			return dob;
		}	
	};

	int main(void){
		Aadhar a2(4475, "Navin", 13122001);
		cout << a2.getAadharNo() << " " << a2.getName()<< " " <<a2.getDob() << endl;
		return 0;
	}