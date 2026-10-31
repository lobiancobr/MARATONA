# -*- coding: utf-8 -*-

N = int(input())

TR, TS, TC = 0, 0, 0

for i in range(0,N):
        linha = input().split()
        Q = int(linha[0])
        tipo = linha[1]
        if(tipo=='R'):
                TR+=Q
        if(tipo=='S'):
                TS+=Q
        if(tipo=='C'):
                TC+=Q

T = TR + TS + TC;
    
print("Total: %d cobaias" % T)
print("Total de coelhos: %d" % TC)
print("Total de ratos: %d" % TR)
print("Total de sapos: %d" % TS)
print("Percentual de coelhos: %.2f %%" % float((TC*100)/T))
print("Percentual de ratos: %.2f %%" % float((TR*100)/T))
print("Percentual de sapos: %.2f %%" % float((TS*100)/T))
