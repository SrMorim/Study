def QuestaoA():
    def maximo(a, b):
        if a > b:
            return a
        else:
            return b

    def main():
        num1 = int(input("Digite o primeiro número: "))
        num2 = int(input("Digite o segundo número: "))
        maior = maximo(num1, num2)
        print(f"O maior número é: {maior}")

    main()

def QuestaoB():
    def positivo_nulo_negativo(numero):
        if numero > 0:
            print("Valor Positivo")
        elif numero == 0:
            print("Valor nulo")
        else:
            print("Valor negativo")

    def main():
        numero = float(input("Digite um número real: "))
        positivo_nulo_negativo(numero)

    main()

def QuestaoC():
    def valor_absoluto(numero):
        if numero < 0:
            return -numero
        else:
            return numero

    def main():
        numero = float(input("Digite um número real: "))
        absoluto = valor_absoluto(numero)
        print(f"O valor absoluto é: {absoluto}")

    main()

def menu():
    while True:
        print("\nEscolha uma questão para executar:")
        print("1. Questão A")
        print("2. Questão B")
        print("3. Questão C")
        print("4. Sair")
        
        escolha = input("Digite o número da questão ou 4 para sair: ")
        
        if escolha == '1':
            QuestaoA()
        elif escolha == '2':
            QuestaoB()
        elif escolha == '3':
            QuestaoC()
        elif escolha == '4':
            print("Saindo...")
            break
        else:
            print("Escolha inválida. Tente novamente.")

if __name__ == "__main__":
    menu()
