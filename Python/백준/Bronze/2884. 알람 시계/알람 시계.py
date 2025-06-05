H, M = map(int,input().split())
if H == 0 :
    if M < 45 :
        H = 23
        M += 15
    else :
        M -= 45
else :
    if M < 45 :
        H -= 1
        M += 15
    else :
        M -= 45
print(H, M)