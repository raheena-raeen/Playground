#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int i;
  float t;
  
  cin>>i>>t;
   if(i==2)
   {
     cout<<fixed<<setprecision(2)<<(t*0.5) +t;
   }
  else if(i==3)
  {
    cout<<fixed<<setprecision(2)<<t*2;
  }
  else
  {
  cout<<"Number of items is more";
  }
}