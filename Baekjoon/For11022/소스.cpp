#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio;
    cin.tie(NULL);
    cout.tie(NULL);

    int T;
    cin >> T;
    int* A = new int[T];
    int* B = new int[T];
    for (int i = 0; i < T; i++)
    {
        cin >> A[i] >> B[i];       
    }
    for (int i = 0; i < T; i++)
    {
        cout << "Case #" << i + 1 << ": " << A[i] << " + " << B[i] << " = " << A[i] + B[i] << "\n";
    }

}