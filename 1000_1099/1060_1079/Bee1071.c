int main()
{   
    int x,y, maior, menor; 
    scanf("%d", &x);
    scanf("%d", &y);
    int contador, resultado=0;
    
    if (x>y){
        maior=x;
        menor=y;
    }else{
        menor=x;
        maior=y;
    }
  
   for (contador=maior-1; contador>menor; contador--) {
        
        if (contador%2 != 0){
            resultado = contador + resultado;   
        }
    }
    
    // se os dois numeros forem iguais, o resultado é zero.
    
    printf("%d\n", resultado );
    
    return 0;
}
