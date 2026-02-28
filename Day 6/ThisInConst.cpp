#include <iostream>
#include <string>
using namespace std;

	class Animals{
	
		string type;
		int legs;
		
	public:
		//Constructors
		Animals(){
			type = "Herbivorous";
			legs = 4;
		}
		
		Animals(string type, int legs){
			this -> type = type;
			this -> legs = legs;
		}


		void setType(string type){
			this -> type = type;
		}

		void setLegs(int legs){
			this -> legs = legs;
		}
		
		// Getters
		string getType() const{
			return type;
		}
		int getLegs() const{
			return legs;
		}
		
	
	};

	int main(void){
	
		Animals a1;
		Animals a2("Omnivorous", 4);

		a1.setType("Carnivorous");
		a1.setLegs(4);

		cout<<a1.getType()<<" "<<a1.getLegs()<<endl;
		cout<<a2.getType()<<" "<<a2.getLegs()<<endl;
		return 0;
	}