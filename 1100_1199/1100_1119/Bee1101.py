# -*- coding: utf-8 -*-

while True:
    M, N = map(int, input().split())

    if M <= 0 or N <= 0:
        break

    if M > N:
        M, N = N, M   # troca para garantir M <= N

    numeros = list(range(M, N + 1))
    print(" ".join(map(str, numeros)) + " Sum=" + str(sum(numeros)))