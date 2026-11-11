#include <stdio.h>
 
int main() {
    
    int alc=0, gas=0, die=0, N;
    // leitura
    do{
        scanf("%d",&N);
        switch(N){
            case 1: alc++; break;
            case 2: gas++; break;
            case 3: die++; break;
        }
    }
    while(N != 4);
    // imprime
    printf("MUITO OBRIGADO\n");
    printf("Alcool: %d\n",alc);
    printf("Gasolina: %d\n",gas);
    printf("Diesel: %d\n",die);
    return 0;
}