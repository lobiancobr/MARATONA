# -*- coding: utf-8 -*-

X = int(input())
Y = int(input())

menor = min(X, Y)
maior = max(X, Y)

total = sum(i for i in range(menor, maior + 1) if i % 13 != 0)

print(total)