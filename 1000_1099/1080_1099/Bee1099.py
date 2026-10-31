# -*- coding: utf-8 -*-

N = int(input())

for _ in range(N):
    X, Y = map(int, input().split())

    menor = min(X, Y)
    maior = max(X, Y)

    S = sum(j for j in range(menor + 1, maior) if j % 2 != 0)
    print(S)