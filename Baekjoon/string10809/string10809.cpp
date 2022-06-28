#include <iostream>
#include <string>
using namespace std;

int main()
{
    string s;
    int n[26] = {0}, cnt = 0, t;
    
    for (int i = 0; i < 26; i++)
    {
        n[i] = -1;
    }
    cin >> s;

    for (int i = 0; i < s.size(); i++) 
    {
        t = s[i] - 'a';
        if (n[t] == -1) 
        {
            n[t] += ++cnt;
        }
        else {
            cnt++;
        }
    }
    for (int i = 0; i < 26; i++)
    {
        cout << n[i] << " ";
    }
}
