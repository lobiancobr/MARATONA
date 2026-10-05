#include <stdio.h>
 
int main() {
 
    int dias,anos,meses;
    scanf("%d",&dias);
    // quantos anos
    anos=dias/365;
    // quantos dias sobraram sem os anos
    dias=dias-anos*365;
    // quantos meses
    meses=dias/30;
    // quantos dias sobraram sem os meses
    dias=dias-meses*30;
    // impressao final
    printf("%d ano(s)\n",anos);
    printf("%d mes(es)\n",meses);
    printf("%d dia(s)\n",dias);
    return 0;
}