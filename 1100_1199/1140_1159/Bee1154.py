# -*- coding: utf-8 -*-

import sys

valores = sys.stdin.read().split()

soma = 0.0
count = 0

for v in valores:
    N = int(v)
    if N < 0:
        break
    soma += N
    count += 1

if count > 0:
    print(f"{soma / count:.2f}")