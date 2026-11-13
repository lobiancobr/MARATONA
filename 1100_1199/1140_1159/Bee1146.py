# -*- coding: utf-8 -*-

while True:
    N = int(input())

    if N == 0:
        break

    print(*range(1, N + 1))