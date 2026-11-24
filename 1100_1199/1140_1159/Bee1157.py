# -*- coding: utf-8 -*-

N = int(input())

for i in filter(lambda x: N % x == 0, range(1, N + 1)):
    print(i)