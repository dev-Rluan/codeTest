#include <iostream>
using namespace std;

int main() 
{
	int N;
	cin >> N;
	int i = 1;
	while (N > i)
	{
		N -= i;
		i++;
	}
	if (i % 2 == 0) 
	{
		cout << N << '/' << i + 1 - N << endl;
	}
	else
	{
		cout << i + 1 - N << '/' << N << endl;
	}
}
