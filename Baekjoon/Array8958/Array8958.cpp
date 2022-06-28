#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios::sync_with_stdio;
	cin.tie(NULL);
	cout.tie(NULL);

	int count = 0;
	int temp = 0;
	int N;
	cin >> N;
	string s;
	
	for (int i = 0; i < N; i++)
	{
		cin >> s;
		for (char ch : s) {
			if (ch == 'O')
			{
				temp++;
				count += temp;
			}
			else {
				temp = 0;
			}
		}
		cout << count << "\n";
		temp = 0;
		count = 0;
	}
	

}

