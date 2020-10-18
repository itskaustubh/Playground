#include<iostream>
using namespace std;

/*void calcSpan(int *a,int *s,int n)
{
	s[0]=1;
  	
  	for(int i=1;i<n;i++)
    {
    	s[i]=1;
      
      	for(int j=i-1;j>=0 && a[j]<a[i];j--)
          s[i]++;
    }  	
}*/

void stockSpan(int n,int* a)
{
  	int s[n];
  	s[0]=1;
  	
  	for(int i=1;i<n;i++)
    {
    	s[i]=1;
      
      	for(int j=i-1;j>=0 && a[j]<a[i];j--)
          s[i]++;
    }
  
	for(int i=0;i<n;i++)
      cout<<s[i]<<"\n";
}

int main()
{
  int n,m,sum=0;
  cin>>n;
  int a[n],a1[n];
  
  for(int i=0;i<n;i++)
    cin>>a[i];
  
  //calcspan(a,s,n);
  m=a[0];
  a1[0]=1;
  
  for(int i=1;i<n;i++)
  {
  	if(a[i]<m)
    {
    	a1[i]=1;
      m=a[i];
    }
    else 
    {
      sum=sum+2;
      a1[i]=sum;
      m=a[i];
    }
  }
  for(int i=0;i<n;i++)
    cout<<a1[i]<<"\n";
  
  return 0;
}
