# -*- coding: utf-8 -*-

valores = [int(input()) for _ in range(100)]

maior = max(valores)
posicao = valores.index(maior) + 1   # +1 porque o índice é 0-based

print(maior)
print(posicao)