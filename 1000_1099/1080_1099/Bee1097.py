# -*- coding: utf-8 -*-

i = 1
while i < 10:
    for j in range(i + 6, i + 3, -1):
        print(f"I={i} J={j}")
    i += 2