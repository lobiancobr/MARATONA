# -*- coding: utf-8 -*-

valores = [float(input()) for _ in range(6)]
positivos = sum(1 for v in valores if v > 0)
print(f"{positivos} valores positivos")