# -*- coding: utf-8 -*-

for k in range(11):
    i = round(k * 0.2, 1)    # arredonda para 1 casa
    for m in range(1, 4):
        j = round(i + m, 1)

        # Verifica se é inteiro comparando com o arredondado a 0 casas
        i_int = (i == round(i))
        j_int = (j == round(j))

        if i_int and j_int:
            print(f"I={i:.0f} J={j:.0f}")
        elif i_int:
            print(f"I={i:.0f} J={j:.1f}")
        elif j_int:
            print(f"I={i:.1f} J={j:.0f}")
        else:
            print(f"I={i:.1f} J={j:.1f}")