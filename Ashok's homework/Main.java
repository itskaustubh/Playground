#include<iostream>
using namespace std;
int main()
{
	int r,c;
  	cin>>r>>c;
  	int list1[r][c];
  	int list2[r][c];
  	for( int i=0;i<r;i++)
      for(int j=0;j<c;j++)
      {
      	cin>>list1[i][j];
      }
  	for( int i=0;i<r;i++)
      for(int j=0;j<c;j++)
      {
      	cin>>list2[i][j];
      }  
  	int add[r][c];
  	for( int i=0;i<r;i++)
      for(int j=0;j<c;j++)
    	{
      		add[i][j] = list1[i][j] + list2[i][j]; 
    	}
  	
  	for( int i=0;i<r;i++)
    {
      	for(int j=0;j<c;j++)
    		{
      			cout<<add[i][j]<<" ";
    		}
		cout<<endl;
    }
}