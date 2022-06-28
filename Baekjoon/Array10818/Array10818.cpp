#include <iostream>
using namespace std;

int main()
{
	ios::sync_with_stdio;
	cin.tie(NULL);
	cout.tie(NULL);

	int N;
	cin >> N;
	int *arr = new int[N];
	int max = 0;	
	int min = 0;	
	for (int i = 0; i < N; i++) 
	{
		cin >> arr[i];
		if (i == 0)
		{
			max = arr[0];
			min = arr[0];
		}
	}	
	
	for (int i = 1; i < N; i++) {
		if (arr[i] > min) 
		{
			if (arr[i] >= max)
			{
				max = arr[i];
			}
		}
		else
		{
			min = arr[i];
		}
	}
	cout << min << " " << max;

}

