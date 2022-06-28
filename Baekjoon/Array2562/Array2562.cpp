#include <iostream>
using namespace std;

int main()
{
	ios::sync_with_stdio;
	cin.tie(NULL);
	cout.tie(NULL);
	
	int arr[9];
	int max = 0, cnt = 1, nowCnt = 1;
	for (int i = 0; i < 9; i++)
	{
		cin >> arr[i];
		if (i == 0)
		{
			max = arr[0];
		}
	}
	for (int i = 1; i < 9; i++)
	{
		nowCnt++;
		if (arr[i] > max) 
		{
			max = arr[i];
			cnt = nowCnt;
		}		
		
	}


	cout <<  max << "\n" << cnt;

}

