#include<iostream>
using namespace std;

int power(int n,int p,int o)
{
  	
  	if ( p == 1)
      return n;
  	return power(n*o,--p,o);
	  	
}
int main()
{
  int n,p;
  cout<<"Enter the value of a";
  cin>>n;
  cout<<"\nEnter the value of n";
  cin>>p;  
  cout<<"\nThe value of "<<n<<" power "<<p<<" is "<<power(n,p,n);
}