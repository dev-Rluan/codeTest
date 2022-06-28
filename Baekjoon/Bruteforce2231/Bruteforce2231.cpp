#include <iostream>
#include <string>
using namespace std;
//1¾È
//int main()
//{
//	string n, n2;
//	cin >> n;
//	int num;
//	int cnt = n.size();
//	int max_cnt = cnt*9;
//	if (cnt == 1)
//	{
//		cout << "0" << endl;
//		return 0;
//	}
//	for (int i = max_cnt; i > 0 ; i--)
//	{
//		num = stoi(n) - i;
//		n2 = to_string(num);
//		for (int j = 0; j < n.size(); j++)
//		{
//			num += (int)n2[j] - '0';
//		}
//		if (num == stoi(n))
//		{
//			cout << stoi(n) - i << endl;
//			return 0;
//		}
//
//	}
//	cout << "0" << endl;
//}
// Æ²·Ç½À´Ï´Ù ¶ä

int main()
{
	int n, k, sum;
	cin >> n;
	
	for (int i = 0; i < n; i++)
	{
		sum = i;
		k = i;
		while (k)
		{
			sum += k % 10;
			k /= 10;
		}
		if (n == sum)
		{
			cout << i << '\n';
			return 0;
		}
	}
	cout << "0" << endl;
}