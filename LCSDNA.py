str_in = str(input())
A = [0]
C = [0]
T = [0]
G = [0]
i = 0
for c in str_in:
    Ad = 0
    Cy = 0
    Th = 0
    Gu = 0
    i += 1
    if c is 'A':
        Ad = 1
    if c is 'C':
        Cy = 1
    if c is 'T':
        Th = 1
    if c is 'G':
        Gu = 1
    A.append(A[i-1] + Ad)
    C.append(max(A[i],C[i-1] + Cy))
    T.append(max(C[i],T[i-1] + Th))
    G.append(max(T[i],G[i-1] + Gu))

print( max(A[i],C[i],T[i],G[i]))
