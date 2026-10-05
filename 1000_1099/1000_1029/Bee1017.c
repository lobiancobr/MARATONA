#include <stdio.h>
 
int main() 
{
    int horas,velocidade;
    scanf("%d",&horas);
    scanf("%d",&velocidade);
    printf("%.3lf\n",horas*velocidade/12.);
    return 0;
}