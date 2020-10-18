#include<iostream>
using namespace std;
int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
int main()
{
  int a,b,c,d;
  cin >> a >> b >> c >> d;
  int var = gcd(a,b);
  gcd(var,c) == d ? cout<<"Answer is correct.":
  cout<<"Answer is wrong.";
  
 
}