# -*- coding: utf-8 -*-

a, b, c = map(int, input().split())

ordenado = sorted([a, b, c])

for n in ordenado:
    print(n)

print()

for n in [a, b, c]:
    print(n)