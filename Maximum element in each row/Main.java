#include<iostream>
using namespace std;
int main()
{
  int m,n;
  
  cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
  {
  	for(int j=0;j<n;j++)
    {
    	cin>>a[i][j];
    }
  }
  
  int r[m];
  
  int sum=0;
  for(int i=0;i<m;i++)
  {
  	for(int j=0;j<n;j++)
    {
      	if(sum<a[i][j])
      		sum=a[i][j];
    }
    r[i]=sum;
    sum=0;
  }
  
  for(int i=0;i<m;i++ )
    cout<<r[i]<<"\n";
}