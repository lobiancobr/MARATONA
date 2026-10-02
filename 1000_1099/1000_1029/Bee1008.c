#include <stdio.h>
 
int main() {
 
    int Numero, Horas;
    scanf("%d",&Numero);
    scanf("%d",&Horas);
    double Valor;
    scanf("%lf",&Valor);
    printf("NUMBER = %d\n",Numero);
    printf("SALARY = U$ %.2lf\n",Horas*Valor);
    return 0;
}