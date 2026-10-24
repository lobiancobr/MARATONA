# -*- coding: utf-8 -*-

X = int(input())

if X%2==0:
    X += 1

for i in range(X, X+11, 2):
    print(i)