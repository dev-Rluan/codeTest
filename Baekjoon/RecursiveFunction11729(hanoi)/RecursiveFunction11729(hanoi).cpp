#include <iostream>
#include <cmath>
using namespace std;

// 하노이 함수 n = 원반의 크기 , start  = 시작 기둥, mid =  보조 기둥 ,c = 옮길 기둥 
void hanoi(int n, int start, int mid, int to)
{
	if (n == 1)
	{
		cout << start << " " << to << '\n';
		return;
	}	
	// n-1개 만큼 b에다가 옮긴다.
	hanoi(n - 1, start, to, mid);

	// 하나를 a -> c 로 이동
	cout << start << " " << to << '\n';

	//
	hanoi(n - 1, mid, start, to);

}
int main()
{
	int n;
	cin >> n;

	// fow함수를 사용하면 fow함수는 double형을 사용하기때문에 2의 20승 부터 오차범위가 커져
	// 에러가 나기때문에 int형으로 캐스팅 시켜줘야한다.
	cout << pow(2, n) - 1 << endl;

	// hanoi 알고리즘
	// a, b, c 기둥이 있을때
	// a 기둥에는 n개의 원반이 쌓여있고,  각 원반은 반경이 큰 순서대로 쌓여있다. 
	// a 기둥에서 c 기둥으로 원반을 옮겨야한다.
	// 원반이 하나일때 a -> c  한번
	// 원반이 두개일때 a - > b, a -> c,  b-> c 세번
	// 원반이 n개 일때
	// - a 기둥에 남아있는 원반중  n-1개를 b 기둥에 옮긴다. (c 기둥을 보조기둥으로 사용)
	// - a 기둥에 남아있는 원반을 c 기둥으로 옮긴다.
	// - b 기둥에 남아있는 n-1개 원반을 c 기둥으로 옮긴다.( b 기둥을 보조기둥으로 사용)

	hanoi(n, 1, 2, 3 );

}