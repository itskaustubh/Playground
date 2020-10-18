#include<iostream>
using namespace std;
int main()
{
	int size,id;
  	cin>>size;
  	int list[size];
  	for(int i=0;i<size;i++)
    	cin>>list[i];
  	cin>>id;
	int passed = 0;
  	for(int i=0;i<size;i++)
		if ( list[i] == id)
        {
          cout<<"She passed her exam";
  	      passed = 1;
        }
  	if (passed == 0)
      cout<<"She failed";
  
}