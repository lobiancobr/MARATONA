# -*- coding: utf-8 -*-

total = int(input())

anos = total // 365
meses = total % 365
dias = meses % 30

meses = meses // 30

print(f"{anos} ano(s)")
print(f"{meses} mes(es)")
print(f"{dias} dia(s)")
