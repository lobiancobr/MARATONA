#include <stdio.h>
 
int main() {
 
    float numero;
    
    scanf("%f",&numero);
    
    if (numero < 0 || numero > 100)
        printf("Fora de intervalo\n");
    else
    if (numero > 75)
        printf("Intervalo (75,100]\n");
    else
    if (numero > 50)
        printf("Intervalo (50,75]\n");
    else
    if (numero > 25)
        printf("Intervalo (25,50]\n");
    else
        printf("Intervalo [0,25]\n");
    return 0;
}
