#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio;
    cin.tie(NULL);
    cout.tie(NULL);

    int N;
    cin >> N;

    for (int i = 0; i < N; i++)
    {
        for (int j = 1; j <= N; j++)
        {
            int cnt = N - i;
            if (j < cnt)
                cout << " ";
            else
                cout << "*";
           
        }       
        cout << "\n";
    }

}