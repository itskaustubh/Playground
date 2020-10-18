#include<iostream>
using namespace std;
 
struct details{
char name[30];
  char city[30];
  int est;
  float per;
};
 
int main()
{
  int n;
  cout<<"Enter the number of colleges";
  cin>>n;
  
  details s[n];
  
  for(int i=0;i<n;i++)
  {
  	cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name\nEnter city\nEnter year of establishment\nEnter pass percentage";
    cin>>s[i].name;
    cin>>s[i].city;
    cin>>s[i].est;
    cin>>s[i].per;
  }
  
  cout<<"\nDetails of colleges";
  for(int i=0;i<n;i++)
  {
  	cout<<"\nCollege:"<<i+1<<"\nName:"<<s[i].name<<"\nCity:"<<s[i].city;
    cout<<"\nYear of establishment:"<<s[i].est;
	cout<<"\nPass percentage:"<<s[i].per;
  }
}
 
