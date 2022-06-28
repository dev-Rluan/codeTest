#include <iostream>
#include <string>
using namespace std;
int main()
{
	int n, cnt = 1, series = 665; 
	string s; 
	cin >> n;
	while (cnt <= n)
	{
		s = to_string(++series);
		if (s.find("666") != -1)
		{
			cnt++;
		}
	}
	cout << series << endl;
}
