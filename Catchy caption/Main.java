#include <cstring>
#include <iostream>
using namespace std;
int main()
{
  string str;
  getline(cin,str);
  int count=0;
  for(int i=0;i<str.length()-1;i++){
  	if(str[i]==' ')
      count++;
  }
  if(count<=10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
   //Your code goes here
   
}