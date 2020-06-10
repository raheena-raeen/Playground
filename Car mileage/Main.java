#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float x;
  int y,z;
  cin>>x>>y>>z;
  float r = x*y;
  if(r>=z)
  {
  cout<<"Can reach";
  }
  else
  {
  cout<<"Cannot reach";
  }
}