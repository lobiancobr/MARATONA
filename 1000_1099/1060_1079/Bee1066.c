#include <stdio.h>
 
int main() {
 
    int i, aux, Tpar=0, Tpos=0, Tneg=0;
    
    for(i=0; i<5; i++)
    {
        scanf("%d",&aux);
        if(aux%2==0) Tpar++;
        if(aux>0)    Tpos++;
        if(aux<0)    Tneg++;
    }
    printf("%d valor(es) par(es)\n", Tpar);
    printf("%d valor(es) impar(es)\n", 5 - Tpar);
    printf("%d valor(es) positivo(s)\n", Tpos);
    printf("%d valor(es) negativo(s)\n", Tneg);

    return 0;
}
