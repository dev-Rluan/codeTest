#include <iostream>
using namespace std;
bool isPrime(int num)
{
    for (int i = 2; i * i <= num; i++)
    {
        if (num % i == 0) 
            return false;
    }
    return true;
}
int main()
{  
    int n, cnt = 0, num;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> num;
        if (num == 1)
            continue;
        if (isPrime(num))
            cnt++;
    }
    cout << cnt << endl;
}
