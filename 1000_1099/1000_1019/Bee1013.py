# -*- coding: utf-8 -*-
entrada = input().split()
A = int(entrada[0])
B = int(entrada[1])
C = int(entrada[2])
 
Mab = (A + B + abs(A-B))//2
Mabc= (C + Mab + abs(C-Mab))//2
    
print(f"{Mabc} eh o maior")
