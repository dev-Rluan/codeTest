#include <iostream>

using namespace std;
int main()
{
    int H, M;
    cin >> H >> M;
    //cin >> M;
    if (M > 45) 
    {
        M = M - 45;
    }
    else if (M == 45) 
    {
        M = 0;
    }
    else
    {
        if (H > 0)
        {
            H--;           
        }
        else 
        {
            H = 23;
        }
        M = 60 + (M - 45);
    }
    std::cout << H << " " << M;
}

