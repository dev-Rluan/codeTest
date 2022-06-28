#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios::sync_with_stdio;
	cin.tie(NULL);
	cout.tie(NULL);

	int N, max = 0;
	double result = 0;
	cin >> N;
	int* arr = new int[N];
	for (int i = 0; i < N; i++)
	{
		cin >> arr[i];
		if (arr[i] > max) 
		{
			max = arr[i];
		}
		result += arr[i];
	}
	result = (result / max*100) / N;
	cout << result;
	

}

