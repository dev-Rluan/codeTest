import heapq


n= int(input());
cnt = 0;
pi = list(map(int, input().split()))
heapq.heapify(pi)

for i in range(0, n): 
    cnt = cnt + heapq.heappop(pi);

print(cnt)

