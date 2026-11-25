# -*- coding: utf-8 -*-

N = int(input())

for _ in range(N):
    inicio, quantidade = map(int, input().split())

    # Se o início for par, começa no próximo ímpar
    if inicio % 2 == 0:
        inicio += 1

    soma = 0
    for _ in range(quantidade):
        soma += inicio
        inicio += 2

    print(soma)
