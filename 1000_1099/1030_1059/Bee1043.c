#include <stdio.h>
 
int main() {
 
    double a, b, c, perimetro, area;
    scanf("%lf",&a);
    scanf("%lf",&b);
    scanf("%lf",&c);

    // Verificando se os valores formam um triângulo
    if ((a + b) > c && (a + c) > b && (b + c) > a){
        // Calculando o perímetro do triângulo
        perimetro = a + b + c;
        printf("Perimetro = %.1f\n" , perimetro);
    }
    else{
        // Calculando a área do trapézio
        area = ((a + b) * c) / 2;
        printf("Area = %.1f\n" , area);          
    }
}