#include<iostream>
using namespace std;

void print(int n,int m)
{
	int res;
  	if(n<m)
      res=n;
  else
    res=m;
  
  if(res%2==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}

int main()
{
  int n,m;
  cin>>n>>m;
  print(n,m);
    
}
