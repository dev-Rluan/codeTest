#include <iostream>
#include <stdlib.h>
#include <vector>
using namespace std;
int search(vector<int> vec, int n, int m)
{
	int cnt = 0, sum = 0;
	for (int i = 0; i < vec.size()-2; i++)
	{
		for (int j = 1; j < vec.size()-1; j++)
		{
			for (int k = 2; k < vec.size(); k++)
			{
				if (i ==  j || j == k || i == k)
				{
					continue;
				}

				if (sum < vec[i] + vec[j] + vec[k])
				{
					if (vec[i] + vec[j] + vec[k] > m)
					{
						continue;
					}
					sum = vec[i] + vec[j] + vec[k];
					if (sum == m)
						return sum;
				}
			}
		}
	}
	return sum;
}
int main()
{
	// 첫째 줄에 카드 갯수 N, 숫자 M 받기
	// 제한된 시간안에 3장의 카드 고르기
	// n장의 카드중에 합이 m을 넘지 않으면서 m과 최대한 가까운 3장의 카드의 합 구하기

	// n, m 초기화
	int n, m, card;
	vector<int> vec;
	cin >> n>> m;
	for (int i = 0; i < n; i++)
	{
		cin >> card;
		vec.push_back(card);		
	}

	cout << search(vec, n, m) << endl;
}