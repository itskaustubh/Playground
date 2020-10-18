#include<iostream>
using namespace std;
int main()
{
  int n,i=0;
  float count=0.0f;
  
  do
  {
  	cin>>n;
    if(n<0)
    {
    	count=count-1.0;
    }
    else if(n%2==1)
    {
    	count++;
      i++;
    }
    else
      count=count-0.5;
    
  
  }while(n>0 && i!=3);
  
    cout<<count;
}


