#include<iostream>
using namespace std;
int main()
{
	int a,b,c,s;
  	cin >> a >> b >> c;
  	s = c/a;
  	if(a==10)
      cout<<"It is not a mango tree";
  else{
  	if(s==2||s==b-1) cout << "It is a mango tree";
  	else cout << "It is not a mango tree"; 
  }
}