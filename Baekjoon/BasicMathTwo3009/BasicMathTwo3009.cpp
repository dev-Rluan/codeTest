#include <iostream>
using namespace std;
int GetPos(int num1, int num2, int num3)
{
	if (num1 == num2)	
		return num3;	
	else if (num1 == num3)
		return num2;
	else
		return num1;
}
int main()
{
	int x, y, xTemp = 0, yTemp = 0, xCnt, yCnt;
	int x1[3], y1[3];
	for (int i = 0; i < 3; i++) 
	{
		cin >> x >> y;
		x1[i] = x;
		y1[i] = y;
	}
	cout << GetPos(x1[0], x1[1], x1[2]) << " " << GetPos(y1[0], y1[1], y1[2]) << endl;

}

