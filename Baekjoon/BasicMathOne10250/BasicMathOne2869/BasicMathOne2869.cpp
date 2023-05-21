#include <iostream>
using namespace std;

int main()
{
    int A, B, V;
    cin >> A >> B >> V;
    if (A >= V)
    {
        cout << "1" << endl;
        return 0;
    }
    int cnt = (V - A) / (A - B) + 1;
    if (((V - A) % (A - B)) != 0)
    {
        cnt++;
    }
    cout << cnt;
    return 0;
}
