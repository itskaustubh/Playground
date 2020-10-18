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
  
  int sum=0;
  
  for(int i=0;i<n;i++)
  {
  	for(int j=0;j<m;j++)
    {
    	if(i==0 || i==n-1)
        {
        	sum=sum+a[i][j];
        }
      	else if(i!=0 && 1!=n-1 && i==j)
        {
        	sum=sum+a[i][j];
        }
    }
  }
  
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}
