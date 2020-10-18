#include<iostream>
using namespace std;

int printresult(int *a,int n,int s)
{
	int t=0,flag=0,i=0;
  	while(i<n)
    {
      t=t+a[i];
    		if(t<=s)
            {
            	i++;
            }
      		else
            {
            	flag=1;
              	cout<<"NO";
              break;
            }
    }
  	if(flag==0)
      cout<<"YES";
}	
int main()
{
  int n,s;
  cin>>n>>s;
  
  int a[n];
  
  for(int i=0;i<n;i++)
    cin>>a[i];
  
  for(int i=0;i<n;i++)
  {
  	for(int j=i+1;j<n;j++)
    {
      if(a[i]>a[j])
      {
        int temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
  }
  
  printresult(a,n,s);
  
  /*if(x==1)
  	cout<<"No";
  else
    cout<<"Yes";*/
}