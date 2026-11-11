# -*- coding: utf-8 -*-

X = int(input())
Y = int(input())

menor, maior = min(X, Y), max(X, Y)

for i in filter(lambda x: x % 5 in (2, 3), range(menor + 1, maior)):
    print(i)