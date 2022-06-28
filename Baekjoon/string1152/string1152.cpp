#include <iostream>
#include <string>
using namespace std;
int main()
{
	int cnt = 0;
	bool flag = true;
	string s;
	getline(cin, s);
	for (int i = 0; i < s.length(); i++) {
		if (s[i]  == ' ') 
		{				
			flag = true;
		}
		else if (flag) {
			flag = false;
			cnt++;
		}

	}
	cout << cnt << endl;
}
