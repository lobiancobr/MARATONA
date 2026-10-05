#include <stdio.h>
 
int main() {
 
    int A, B, C, D, aceito=0;
    scanf("%d %d %d %d",&A,&B,&C,&D);
    int somaAB=A+B;
    int somaCD=C+D;
    
    //se B for maior do que C
    if(B > C) 
    //se D for maior do que A
    if(D > A) 
    //soma de C com D for maior que a soma de A e B
    if(somaCD > somaAB)
    //se C e D, ambos, forem positivos
    if(C>0 && D>0)
    //se a variável A for par
    if(A%2==0)
        aceito=1;
        
    if(aceito==1)
        printf("Valores aceitos\n");
    else
        printf("Valores nao aceitos\n");
        
    return 0;
}