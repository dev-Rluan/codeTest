#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios::sync_with_stdio;
	cin.tie(NULL);
	cout.tie(NULL);

	int C, avg, num, cnt;
	double result;
	int score[1000] = {0};
	cin >> C;
	
	for (int i = 0; i < C; i++)
	{
		num = 0;
		avg = 0;
		cin >> cnt;
		for (int j = 0; j < cnt; j++) 
		{
			cin >> score[j];
			avg += score[j];
		}
		avg = avg / cnt;
		for (int j = 0; j < cnt; j++)
		{
			if (score[j] > avg) 
			{
				num++;
			}
		}

		result = (double)num / cnt * 100;
		cout << fixed; 
		cout.precision(3); 
		cout << result << "%" << endl;
	}


}