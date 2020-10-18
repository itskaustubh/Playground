#include<iostream>
#include<bits/stdc++.h>
using namespace std;
struct Student { 
  char name[30]; 
  char department[20]; 
  int yearOfStudy;
  float cgpa;
};
 
  bool compare(Student a,Student b)
  {
  	if(a.name<b.name)
      return 1;
    else
      return 0;
  }
 
int main()
{
	int n;
  	cout<<"Enter the number of students";
  cin>>n;
  	
  
 struct Student s[n];
  
for(int i=0;i<n;i++)
  {
  cout<<"\nEnter the details of student "<<i+1;
  	cout<<"\nEnter name";
  cin>>s[i].name;
  cout<<"\nEnter department";
  cin>>s[i].department;
  cout<<"\nEnter year of study";
  cin>>s[i].yearOfStudy;
  cout<<"\nEnter cgpa";
  cin>>s[i].cgpa;
  }
  
  sort(s,s+n,compare);
  
  	cout<<"\nDetails of students";
  
   for(int i=0;i<n;i++)
  {
     cout<<"\nStudent "<<i+1;
  	 cout<<"\nName:"<<s[i].name<<"\nDepartment:"<<s[i].department;
	cout<<"\nYear of study:"<<s[i].yearOfStudy<<"\nCGPA:"<<s[i].cgpa;
	
  }
  return 0;
}
 
