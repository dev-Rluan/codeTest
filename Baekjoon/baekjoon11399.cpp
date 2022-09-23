#include <iostream>
#include <queue>
#include <functional>

using namespace std;
int main()
{	
    int cnt = 0;
    int sum = 0;
    int n;

    priority_queue<int> pq;
    cin >> n;

    for (int i = 0; i < n; i++) {
        int pi 
        cin >> pi;
        cnt += pi;
        pq.push(pi);
    }

    while (!pq.empty) {
        sum = sum + cnt;
        cnt -= pq.pop();
    }
    cout << sum < endl;
}
