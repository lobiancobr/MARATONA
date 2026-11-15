#include <stdio.h>

int main() {
    int X, Z;

    scanf("%d", &X);

    do {
        scanf("%d", &Z);
    } while (Z <= X);

    int soma = 0;
    int contador = 0;

    while (soma <= Z) {
        soma += X + contador;
        contador++;
    }

    printf("%d\n", contador);

    return 0;
}