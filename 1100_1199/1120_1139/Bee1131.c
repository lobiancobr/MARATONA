#include <stdio.h>

int main() {
    int vitoriasInter = 0;
    int vitoriasGremio = 0;
    int empates = 0;
    int opcao = 1;

    while (opcao != 2) {
        int golsInter, golsGremio;
        scanf("%d %d", &golsInter, &golsGremio);

        if (golsInter > golsGremio) {
            vitoriasInter++;
        } else if (golsGremio > golsInter) {
            vitoriasGremio++;
        } else {
            empates++;
        }

        printf("Novo grenal (1-sim 2-nao)\n");
        scanf("%d", &opcao);
    }

    int total = vitoriasInter + vitoriasGremio + empates;

    printf("%d grenais\n", total);
    printf("Inter:%d\n", vitoriasInter);
    printf("Gremio:%d\n", vitoriasGremio);
    printf("Empates:%d\n", empates);

    if (vitoriasInter > vitoriasGremio) {
        printf("Inter venceu mais\n");
    } else if (vitoriasGremio > vitoriasInter) {
        printf("Gremio venceu mais\n");
    } else {
        printf("Nao houve vencedor\n");
    }

    return 0;
}