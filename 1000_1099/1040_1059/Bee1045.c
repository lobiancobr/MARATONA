#include <stdio.h>
 
int main() {
 
    double A, B, C, aux, A2, B2, C2;
    //leitura
    scanf("%lf",&A);
    scanf("%lf",&B);
    scanf("%lf",&C);
    //se B>A troca de lugar com A
    if (B > A)
    {
        aux=A;
        A=B;
        B=aux;
    }
    //se C>A troca de lugar com A
    if (C > A)
    {
        aux=A;
        A=C;
        C=aux;
    }
    //verifica se forma triangulo
    if (A >= B+C)
        printf("NAO FORMA TRIANGULO\n");
    else
    {
        A2=A*A;
        B2=B*B;
        C2=C*C;
        if(A2 == B2+C2)
            printf("TRIANGULO RETANGULO\n");
        else
        if(A2 > B2+C2)
            printf("TRIANGULO OBTUSANGULO\n");
        else
            printf("TRIANGULO ACUTANGULO\n");
            
        if(A==B && B==C)
            printf("TRIANGULO EQUILATERO\n");
        else
            if(A==B || B==C || C==A)
                printf("TRIANGULO ISOSCELES\n");
    }
    
    return 0;
}