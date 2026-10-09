# -*- coding: utf-8 -*-

N1, N2, N3, N4 = map(float, input().split())

media = (2 * N1 + 3 * N2 + 4 * N3 + N4) / 10.0

print(f"Media: {media:.1f}")

if media >= 7.0:
    print("Aluno aprovado.")
elif media < 5.0:
    print("Aluno reprovado.")
else:
    print("Aluno em exame.")
    NExame = float(input())
    print(f"Nota do exame: {NExame:.1f}")
    final = (media + NExame) / 2.0
    if final >= 5.0:
        print("Aluno aprovado.")
    else:
        print("Aluno reprovado.")
    print(f"Media final: {final:.1f}")