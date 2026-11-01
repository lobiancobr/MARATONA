# -*- coding: utf-8 -*-

X, Y = map(int, input().split())

while X != Y:
    if X < Y:
        print("Crescente")
    else:
        print("Decrescente")
    
    X, Y = map(int, input().split())