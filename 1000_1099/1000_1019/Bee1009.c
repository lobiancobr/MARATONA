#include <stdio.h>
 
int main() {
 
    char Nome[40];
    scanf("%s",Nome);
    double Salario,Vendas;
    scanf("%lf",&Salario);
    scanf("%lf",&Vendas);
    printf("TOTAL = R$ %.2lf\n",Salario+Vendas*.15);
    return 0;
}