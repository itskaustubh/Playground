
#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[100];
  cin.getline(a,100);
  cout<<"The number of letters in the name is "<<strlen(a);
}
