#include <stdio.h>
 
int main() {
 
    int N, i, Q, T, TC=0, TR=0, TS=0;
    char tipo;
    
    scanf("%d",&N);
    
    for(i=0; i<N; i++)
    {
        scanf("%d %c", &Q, &tipo);
        if(tipo=='R') TR+=Q;
        if(tipo=='S') TS+=Q;
        if(tipo=='C') TC+=Q;
    }
    T = TR + TS + TC;
    
    printf("Total: %d cobaias\n", T);
    printf("Total de coelhos: %d\n",TC);
    printf("Total de ratos: %d\n",TR);
    printf("Total de sapos: %d\n",TS);
    printf("Percentual de coelhos: %.2f %%\n",(TC*100.)/T);
    printf("Percentual de ratos: %.2f %%\n",(TR*100.)/T);
    printf("Percentual de sapos: %.2f %%\n",(TS*100.)/T);
    return 0;
}