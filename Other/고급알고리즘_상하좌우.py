dx = [0, -1, 0, 1]
dy = [1, 0, -1, 0]
move_types = ['L', 'R', 'U', 'D']

n = int(input())
x,y= 1,1
# 현재 위치

plans = intput().split()

for Plan in plans:
    for i in range(len(move_types)):
        if plan == move_types[i]:
            nx = x + dx[i]
            ny = x + dy[i]
    if nx < 1 or nx > n or ny < 1 or ny > n:
        continue;
    x, y = nx, ny

print (x, y)