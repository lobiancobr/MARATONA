# -*- coding: utf-8 -*-
nome = input()
salario = float(input())
vendas = float(input())

total = salario + (vendas * 0.15)

print(f"TOTAL = R$ {total:.2f}")