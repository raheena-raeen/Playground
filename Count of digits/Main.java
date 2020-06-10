#include <iostream>

using namespace std;

int main() {

    int num, temp,count = 0;
    cin >> num;
    temp = num;
   do {
        count++;
        temp /= 10;
    } while(temp != 0) ;

    cout  << count;

    return 0;
}