#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios::sync_with_stdio;
	cin.tie(NULL);
	cout.tie(NULL);

	int count[42] = {};
	int sum=0;
	int num;
	for (int i = 0; i < 10; i++) 
	{
		cin >> num;
		if (!count[num % 42]++) {
			sum++;
		}
	}
	cout << sum;

}

