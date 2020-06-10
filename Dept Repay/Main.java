#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int rate,time,amount;
  double si,d=0.02,fd,s,fa;
  cin>>amount;
  cin>>rate;
  cin>>time;
  si=(amount*rate*time)/100;
  fd=si*d;
  cout<<si<<"\n";
  fa=amount+si;
  cout<<fa<<"\n";
  cout<<fd<<"\n";
  s=si-fd+amount;
  cout<<s<<"\n";
}