#include <iostream>
using namespace std;
int Factorial(int num)
{
    if (num > 2)
        num *= Factorial(num - 1);
    return num;
}
int main()
{
    int n;
    cin >> n;
    if (n == 0)
    {
        cout << "1" << endl;
        return 0;
    }        
    cout << Factorial(n);
}