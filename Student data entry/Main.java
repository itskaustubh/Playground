#include <iostream>
using namespace std;
struct student
{
    string name;
    int roll;
    float marks;
};
int main() 
{
  struct student s;
  getline(cin,s.name);
  cin>>s.roll>>s.marks;
  cout<<"\nStudent Details\n";
  cout<<"Name: "<<s.name;
  //for(int i=0;i<s.name.length()-1;i++)
  //  cout<<s.name[i];
  
  cout<<"\nRoll: "<<s.roll;
  cout<<"\nMarks: "<<s.marks;
   //Your code goes here
}