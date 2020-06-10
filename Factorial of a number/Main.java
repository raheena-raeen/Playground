#include<iostream>

using namespace std;

int main()
{
     // Variable Declaration
     int counter, n, fact = 1;
     // Get Input Value
     
     cin>>n;
     //for Loop Block
     for (int counter = 1; counter <= n; counter++)
     {
         fact = fact * counter;
     }
     cout<<fact;
     // Wait For Output Screen

     return 0;
 }