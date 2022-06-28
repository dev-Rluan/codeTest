#include <iostream>
using namespace std;
int main()
{
	int N[2], num;
	int cnt = 1, num1, num2, temp;
	cin >> num;
	N[1] = (num % 10) / 1;
	N[0] = (num % 100) / 10;
	
	num1 = N[1];
	num2 = (N[0] + N[1])%10;
	while (true) 
	{
		if (num1 == N[0] && num2 == N[1]) 
		{
			cout << cnt;
			break;
		}
		temp = num2;
		num2 = (num1 + num2) % 10;
		num1 = temp;
		cnt++;
	}
}
