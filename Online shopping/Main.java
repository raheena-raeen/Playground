#include<iostream>
using namespace std;
int main()
{
 int fs,fd,fsc, ss,sd,ssc, as,ad,asc;
  cin>>fs>>fd>>fsc>>ss>>sd>>ssc>>as>>ad>>asc;
  int ft,st,at;
  ft=fs - (fs*fd/100) +fsc;
  cout<<"In Flipkart Rs."<<ft;
  st=ss - (ss*sd/100) +ssc;
  cout<<"\nIn Snapdeal Rs."<<st;
  at=as - (as*ad/100) +asc;
  cout<<"\nIn Amazon Rs."<<at;
  
  if(ft<=st &&ft<=at)
  {
  cout<<"\nHe will prefer Flipkart";
  }
  
  else if(ft>=st && st<=at)
  {
  cout<<"\nHe will prefer Snapdeal";
  }
  else 
  {
  cout<<"\nHe will prefer Amazon";
  }
}