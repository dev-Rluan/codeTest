#include <iostream>
using namespace std;
char wb[8][8] = {  'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B',
						'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',
						'W','B', 'W', 'B', 'W', 'B', 'W', 'B',
						'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',
						'W','B', 'W', 'B', 'W', 'B', 'W', 'B',
						'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',
						'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B',
						'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' };

char bw[8][8] = {	'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',
						'W', 'B', 'W', 'B', 'W', 'B', 'W','B',
						'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',
						'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B',
						'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',
						'W', 'B', 'W', 'B', 'W','B', 'W', 'B',
						'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',
						'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' };
char board[51][51];
int bw_cnt(int x , int y  )
{
	int cnt = 0;
	for (int i = 0; i < 8; i++)
	{
		for (int j = 0; j < 8; j++)
		{
			if (bw[i][j] != board[x+i][y + j])
				cnt++;
		}
	}
	return cnt;
}
int wb_cnt(int x , int y)
{
	int cnt = 0;
	for (int i = 0; i < 8; i++)
	{
		for (int j = 0; j < 8; j++)
		{
			if (wb[i][j] != board[x + i][y + j])
			{
				cnt++;
			}
				
		}
	}
	return cnt;
}

int main()
{
	int min = 32;
	pair<int, int> p1;

	cin >> p1.first >> p1.second;
	
	for (int i = 0; i < p1.first; i++)
		for (int j = 0; j < p1.second; j++)
		{
			cin >> board[i][j];
		}

	for(int i =0; i <= p1.first - 8; i++)
		for (int j = 0; j <= p1.second - 8; j++)
		{
			if (wb_cnt(i, j) < bw_cnt(i, j))
			{
				if (min > wb_cnt(i, j))
					min = wb_cnt(i, j);
			}
			else
			{
				if(min > bw_cnt(i, j))
					min = bw_cnt(i, j);
			}
		}
	

	cout << min << endl;

}