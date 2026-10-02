#include <stdio.h>
 
int main() 
{
    int cod1, cod2, qtd1, qtd2;
    double preco1, preco2, total;
    scanf("%d",&cod1);
    scanf("%d",&qtd1);
    scanf("%lf",&preco1);
    scanf("%d",&cod2);
    scanf("%d",&qtd2);
    scanf("%lf",&preco2);
    total=qtd1*preco1+qtd2*preco2;
    printf("VALOR A PAGAR: R$ %.2lf\n",total);
    return 0;
}