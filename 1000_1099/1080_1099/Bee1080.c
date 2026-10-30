#include <stdio.h>
 
int main() {
 
    int maior=0, posicao=0, i, N;
    
    for(i=1; i<=100; i++)
    {
        scanf("%d",&N);
        if(N > maior)
        {
            maior = N;
            posicao = i;
        }          
    }
    printf("%d\n",maior);
    printf("%d\n",posicao);
    
    return 0;
}