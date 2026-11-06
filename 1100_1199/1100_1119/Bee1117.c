#include <stdio.h>

int main() {
    int validas = 0;
    double soma = 0.0, nota;

    while (validas < 2) {
        scanf("%lf", &nota);

        if (nota < 0 || nota > 10) {
            printf("nota invalida\n");
        } else {
            soma += nota;
            validas++;
        }
    }

    printf("media = %.2f\n", soma / 2.0);

    return 0;
}