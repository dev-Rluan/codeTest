#include <iostream>
using namespace std;

bool hansu(int a)
{
    if (a < 100)
        return true;
    else if (a == 1000)
        return false;
    int n1, n2, n3;
    n3 = (a / 100) % 10;
    n2 = (a / 10) % 10;
    n1 = a  % 10;
    if ((n2 - n1) == (n3 - n2))    
        return true;    
    else 
        return false;
    
}
int main()
{
    int N, cnt =0;
    cin >> N;
    for (int i = 1; i <= N; i++) 
    {
        if (hansu(i))
        {
            cnt++;
        }        
    }
    cout << cnt << endl;

    


}

