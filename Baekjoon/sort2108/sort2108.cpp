#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;

void init_min(int a, int* n)
{
	if(*n> a)
	{
		*n = a;
	}
}
void init_max(int a, int* n)
{
	if (*n < a)
	{
		*n = a;
	}
}
int main()
{
	// 1. 산술평균 : N개의 수들의 합을 N으로 나눈 값
	// 2. 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
	// 3. 최빈값: N개의 수들 중 가장 많이 나타나는 값
	// 4. 범위 : N개의 수들 중 최댓값과 최솟값의 차이

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n, min = 0, max = 0, sum = 0, more=0, lot=0;
	cin >> n;
	// 숫자 범위 1~4000은 양수 4001~8000은 음수
	int cnt[8001] = {0};
	int* num = new int[n];
	bool isFirst = false;
	
	for (int i = 0; i < n; i++)
	{
		
		cin >> num[i];
		if (i == 0)
		{
			min = num[i];
			max = num[i];


		}
		sum += num[i];
		init_min(num[i], &min);
		init_max(num[i], &max);
		int temp = num[i] < 0 ? (num[i] * -1) + 4000 : num[i];
		cnt[temp]++;
		if (cnt[temp] > lot)
		{
			lot = cnt[temp];
		}
	}
	sort(num, num + n);
	
	for (int i = -4000; i < 4001; i++)
	{
				
		int temp = i > 0 ? i : abs(i) + 4000;
		
		if (cnt[temp] == lot)
		{
			more = i;
			if (isFirst)
			{
				break;
			}
			isFirst = true;			
		}
		
	}
	cout << round((double)sum / n) << '\n';
	cout << num[n / 2] << '\n';
	cout << more << '\n';
	cout << max - min << '\n';
}
