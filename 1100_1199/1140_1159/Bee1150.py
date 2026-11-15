# -*- coding: utf-8 -*-

X = int(input())

while True:
    Z = int(input())
    if Z > X:
        break

soma = 0
contador = 0

while soma <= Z:
    soma += X + contador
    contador += 1

print(contador)