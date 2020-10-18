#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,count=0,m;
  cin >> n;
  for(int i=0;i<n;i++){
  	cin >> m;
    if(m%2!=0)
      count++;
  }
  cout<<count<<"\n"<<n-count;
  return 0;
}