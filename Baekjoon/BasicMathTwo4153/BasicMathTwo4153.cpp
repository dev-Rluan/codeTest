#include <iostream>
using namespace std;
bool IsRight(int x, int y, int z)
{
	int temp;
	if (x > y) 
	{
		temp = x;
		x = y;
		y = temp;
	}
	if (y > z)
	{
		temp = y;
		y = z;
		z = temp;
	}
	return (x * x) + (y * y) == (z * z) ? true : false;
}
int main()
{
	int x, y, z;
	
	while (true)
	{
		cin >> x >> y >> z;
		if (x == 0 && y == 0 && z == 0)
			break;
		if (IsRight(x, y, z))
			cout << "right" << endl;
		else
			cout << "wrong" << endl;
	}
}
