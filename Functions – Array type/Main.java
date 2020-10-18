#include<iostream>
using namespace std;

int call(int n,int* a)
{
	int oc=0,ec=0;
  
  	for(int i=0;i<n;i++)
    {
    	if(a[i]%2==0)
          ec=ec+1;
      else
        oc=oc+1;
    }
  
  	if(ec==n)
      return 1;
  else if(oc==n)
    return 2;
  else
    return 3;
}

int main()
{
  int n;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  
  int a[n];
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
    cin>>a[i];
  
  int result=call(n,a);
  
  if(result==1)
    cout<<"\nThe array is Even";
  else if(result==2)
    cout<<"\nThe array is Odd";
  else
    cout<<"\nThe array is Mixed";
}

