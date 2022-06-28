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
	// ù° �ٿ� ī�� ���� N, ���� M �ޱ�
	// ���ѵ� �ð��ȿ� 3���� ī�� ����
	// n���� ī���߿� ���� m�� ���� �����鼭 m�� �ִ��� ����� 3���� ī���� �� ���ϱ�

	// n, m �ʱ�ȭ
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