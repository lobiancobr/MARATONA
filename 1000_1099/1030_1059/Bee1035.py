# -*- coding: utf-8 -*-

valores = input().split()
A = int(valores[0])
B = int(valores[1])
C = int(valores[2])
D = int(valores[3])
aceito = False

somaAB=A+B
somaCD=C+D
    
if B > C and D > A and somaCD > somaAB and C > 0 and D > 0 and A % 2 == 0:
    aceito = True
        
if aceito:
  print("Valores aceitos")
else:
  print("Valores nao aceitos")
        
