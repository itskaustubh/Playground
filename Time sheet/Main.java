#include<iostream>
using namespace std;
int main()
{
  int sun,mon,tue,wed,thurs,fri,sat;
  int b,br,r1,r2,r3,r4,r5,r6,r7,r8,r9;
  
  cin>>sun>>mon>>tue>>wed>>thurs>>fri>>sat;
  
  r1=sun*150;
  r7=sat*125;
  
  if(mon<=8)
  {
  	r2=mon*100;
  }
  else if(mon>8)
  {
  	b=mon-8;
    br=b*115;
    r2=br+800;
  }
  
  if(tue<=8)
  {
  	r3=tue*100;
  }
  else if(tue>8)
  {
  	b=tue-8;
    br=b*115;
    r3=br+800;
  }
  
  if(wed<=8)
  {
  	r4=wed*100;
  }
  else if(wed>8)
  {
  	b=wed-8;
    br=b*115;
    r4=br+800;
  }
  
  if(thurs<=8)
  {
  	r5=thurs*100;
  }
  else if(thurs>8)
  {
  	b=thurs-8;
    br=b*115;
    r5=br+800;
  }
  
  if(fri<=8)
  {
  	r6=fri*100;
  }
  else if(fri>8)
  {
  	b=fri-8;
    br=b*115;
    r6=fri+800;
  }
  
  int totalhrs;
  totalhrs=mon+tue+wed+thurs+fri;
  
  if(totalhrs>40)
  {
  	b=totalhrs-40;
    r8=b*25;
  }
  
  int tr;
  tr=r1+r2+r3+r4+r5+r6+r7;
  cout<<tr;
}