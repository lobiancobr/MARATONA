# -*- coding: utf-8 -*-

N = int(input())
dentro=0

for i in range(N):
    numero = int(input())
    if (numero<=20 and numero>=10):
        dentro+=1
        
print("%d in\n%d out" % (dentro,N-dentro))