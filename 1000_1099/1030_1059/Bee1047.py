# -*- coding: utf-8 -*-

h1, m1, h2, m2 = map(int, input().split())

t1 = h1 * 60 + m1
t2 = h2 * 60 + m2

duracao = (t2 - t1 + 24 * 60) % (24 * 60)

# Se durou 0 minutos, foi 24 horas
if duracao == 0:
    duracao = 24 * 60

print(f"O JOGO DUROU {duracao // 60} HORA(S) E {duracao % 60} MINUTO(S)")