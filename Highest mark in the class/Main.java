#include<iostream>
using namespace std;
int main()
{
	int size;
  	cin>>size;
  	int marks[size];
  	for(int i=0;i<size;i++)
    {
    	cin>>marks[i];
    }
    int high = marks[0];
  	for(int i=1;i<size;i++)
    {
    	if ( marks[i] > high )
          high = marks[i];
    }
  	cout<<high;
  
}