# -*- coding: utf-8 -*-

N = int(input())

for i in filter(lambda x: x % N == 2, range(2, 10000)):
    print(i)