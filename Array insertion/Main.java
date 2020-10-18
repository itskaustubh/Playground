#include<iostream>
using namespace std;
int main()
{
  int n;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int a[n];
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
    cin>>a[i];
  
  int k,x;
  cout<<"\nEnter the location where you wish to insert an element";
  cin>>k;
  
  if(k>=n)
  {
  	cout<<"\nInvalid Input";
    exit(0);
  }
  
  cout<<"\nEnter the value to insert";
  cin>>x;
  
  int temp=0;
   
  for(int i=0;i<n;i++)
  {
  	if(i==k-1)
    {
      for(int j=n;j>i;j--)
      {
        temp=a[j];
        a[j]=a[j-1];
        a[j-1]=temp;
      }
    
      a[i]=x;
    }
  }
  
  cout<<"\nArray after insertion is";
  for(int i=0;i<=n;i++)
    cout<<"\n"<<a[i];
}
