# -*- coding: utf-8 -*-

T = int(input())

for _ in range(T):
    N = int(input())
    
    if N == 0:
        print("NULL")
    else:
        tipo = "EVEN" if N % 2 == 0 else "ODD"
        sinal = "POSITIVE" if N > 0 else "NEGATIVE"
        print(f"{tipo} {sinal}")