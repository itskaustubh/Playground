#include<iostream>
using namespace std;

int fib(int m, int left = 0, int right = 1)
{
  	int temp;
	if(m-2 == 0)
      return right;
    temp = right;
  	return fib(m-1,temp,left+right);
}

int main()
{
	int n,ans;
  	cin>>n;
  	cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n);
}