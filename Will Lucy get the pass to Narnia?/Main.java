#include<iostream>
using namespace std;
int main()
{
  int x = 5,n1,n2;
  cin>>n1;
  cin>>n2;
  cin>>x;
  cout<<"Enter first number : ";
  cout<<"Enter second number : ";
    cout<<"Menu  ";
  cout<<"\n1.Addition \n";
  cout<<"2.Subtraction \n";
  cout<<"3.Multiplication \n";
  cout<<"4.Division \n";
  cout<<"5.Remainder \n";
  switch(x)
  {
    case 1 :
      cout<<n1+n2;
      break;
      
      case 2 :
      cout<<n1-n2;
      break;
      
      case 3 :
      cout<<n1*n2;
      break;
      
      case 4 :
      cout<<n1/n2;
      break;
      
      case 5 :
      cout<<n1%n2;
      break;
      
      default :
      cout<<"Invalid operation";
      break;
      
      
  }
}