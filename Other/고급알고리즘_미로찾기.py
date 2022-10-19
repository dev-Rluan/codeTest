def dfs(x, y):
    queue = deque()
    queue.append((x,y))
    while queue:
        x, y = queue.popleft()