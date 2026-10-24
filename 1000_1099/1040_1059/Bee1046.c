#include <stdio.h>

int main() {
    int horaInicio, horaFim;
    scanf("%d %d", &horaInicio, &horaFim);

    int duracao = (horaFim - horaInicio + 24) % 24;
    if (duracao == 0) duracao = 24;

    printf("O JOGO DUROU %d HORA(S)\n", duracao);

    return 0;
}