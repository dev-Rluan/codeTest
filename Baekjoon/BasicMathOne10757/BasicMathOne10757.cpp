#include <iostream>
#include <vector>
using namespace std;
int main()
{
	int num1[10001] = {0}, num2[10001] = { 0 };
	string A, B, temp;
	int t,  num;
	bool isTemp = false;
	vector<int> vec;
	cin >> A >> B;
	
	if (A.size() < B.size())
	{	
		temp = A;
		A = B;
		B = temp;		
	}
	t = A.size();
	for (int i = 0; i < A.size(); i++)
		num1[i] = A[i] - '0';

	for (int i = 0; i < B.size(); i++)
		num2[i + (A.size() - B.size())] = B[i] - '0';


	for (int i = t -1; i >= 0; i--)
	{
		num = num1[i] + num2[i];
		cout << num;
		if (isTemp)
		{
			num++;
			cout << " :  1추가 : " << num;
		}

		if (num >= 10)
		{
			isTemp = true;
			num -= 10;
			cout << " : 10 넘어가서 10 줄이기 : ";
		}
		else
		{
			isTemp = false;
			cout << " : 10 안넘어감 : "  ;
		}
		cout << num << endl;
		vec.push_back(num);

	}
	if (isTemp)
		cout << "1";
	for (int i = vec.size() -1; i >= 0; i--)
	{
		cout << vec[i];
	}
	
}

