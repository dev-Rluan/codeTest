﻿#include <iostream>
#include <string>
using namespace std;
int main()
{
    int t, r;
    string s;
    cin >> t;
    for (int i = 0; i < t; i++) 
    {
        cin >> r;
        cin >> s;
        for (int j = 0; j < s.size(); j++)
        {
            for (int k = 0;  k< r; k++)
            {
                cout << s[j];
            }
        }
        cout << endl;
    }
}