# -*- coding: utf-8 -*-
entrada = input().split()
A = float(entrada[0])
B = float(entrada[1])
C = float(entrada[2])
    
PI = 3.14159
    
# Cálculos das áreas conforme as fórmulas do problema
triangulo = A * C / 2.0
circulo = PI * (C ** 2)
trapezio = (A + B) * C / 2.0
quadrado = B ** 2
retangulo = A * B
    
# Impressão dos resultados formatados com 3 casas decimais
print(f"TRIANGULO: {triangulo:.3f}")
print(f"CIRCULO: {circulo:.3f}")
print(f"TRAPEZIO: {trapezio:.3f}")
print(f"QUADRADO: {quadrado:.3f}")
print(f"RETANGULO: {retangulo:.3f}")
