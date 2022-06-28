#include <iostream>
using namespace std;
bool IsPrime(int num)
{
    if (num == 1)
        return false;
    for (int i = 2; i * i <= num; i++)
    {
        if (num % i == 0)
            return false;
    }
    return true;
}
int main()
{
    // 골드바흐의 추측 
    // 2보다 큰 모든 짝수는 두 소수의 합으로 나타 낼 수 있다는것.
    // 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고한다.
    int t, n;
    cin >> t;
    for (int i = 0; i < t; i++)
    {
        cin >> n;
        n /= 2;
        if (IsPrime(n))
        {
            cout << n << " " << n << "\n";
            continue;
        }
        for (int j = 0; j < n; j++) 
        {
            if (IsPrime(n + j) && IsPrime(n - j))
            {
                cout << n - j << " " << n + j << "\n";
                break;
            }
        }
        
    }
}