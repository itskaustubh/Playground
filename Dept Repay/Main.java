#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  double intr,amt,disc,fina;
  cin>>x>>y>>z;
  intr=(x*y*z)/100;
  amt=x+intr;
  disc=(intr*2)/100;
  fina=x+intr-disc;
    cout<<intr<<"\n"<<amt<<"\n"<<disc<<"\n"<<fina;
}
