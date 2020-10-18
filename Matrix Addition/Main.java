#include<iostream>
#include<stdlib.h>
using namespace std;

int** createArray(int n,int m)
{
  int ** ptr;
  ptr=(int**)malloc(n*sizeof(int));
  for(int j=0;j<m;j++)
  {
  	*(ptr+j)=(int*)malloc(m*sizeof(int));
  }
  return ptr;
}

int** getElement(int** a,int n,int m)
{
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
      cin>>*(*(a+i)+j);
    }
  }
  return a;
}

int addMatrix(int** p,int** p1,int **p2,int n,int m)
{
  for(int i=0;i<n;i++)
  {
  	for(int j=0;j<m;j++)
    {
    	*(*(p+i)+j)=*(*(p1+i)+j)+*(*(p2+i)+j);
    }
  }
  
  for(int i=0;i<n;i++)
  {
  	for(int j=0;j<m;j++)
    {
      cout<<*(*(p+i)+j)<<" ";
    }
    cout<<"\n";
  }
}


int main()
{
  int n,m,**p,**p1,**p2,**p3,**p4;
  cin>>n>>m;
  p=createArray(n,m);
  p1=createArray(n,m);
  p2=createArray(n,m);
  p3=getElement(p1,n,m);
  p4=getElement(p2,n,m);
  addMatrix(p,p3,p4,n,m);
}
