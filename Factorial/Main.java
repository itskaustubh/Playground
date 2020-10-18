#include<iostream>
using namespace std;

int fact(int m)
{
    if( m == 1)
        return 1;
    return m * fact(m-1);
}
int main()
{
	int n;
  	cin>>n;
	cout<<"The factorial of "<<n<<" is "<<fact(n);
}