#include <stdio.h>
 
int main() {
    
    int h1,m1,h2,m2,t1,t2;
    // leitura dos tres valores inteiros
    scanf("%d",&h1);
    scanf("%d",&m1);
    scanf("%d",&h2);
    scanf("%d",&m2);
    // transforma em minutos
    t1 = h1*60 + m1;
    t2 = h2*60 + m2;
    // imprime a diferenca
    if(t1<t2)
        printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(t2-t1)/60,(t2-t1)%60);
    else
        printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(24*60 + t2-t1)/60,(24*60 + t2-t1)%60);

    return 0;
}