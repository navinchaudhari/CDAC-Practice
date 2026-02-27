#include <iostream>
using namespace std;

	class ConstWithFunc{
		int hi;
		int lo;

	public:
		void setHi(int i) const{
			cout<<"Inside setHi func"<<endl;
			//hi=i;
		}
		void setLo(int i) const{

			cout<<"Inside setlo func"<<endl;
			//lo=i;
		}

		int getHi() const{
			return hi;
		}

		int getlo() const{
			return lo;
		}
	};

	int main(void){
		ConstWithFunc c;

		c.setHi(15);
		c.setLo(-15);

		cout << "hi: " << c.getHi() << endl;
		cout << "lo: " << c.getlo() << endl;

		return 0;
	}