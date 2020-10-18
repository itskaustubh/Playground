#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string str;
  getline(cin,str);
  int l=str.size();
  
  
  int vc=0,dc=0,cc=0,wc=0,dic=0,ss=0;
  for(int i=0;str[i]!='\0';i++)
  {
  	if((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z'))
    {
    	if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U')
          vc++;
      	else
          dc++;
    }
    else if(str[i]>='0' && str[i]<='9')
      dic++;
    else if(str[i]==' ')
      wc++;
    else
      ss++;
      
  }
  cout<<"Vowels:"<<vc<<"\nConsonants:"<<dc<<"\nWhite Spaces:"<<wc<<"\nDigits:"<<dic<<"\nSymbols:"<<ss;
  
}

