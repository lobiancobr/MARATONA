# -*- coding: utf-8 -*-

salario = float(input())

# (limite superior, percentual)
faixas = [
    (400.00, 15),
    (800.00, 12),
    (1200.00, 10),
    (2000.00, 7),
]

percentual = 4  # padrão (acima de 2000)
for limite, p in faixas:
    if salario <= limite:
        percentual = p
        break

reajuste = salario * percentual / 100

print(f"Novo salario: {salario + reajuste:.2f}")
print(f"Reajuste ganho: {reajuste:.2f}")
print(f"Em percentual: {percentual} %")