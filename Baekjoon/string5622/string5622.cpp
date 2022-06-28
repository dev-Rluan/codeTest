#include <iostream>

using namespace std;
int main()
{
	int time = 0;
	string str;
	cin >> str;
	for (int i = 0; i < str.size(); i++) 
	{
		// 문자가 들어온 값을 아스키코드의 문자 만큼빼고 3으로 나눈뒤 3을 더하면 한번 누를떄 걸리는 시간이다.
		// 들어오는 문자는 무조건 대문자라고 하였으니 -'A' or -65
		time += ((int)str[i] - 65) / 3 + 3;
		if (str[i] == 'S' || str[i] == 'V' || str[i] == 'Y' || str[i] == 'Z') 
		{
			time--;
		}
	}
	cout << time;
}

