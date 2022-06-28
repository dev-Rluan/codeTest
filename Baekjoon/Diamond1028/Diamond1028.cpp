#include <iostream>
using namespace std;
int GetMin(int n1, int n2)
{
	if (n1 < n2)
		return n2;
	return n1;
}
int main()
{
	// 다이아몬드 광산
	// 0과 1로 이루어진 R행 * C열 크기의 배열 
	// 배열크기 750, 750
	// 1로 이루어진 정사각형의 경계선을 45도 회전 시킨 모형	
	bool pos[750][750];
	string posNum;
	int r, c, max_size = 0, min, size = 0, cnt;
	// 입력 받기
	cin >> r >> c;

	//	광산 내부 데이터 입력
	for (int i = 0; i < r; i++)
	{
		cin >> posNum;
		for (int j = 0; j < c ; j++)
		{
			if (posNum[j] == '1')
				pos[i][j] = true;
			else
				pos[i][j] = false;
		}
	}
	cout << "----------------" << endl;
	// 입력받은 두 수의 최소 값이상 다이아몬드가 커질일이 없으니 최솟 값 구하기
	min = GetMin(r, c);
	// 다이아의 최대크기 = 짝수일때 - x/2 : 홀수일때 - x/2 +1 
	if (min % 2 != 0) 
	{
		max_size++;
	}
	max_size += min / 2;
	

	/*
	* (i, j) : 최대 (c, r)
	*  | (0, 0) (0, 1) (0, 2)
	*  | (1, 0) (1, 1) (1, 2)
	*  v (2, 0) (2, 1) (2, 2)
	*/

	// 다이아몬드 탐색 0, 0  부터 시작 열
	// 최대 크기는 max_size

	size = 0;
	for (int i = 0; i < r; i++)
	{
		// 현재 찾은 크기보다 남은 다이아들의 최소크기가 작으면 멈추기
		if (size > r - i)
			break;
		// 다이아몬드 탐색 (j, -i)
		for (int j = 0; j < c; j++)
		{
			// 현재 찾은 크기보다 남은 다이아들의 최소크기가 작으면 멈추기
			/*if (size > c - j)
				break;*/
			// 현재칸이 비워져있으면
			cout << "pos : " << pos[i][j] << endl;
			if (!pos[i][j])
			{
				continue;
			}
			// 여기까지왔다는건 일단 하나는 있다는 뜻이니까
			if (size == 0)
				size = 1;
			// 카운트 초기화
			cnt = 0;	
			// 1칸당 필요 검색 횟수(최대) : 2 * max_size -1 
			for (int k = 0; k < 2*max_size -1; k++)
			{
				
				// 검색할 곳이 배열을 벗어나면 멈추기
				if ((j - cnt) < 0 || (j + cnt) > c || (i + k) > r)
				{
					cout << "j-cnt, j + cnt : " << j - cnt << ", " << j + cnt << " i + k" <<i+k << endl;
					break;
				}
				// 검색하는 값이 비어있으면 멈추기
				if (!pos[i - cnt][j + k] || !pos[i + cnt][j + k])
					break;
				if (max_size <= cnt)
					cnt--;
				else
					cnt++;
				int reverse_cnt = k;
				// 검색하는 값이 비어있지않으면 0이될때까지 검색
				for (int f = k; f >= 0; f--) 
				{

					cout << "k : " << k << endl;					
					if ((j - f) < 0 || (j + f) > c || (i + reverse_cnt) > r)
					{
						cout << "2 break " << endl;
						break;
					}

					if (!pos[i - f][j + reverse_cnt] || !pos[i + f][j + reverse_cnt])
					{
						cout << "2  " << endl;
						break;
					}
					if (f == 0)
					{
						if(size < k)
							size = k;
							cout << size << " - size " << endl;
					}
					reverse_cnt++;
				}
				
				
			}
			
		}
	}
	
	cout << size << endl;
}
