# -*- coding: utf-8 -*-

x = int(input())
y = int(input())

resultado=0;
        
if (x>y): 
    maior,menor = x,y
else:
    maior,menor = y,x

for contador in range(maior-1,menor,-1):
    if (contador%2 != 0):
        resultado = contador + resultado    
        
# se numeros forem iguais, o resultado é zero
print("%d" % resultado )