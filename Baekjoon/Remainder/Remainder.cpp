#include <iostream>

using std::cout;
using std::cin;

int main()
{
    int A, B, C;
    cin >> A;
    cin >> B;
    cin >> C;
    cout << (A + B) % C <<"\n";
    cout << ((A % C) + (B % C)) % C << "\n";
    cout << (A * B) % C << "\n";
    cout << ((A % C) * (B % C)) % C << "\n";

}

