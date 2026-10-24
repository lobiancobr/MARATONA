# -*- coding: utf-8 -*-

codigo, quantidade = map(int, input().split())

precos = [0, 4.00, 4.50, 5.00, 2.00, 1.50]
total = precos[codigo] * quantidade

print(f"Total: R$ {total:.2f}")