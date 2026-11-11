# -*- coding: utf-8 -*-

vitorias_inter = vitorias_gremio = empates = 0

while True:
    gols_inter, gols_gremio = map(int, input().split())

    if gols_inter > gols_gremio:
        vitorias_inter += 1
    elif gols_gremio > gols_inter:
        vitorias_gremio += 1
    else:
        empates += 1

    print("Novo grenal (1-sim 2-nao)")
    if int(input()) == 2:
        break

total = vitorias_inter + vitorias_gremio + empates

print(f"{total} grenais")
print(f"Inter:{vitorias_inter}")
print(f"Gremio:{vitorias_gremio}")
print(f"Empates:{empates}")

if vitorias_inter > vitorias_gremio:
    print("Inter venceu mais")
elif vitorias_gremio > vitorias_inter:
    print("Gremio venceu mais")
else:
    print("Nao houve vencedor")