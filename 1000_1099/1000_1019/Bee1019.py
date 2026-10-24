# -*- coding: utf-8 -*-

# Leitura do número de segundos
N = int(input())

# Calcula o número de horas
horas = N // 3600

# Calcula o número de minutos
minutos = (N % 3600) // 60

# Calcula o número de segundos restantes
segundos = N % 60

# Imprime o resultado no formato H:M:S
print(f"{horas}:{minutos}:{segundos}")
