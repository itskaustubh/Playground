#include<iostream>
using namespace std;
 
struct dist{
  int feet;
  float inch;
};
 
int main()
{
  dist d1,d2,sum;
  
  cin>>d1.feet>>d1.inch>>d2.feet>>d2.inch;
  
  sum.feet=d1.feet+d2.feet;
  sum.inch=d1.inch+d2.inch;
  
  if(sum.inch>12)
  {
  	++sum.feet;
    sum.inch=sum.inch-12;
  }
  
  cout<<sum.feet<<"'-"<<sum.inch<<"\"";
  }
