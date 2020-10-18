#include<string.h>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  getline(cin,str);
  string str1="the";
 
  if(str.find(str1)!=string::npos)
  {
  	size_t p=-1;
    
    string tempword=str1+" ";
    while((p=str.find(str1))!=string::npos)
      str.replace(p,tempword.length(),"");
    
    tempword=" "+str1;
    while((p=str.find(str1))!=string::npos)
      str.replace(p,tempword.length(),"");
    
    
  }    cout<<str;}
