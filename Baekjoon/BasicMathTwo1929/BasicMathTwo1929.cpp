#include <iostream>
using namespace std;
bool IsPrime(int num)
{
	if (num == 1)
		return false;
	for (int i = 2; i * i <= num; i++)
	{
		if (num % i == 0)
			return false;
	}
	return true;
}
int main()
{
	ios::sync_with_stdio;
	cin.tie(NULL);
	cout.tie(NULL);
	
	int m, n;
	cin >> m >> n;
	for (int i = m; i <= n; i++)
	{
		if (IsPrime(i))
			cout << i << '\n';
	}
}
