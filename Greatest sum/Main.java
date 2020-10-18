#include<iostream>
#include<algorithm>
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
  
  cout<<"Sum of rows is ";
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
  {
  	cout<<r[i]<<" ";
  }
  
  int max=0;
  int x=0;
  for(int i=0;i<n;i++)
  {
  	if(r[i]>=max)
    {
      max=r[i];
      x=i;
    }    	
  }
  
  cout<<"\nRow "<<x+1<<" has maximum sum";
  
  int c[m];
  
  int sum1=0;
  
  cout<<"\nSum of columns is ";
  for(int i=0;i<m;i++)
  {
  	for(int j=0;j<n;j++)
 	 {
  		sum1=sum1+a[j][i];
 	 }
    c[i]=sum1;
    sum1=0;
  }
  
  for(int i=0;i<m;i++)
  {
  	cout<<c[i]<<" ";
  }
  
  int max1=0,x2=0;
  for(int i=0;i<m;i++)
  {
  	if(c[i]>max1)
    {
      max1=c[i];
      x2=i;
    }
  }
  
  cout<<"\nColumn "<<x2+1<<" has maximum sum";
 
}
