#include <stdio.h>

int main() {
    while (1) {
        double soma = 0.0;
        int validas = 0;

        // Lê as duas notas válidas
        while (validas < 2) {
            double nota;
            scanf("%lf", &nota);
            if (nota >= 0 && nota <= 10) {
                soma += nota;
                validas++;
            } else {
                printf("nota invalida\n");
            }
        }

        printf("media = %.2f\n", soma / 2.0);

        // Loop para validar a escolha
        int escolha;
        do {
            printf("novo calculo (1-sim 2-nao)\n");
            scanf("%d", &escolha);
        } while (escolha != 1 && escolha != 2);

        if (escolha == 2) {
            break;
        }
    }

    return 0;
}