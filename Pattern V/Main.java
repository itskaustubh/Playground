#include<iostream>
using namespace std;
int main()
{
	int n;
  cin>>n;
  int space=0;
  int num=1,k=1;
  int number=n;
  int i;
 
  
  	for(i=0;i<n;i++)
    {
    	for(int j=1;j<=space;j++)
          cout<<"-";
      
      	for(int m=1;m<2*n-space;m++)
        {
        	if(m%2==0)
              cout<<"*";
          	else
              cout<<num++;
        }
      	cout<<"*";
      	for(int d=1;d<2*n-space;d++)
        {
        	if(d%2==0)
              cout<<"*";
          	else
            {
              cout<<k+number*number;
              k++;
            }
        }
      
      	number--;
      	space=space+2;
      	cout<<"\n";
    }
}


