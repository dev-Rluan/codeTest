#include <string>
#include <sstream>
#include <fstream>
#include <iostream>
using namespace std;
int main()
{
	string str;
	cin >> str;
	int a[26] = { 0 }, alpabatCnt;
	int cnt=0;
	char alpabat;
	for (int i = 0; i < str.size(); i++)
	{
		alpabatCnt = toupper(str[i]) - 'A';
		a[alpabatCnt] = a[alpabatCnt] + 1 ;
	}
	alpabatCnt = 0;
	for (int i = -1; i < 25; i++)
	{
		if (cnt < a[i+1])
		{
			alpabat = i+1;
			cnt =a[i+1];
		}
		else if (cnt == a[i + 1]) 
		{
			alpabatCnt = a[i+1];
		}		
	}
	if (cnt == alpabatCnt)
		alpabat = '?';
	else
		alpabat +=  'A' ;


	cout << alpabat << endl;

}