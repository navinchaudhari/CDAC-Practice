#include <iostream>45

using namespace std;

	void grade(){
	
		float maths, english, science, coding, history;
		cout<<"Enter Maths Marks: ";
		cin>>maths;
		cout<<"Enter English Marks: ";
		cin>>english;
		cout<<"Enter Science Marks: ";
		cin>>science;
		cout<<"Enter Coding Marks: ";
		cin>>coding;
		cout<<"Enter History Marks: ";
		cin>>history;

		float totalMarks = (maths+english+science+coding+history);
		float percentage=(float)(totalMarks/500)*100;

		cout<<totalMarks<<endl;
		cout<<percentage<<"%"<<endl;

		char grade = (percentage>=75)?'A':((percentage>=65)?'B':((percentage>=45)?'C':'F'));
		cout<<grade<<endl;
	

	}



	int main(){

		grade();
		return 0;
	}