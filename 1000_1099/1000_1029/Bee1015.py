# -*- coding: utf-8 -*-

linha = input()
valores = linha.split()

X1 = float(valores[0])
Y1 = float(valores[1])

linha = input()
valores = linha.split()

X2 = float(valores[0])
Y2 = float(valores[1])

distancia = ((X2-X1)**2 + (Y2-Y1)**2)**.5

print("%0.4f" % distancia)
