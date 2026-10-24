# -*- coding: utf-8 -*-

# Lendo os valores de entrada
a, b, c = map(float, input().split())

# Verificando se os valores formam um triângulo
if a + b > c and a + c > b and b + c > a:
    # Calculando o perímetro do triângulo
    perimetro = a + b + c
    print("Perimetro = %.1f" % perimetro)
else:
    # Calculando a área do trapézio
    area = ((a + b) * c) / 2
    print("Area = %.1f" % area)
