#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string str1,str2;
  getline(cin,str1);
  cin>>str2;
  
  int result;
  
  
  if(str1==str2)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}
