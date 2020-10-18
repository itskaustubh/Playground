#include<iostream>
using namespace std;
 
struct time{
  int hr;
  int min;
  int sec;
};
 
int main()
{
  struct time t1,t2,t3;
  cin>>t1.hr>>t1.min>>t1.sec;
  cin>>t2.hr>>t2.min>>t2.sec;
  
  if(t2.sec>t1.sec)
  {
  	--t1.min;
    t1.sec+=60;
  }
  t3.sec=t1.sec-t2.sec;
  
  if(t2.min>t1.min)
  {
  	--t1.hr;
    t1.min+=60;
  }
  t3.min=t1.min-t2.min;
  t3.hr=t1.hr-t2.hr;
  
  cout<<t3.hr<<":"<<t3.min<<":"<<t3.sec;
}
 
 
