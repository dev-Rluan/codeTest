#include <iostream>
// 제곱근, 제곱 사용을 위한 
#include<cmath>
using namespace std;
int main() 
{
	int t, x, y, sqt;
	cin >> t;
	for (int i = 0; i < t; i++)
	{
		int numCheck = 0, cnt = 0;
		cin >> x >> y;
		x = y - x;
		sqt = sqrt(x);
		cnt = (sqt * 2) - 1;
		x = x - pow(sqt, 2);
		if (x % sqt != 0)
		{
			cnt++;
		}
		cnt += x / sqt;
		
		cout << cnt << endl;
	}
}
// 현재 수부터 1까지 더한 값
//int GetAP(int a)
//{
//	if (a == 1)
//	{
//		return 1;
//	}
//	return GetAP(a - 1) + a;
//}
//int main()
//{
//	int t, x, y;
//	cin >> t;
//	for (int i = 0; i < t; i++)
//	{
//		int numCheck = 0, cnt = 0;
//		cin >> x >> y;
//		x = y - x;
//		if (x == 1)
//		{
//			cout << "1" << endl;
//			break;
//		}
//		while (x > 0)
//		{
//			cnt++;
//			if (x >= GetAP(numCheck + 1))
//			{				
//				x = x - (++numCheck);
//				
//			}
//			else if (x >= GetAP(numCheck))
//			{
//				x = x - numCheck;
//			}
//			else
//			{
//				x = x - (--numCheck);
//			}			
//		}
//		cout << cnt << endl;
//	}
//}

