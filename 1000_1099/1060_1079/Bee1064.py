# -*- coding: utf-8 -*-

positivos=0
total=0.0

for i in range(6):
    N = float(input())
    if N>0:
        positivos+=1
        total+=N
        
print("%d valores positivos" % positivos)
print("%0.1f" % (total/positivos))
