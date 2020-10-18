#include<iostream>
using namespace std;

int main(){
  int a,b,c,sum=0;
  cin >> a >> b;
  c = a+b;
  for(int i=1;i<c/2+1;i++){
    if(c%i==0)
      sum+=i;
  }
  if(sum==c) cout<<"They can read the message";
  else cout<<"They can't read the message";
}
