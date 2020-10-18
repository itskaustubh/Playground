#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,bus=0,net=0;
  
  cin>>n>>m;
  
  int arr[n];
  
  for(int i=0;i<n;i++)
    cin>>arr[i];
  
  if(arr[0]==1)
    bus++;
  
  for(int i=0;i<n;i++)
  {
  	arr[i]+=net;
    net=0;
    if((arr[i]+arr[i+1])<=m && i<n-1)
    {
    	i++;
    }
    else if(arr[i]>m && i<n-1)
    {
    	net=m-arr[i];
    }
   bus++;
  }
  
  cout<<bus;
}
