# -*- coding: utf-8 -*-
L = input()
L = L.split()
C1 = int(L[0])
N1 = int(L[1])
V1 = float(L[2])

L = input()
L = L.split()
C2 = int(L[0])
N2 = int(L[1])
V2 = float(L[2])

Total = N1*V1 + N2*V2

print(f"VALOR A PAGAR: R$ {Total:.2f}")