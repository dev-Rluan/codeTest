#include <iostream>
#include<string>
using namespace std;
int main()
{
	int n, cnt =0;
	string str;
	cin >> n;
	cin >> str;
	
	for (int i = 0; i < n; i++) 
	{
		
		cnt += (int)str[i]-'0';
	}

	cout << cnt;
}

