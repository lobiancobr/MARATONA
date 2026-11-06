# -*- coding: utf-8 -*-

soma = 0.0
validas = 0

while validas < 2:
    nota = float(input())
    if 0 <= nota <= 10:
        soma += nota
        validas += 1
    else:
        print("nota invalida")

print(f"media = {soma / 2:.2f}")