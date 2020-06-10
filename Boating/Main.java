#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z,a,b,r;
  cin>>z;
  cin>>x;
  cin>>y;
  a=x*75;
  b=y*30;
  r =a+b;
  
  if(r<=z)
  {
  cout<<"Boat is stable";
  }
  else
  {
   cout<<"Boat will drow";
  }
}