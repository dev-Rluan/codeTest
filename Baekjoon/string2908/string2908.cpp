#include <iostream>
#include <string>

using namespace std;
int main()
{
    string a, b;
    string temp;
    cin >> a >> b;
    for (int i = 2; i >= 0; i--) 
    {       
        if (a[i] > b[i])
        {
            temp = a; 
            break;
        }
        else if (a[i] < b[i])
        {
            temp = b; 
            break;
        }
    }   
    cout << temp[2] << temp[1] << temp[0] << endl;
}

