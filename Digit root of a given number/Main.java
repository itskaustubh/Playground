#include<iostream>
using namespace std;

int single(int n)
{
	if ( n <= 9)
      return n;
  	int temp = n;
  	int b = 0,mu=1,add=0;
  	while( temp != 0)
    {	
    	int a = temp % 10;
    	add = a + b;
      	b = add;
      	temp = temp / 10;
    }
  	return single(add);
  	
}

int main()
{
	int n;
  	cin>>n;
  	cout<<single(n);
}