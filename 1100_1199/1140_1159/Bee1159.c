#include <stdio.h>

int main() {
    int N;
    int soma;

    while(1){
        scanf("%d", &N); 
        if (N==0)
            break;
        if(N % 2 != 0)
            N++;
        soma=0;
        for (int i=0; i<5; i++, N+=2)
            soma += N;
        printf("%d\n",soma);
    }
    return 0;
}
