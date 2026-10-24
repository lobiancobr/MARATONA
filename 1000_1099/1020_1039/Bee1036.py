# -*- coding: utf-8 -*-

A, B, C = map(float, input().split())

delta = B * B - 4 * A * C

if A == 0 or delta < 0:
    print("Impossivel calcular")
else:
    D = delta ** 0.5
    R1 = (-B + D) / (2 * A)
    R2 = (-B - D) / (2 * A)
    print(f"R1 = {R1:.5f}")
    print(f"R2 = {R2:.5f}")
