#include <iostream>
#include <string>
using namespace std;
int d(int n) {
    int sum = n;
    sum = n + n / 1000 + n % 1000 / 100 + n % 100 / 10 + n % 10;

    return sum;
}
int main()
{
    bool selfNum[10001] = { false };
    for (int i = 0; i < 10000; i++) 
    {
        if (d(i) < 10000) 
        {
            selfNum[d(i)] = true;
        }            
    }
    for (int j = 0; j < 10000; j++)
    {
        if (!selfNum[j]) {
            cout << j << endl;
        }       
    }

}


