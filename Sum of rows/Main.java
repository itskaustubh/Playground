#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin>>n>>m;
  
  int a[n][m];
  
  for(int i=0;i<n;i++)
  {
  	for(int j=0;j<m;j++)
    {
    	cin>>a[i][j];
    }
  }
  
  int r[n];
  int sum=0;
  
  for(int i=0;i<n;i++)
  {
  	for(int j=0;j<m;j++)
    {
    	sum=sum+a[i][j];
    }
    r[i]=sum;
    sum=0;
  }
  
  for(int i=0;i<n;i++)
    cout<<r[i]<<"\n";
}