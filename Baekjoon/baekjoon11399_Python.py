import heapq


n= int(input());
cnt = 0;
pi = list(map(int, input().split()))
heapq.heapify(pi)
c =0;
for i in range(0, n): 
    print(pi[0])
    cnt = cnt + heapq.heappop(pi);

print(cnt)

