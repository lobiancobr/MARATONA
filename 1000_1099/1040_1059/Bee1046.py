# -*- coding: utf-8 -*-

horaInicio, horaFim = map(int, input().split())

duracao = (horaFim - horaInicio + 24) % 24
if duracao == 0:
    duracao = 24

print(f"O JOGO DUROU {duracao} HORA(S)")