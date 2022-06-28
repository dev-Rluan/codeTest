#include <iostream>
using namespace std;
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int T, A, B;
    cin >> T;
    int *arr = new int[T];
    for (int i = 0; i < T; i++)
    {
        cin >> A >> B;
        arr[i] = A + B;
    }
    for (int i = 0; i < T; i++)
    {
        cout << arr[i] << "\n";
    }
    
}

