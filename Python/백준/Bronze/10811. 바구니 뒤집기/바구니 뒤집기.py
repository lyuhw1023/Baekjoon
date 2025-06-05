N, M = map(int, input().split())
box = [i for i in range(1,N+1)]
tmp = 0
for x in range(M):
    i, j = map(int, input().split())
    tmp = box[i-1:j]
    tmp.reverse()
    box[i-1:j] = tmp
for x in range(N):
    print(box[x], end=" ")