#include <iostream>
<<<<<<< HEAD
#include <algorithm>
using namespace std;

int main()
{
	int n;
	
	cin >> n;
	int* cnt = new int[n];
	for (int i = 0; i < n; i++)
	{
		cin >> cnt[i];
	}

	sort(cnt, cnt + n);

	for (int i = 0; i < n; i++)
	{
		cout << cnt[i]<< '\n';
	}
}
=======

void merge(int* arr, int start, int mid, int end)
{
    int i = start;
    int j = mid;
    int k = start;

}
void merge_sort(int *arr, int start, int end)
{
    if (start < end)
    {
        int mid = (start - end) / 2 + 1;
        merge_sort(arr, start, mid);
        merge_sort(arr, mid, end);
        merge(arr, start, mid, end);
    }
}
int main()
{
    
}

>>>>>>> 9e20d14904ff642581e431c3de5746e7ac3ea004
