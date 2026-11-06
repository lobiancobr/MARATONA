# -*- coding: utf-8 -*-

while True:
    notas_validas = []
    
    # Loop para ler as duas notas válidas
    while len(notas_validas) < 2:
        nota = float(input())
        
        # Uma nota é válida se estiver no intervalo [0, 10]
        if 0 <= nota <= 10:
            notas_validas.append(nota)
        else:
            print("nota invalida")
    
    # Calcula e imprime a média com 2 casas decimais
    media = sum(notas_validas) / 2
    print(f"media = {media:.2f}")
    
    # Loop para validar a continuidade do programa
    escolha = 0
    while True:
        print("novo calculo (1-sim 2-nao)")
        escolha = int(input())
        
        # Se a escolha for válida (1 ou 2), sai deste loop interno
        if escolha == 1 or escolha == 2:
            break
    
    # Se o usuário digitou 2, encerra o programa
    if escolha == 2:
        break
    