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
	int n;
	while (true)
	{
		int cnt = 0;
		cin >> n;
		if (n == 0)
			break;
		for (int i = n + 1; i <= (2 * n); i++) 
		{
			if (IsPrime(i))
				cnt++;
		}
		cout << cnt << '\n';
	}
}

