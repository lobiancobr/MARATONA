#include <stdio.h>

int main() {
    int d1, h1, m1, s1;
    int d2, h2, m2, s2;

    // Leitura da data inicial
    scanf("Dia %d", &d1);
    scanf("%d : %d : %d", &h1, &m1, &s1);
    // Consome a quebra de linha pendente
    getchar();

    // Leitura da data final
    scanf("Dia %d", &d2);
    scanf("%d : %d : %d", &h2, &m2, &s2);

    // Cálculo por diferença (com empréstimo)
    int s = s2 - s1;
    int m = m2 - m1;
    int h = h2 - h1;
    int d = d2 - d1;

    if (s < 0) { s += 60; m--; }
    if (m < 0) { m += 60; h--; }
    if (h < 0) { h += 24; d--; }

    printf("%d dia(s)\n", d);
    printf("%d hora(s)\n", h);
    printf("%d minuto(s)\n", m);
    printf("%d segundo(s)\n", s);

    return 0;
}