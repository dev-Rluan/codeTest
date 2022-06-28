#include <iostream>
#include <cmath>
#define PI 3.1415926535897932
using namespace std;
int main()
{
    // 유클리드 기하학 원의 넓이 : πr^2
    // 택시 기하학에서 원의 넒이 : 2r^2
    double r;
    cin >> r;
    cout << fixed;
    cout.precision(6);
    cout << r *r *PI << endl;
    cout << r * r * 2 << endl;

}
