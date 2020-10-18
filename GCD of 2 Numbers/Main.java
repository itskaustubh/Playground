#include<iostream>
using namespace std;

int gcd(int a,int b,int n)
{
	if ( a % n == 0 && b % n == 0)
      return n;
  	return gcd(a,b,n-1);
}

int main()
{
  int a,b;
  cin>>a>>b;
  if (a < b)
  	cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b,a);
  else
    cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(b,a,b);
}