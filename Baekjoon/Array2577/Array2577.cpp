#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios::sync_with_stdio;
	cin.tie(NULL);
	cout.tie(NULL);

	int count[10] = {};
	int num, A, B, C;
	cin >> A >> B >> C;
	num = A * B * C;
	string s = to_string(num);
	for (char ch : s) 
	{
		count[ch - '0']++;
	}
	for (int i : count) {
		cout << i << "\n";
	}

}

