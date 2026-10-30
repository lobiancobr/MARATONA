# -*- coding: utf-8 -*-

N = int(input())

for i in range(N):
    a,b,c = map(float, input().split())
    print("%.1f" % ((a*2 + b*3 + c*5)/10))

