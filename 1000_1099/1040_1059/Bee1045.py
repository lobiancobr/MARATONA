# -*- coding: utf-8 -*-

A, B, C = map(float, input().split())

# Ordena do maior para o menor
lados = sorted([A, B, C], reverse=True)
A, B, C = lados

# Verifica se forma triângulo
if A >= B + C:
    print("NAO FORMA TRIANGULO")
else:
    # Tipo de triângulo pelo ângulo
    if A * A == B * B + C * C:
        print("TRIANGULO RETANGULO")
    elif A * A > B * B + C * C:
        print("TRIANGULO OBTUSANGULO")
    else:
        print("TRIANGULO ACUTANGULO")

    # Tipo de triângulo pelos lados (pode acumular)
    if A == B == C:
        print("TRIANGULO EQUILATERO")
    elif A == B or B == C or A == C:
        print("TRIANGULO ISOSCELES")