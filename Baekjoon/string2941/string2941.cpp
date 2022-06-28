#include <string>
#include <iostream>
#include <vector>
using namespace std;
int main()
{
    int cnt = 0;
    string str;
    vector<string> strArr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
    cin >> str;
    cnt += (int)str.size();
    for (int i = 0; i < str.size(); i++)
    {
        for (string s : strArr)
        {
            if (str.find(s) == -1)
            {
                 continue;
            }
            if (str.find(s, i) <= i)
            {
                if (s == "dz=") 
                {
                    cnt--;
                    continue;
                }
                 cnt -= (s.size() - 1);
            }
        }
    }
    std::cout <<cnt << endl;
}
