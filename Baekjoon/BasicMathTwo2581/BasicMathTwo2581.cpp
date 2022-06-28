#include <vector>
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
	vector<int> vec_prime;
	int m, n, sum = 0;
	cin >> m >> n;
	for (int i = m; i <= n; i++)
	{
		if (IsPrime(i))
			vec_prime.push_back(i);
	}
	if (vec_prime.empty())
	{
		cout << "-1" << endl;
		return 0;
	}
	for (int a : vec_prime)
	{
		cout << a << " : ";
		sum += a;
	}
	cout << sum << endl;
	cout << vec_prime[0] << endl;

}
