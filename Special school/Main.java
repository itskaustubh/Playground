
#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[50],b[50],c[50];
  cin>>a;
  cin>>c;
  
  int count=0;
  for(int i=0;a[i]!='\0';i++)
    count++;
  
  int i=0,j=0;
  
  while(a[j+1])
  	j++;
  
  while(i<j)
  {
  	char temp=a[i];
    a[i]=a[j];
    a[j]=temp;
    i++;
    j--;
  }
    
  
  
  
 if(strcmp(c,a)==0)
   cout<<"It is correct";
  else
    cout<<"It is wrong";
  
  
}

