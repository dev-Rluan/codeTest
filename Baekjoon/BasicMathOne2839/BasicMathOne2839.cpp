#include <iostream>
using namespace std;
int main()
{
	// 입력변수 n, 전체 횟수 카운트 변수, 한 회당 5씩 빼줄 변수
	int n, cnt = 0, temp_cnt = 0, temp;
	cin >> n;
	
	while (true)
	{
		// 처음 비교했을때 5로 딱 나누어지면 count세서 바로 넣어준다.
		if (n % 5 == 0)
		{
			cnt = n / 5;
			break;
		}
		else
		{
			cnt = n / 5 - temp_cnt;	
			temp = (n % 5) + (temp_cnt * 5);

			if (temp % 3 != 0)
			{
				if (cnt == 0)
				{
					cnt = -1;
					break;
				}
				temp_cnt++;
			}
			else
			{
				cnt += temp / 3;
				break;
			}
		}

	}
	
	cout << cnt << endl;
}
