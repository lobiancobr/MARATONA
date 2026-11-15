# -*- coding: utf-8 -*-

import sys

# Lê todos os números da entrada de uma vez
valores = sys.stdin.read().split()

if not valores:
    exit()

A = int(valores[0])

# Procura o primeiro N que seja maior que 0
N = 0
for v in valores[1:]:
    N = int(v)
    if N > 0:
        break

# Calcula a soma usando a fórmula da PA (O(1))
soma = N * (2 * A + N - 1) // 2

print(soma)