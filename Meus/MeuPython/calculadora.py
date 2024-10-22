while True:
    print("\n Qual operação você deseja fazer? \n 1. Soma \n 2. Subtração \n 3. Multiplicação \n 4. Divisao \n 5. Ver tabuada \n 0. Sair \n")

    try:
        opcao = int(input("Digite aqui: "))
    except ValueError:
        print("Entrada inválida! Digite um número inteiro válido para a opção.")
        continue

    if opcao == 0:
        print("\nAté a próxima!\n")
        break

    if opcao in (1, 2, 3, 4):
        try:
            num1 = float(input("\nDigite o primeiro número: "))
            num2 = float(input("Digite o segundo número: "))
        except ValueError:
            print("Entrada inválida! Digite números válidos (sem vírgulas ou caracteres especiais).")
            continue

        if opcao == 1:
            r = num1 + num2
            print(num1, "+", num2, "=", r)
        elif opcao == 2:
            r = num1 - num2
            print(num1, "-", num2, "=", r)
        elif opcao == 3:
            r = num1 * num2
            print(num1, "x", num2, "=", r)
        elif opcao == 4:
            if num2 == 0:
                print("Erro: Divisão por zero não é permitida!")
            else:
                r = num1 / num2
                print(num1, "÷", num2, "=", r)

    elif opcao == 5:
        try:
            num1 = float(input("\nDigite o número para ver a tabuada: "))
        except ValueError:
            print("Entrada inválida! Digite um número válido (sem vírgulas ou caracteres especiais).")
            continue
        i = 1
        print("\nTabuada do numero", num1," :")
        while i <= 10:
            print(f"{num1} x {i} = {num1 * i}")
            i += 1

    else:
        print("\n .....................Opção inválida!..................... \n")
        
#n vou mentir, botei esse código aqui só pra ficar verdinho no meu README