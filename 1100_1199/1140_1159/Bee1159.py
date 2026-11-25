# -*- coding: utf-8 -*-

while True:
    N = int(input())

    if N == 0:
        break

    if N % 2 != 0:
        N += 1

    soma = sum(N + 2 * i for i in range(5))
    print(soma)