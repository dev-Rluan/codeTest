#include <iostream>
using namespace std;
int main()
{
    int N,cnt = 0, sum = 1;
    cin >> N;
    while (true)
    {
        if (N <= sum+(6 * cnt))
        {
            cout << ++cnt;
            break;
        }
        sum += 6 * cnt;
        cnt++;
    }
    
}