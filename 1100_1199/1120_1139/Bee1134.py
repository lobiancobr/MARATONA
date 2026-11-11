# -*- coding: utf-8 -*-

contadores = {1: 0, 2: 0, 3: 0}

while True:
    N = int(input())
    if N == 4:
        break
    if N in contadores:
        contadores[N] += 1

print("MUITO OBRIGADO")
print(f"Alcool: {contadores[1]}")
print(f"Gasolina: {contadores[2]}")
print(f"Diesel: {contadores[3]}")