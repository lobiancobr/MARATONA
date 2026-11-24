# -*- coding: utf-8 -*-

S = 1.0

for i, den in zip(range(3, 40, 2), (2**k for k in range(1, 20))):
    S += i / den

print(f"{S:.2f}")