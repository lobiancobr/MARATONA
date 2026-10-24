# -*- coding: utf-8 -*-

Pares=0;
        
for i in range(1,6):
    N = int(input())
    if(N%2==0):
        Pares+=1
        
print("%d valores pares" % Pares)