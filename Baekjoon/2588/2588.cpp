#include <iostream>
using namespace std;

int main()
{
    int A, B[3], C;
    cin >> A;
    for (int i = 0; i < 3; i++)
    {
        C = scanf("%1d", &B[i]);
    }      
    for (int i = 2; i >= 0; i--)
    {
        cout << A * B[i] <<"\n";
    }
    int BLength = (B[0] * 100) + (B[1] * 10) + B[2];

    cout << BLength*A << "\n";

}
