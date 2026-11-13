# -*- coding: utf-8 -*-

X, Y = map(int, input().split())

linha = []
for i in range(1, Y + 1):
    linha.append(str(i))
    if i % X == 0 or i == Y:
        print(" ".join(linha))
        linha = []