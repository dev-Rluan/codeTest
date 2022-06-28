#include <iostream>
using namespace std;
void ranksort(int* rank, int n, int cnt)
{
	for (int i = 0; i < cnt; i++)
	{
		if (rank[i] == n)
			rank[i]++;
	}
}
int main()
{
	int n, rank_cnt = 1;
	int arr[2][51] = {};
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> arr[0][i] >> arr[1][i];
	}
	// 비교
	for (int i = 0; i < n; i++)
	{
		rank_cnt = 1;
		for (int j = 0; j < n; j++)
		{
			if ((arr[0][i] < arr[0][j]) && (arr[1][i] < arr[1][j]))
			{
				rank_cnt++;
			}
			
		}		
		cout << rank_cnt << " ";
	}
	cout << endl;

}