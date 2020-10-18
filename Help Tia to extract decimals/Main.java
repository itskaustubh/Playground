#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
  int flag=0;
	std::string fnum;
  cin>>fnum;
  cout<<"Floating part is : ";
  for(int i=0;i<fnum.length();i++){
     if(flag==1)
       cout<<fnum[i];
  	if(fnum[i]=='.')
      flag=1;
  }
      
  
  }
	//Type your code here
