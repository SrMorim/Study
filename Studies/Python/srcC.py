def ValorCrescete():
    valor_final = int(input("Digite o valor final: "))
    for i in range(1, valor_final + 1):
        print(i)
    print("Quantidade de valores gerados:", valor_final)

def SequenciaDoDobro():
    soma = 0
    for i in range(1, 11):
        dobro = i * 2
        print(dobro)
        soma += dobro
    media = soma / 10
    print("Soma dos valores gerados:", soma)
    print("Média aritmética da sequência:", media)



def MediaAritmetica():
    soma = 0
    for i in range(1, 6):
        nota = float(input(f"Digite a nota do aluno {i}: "))
        soma += nota
    media = soma / 5
    print("Média aritmética da turma:", media)

def ConversaoDeGraus():
    print("Fahrenheit | Celsius")
    print("-------------------")
    for f in range(45, 81):
        c = 5 * (f - 32) / 9
        print(f"{f:10} | {c:7.2f}")


def menu():
    print("\nMenu:")
    print("1. Valor Crescente")
    print("2. Sequência do Dobro")
    print("3. Média Aritmética")
    print("4. Conversão de Graus")
    print("5. Sair")
        
    escolha = input("Escolha uma opção: ")
        
    if escolha == '1':
        ValorCrescete()
    elif escolha == '2':
        SequenciaDoDobro()
    elif escolha == '3':
        MediaAritmetica()
    elif escolha == '4':
        ConversaoDeGraus()
    elif escolha == '5':
        print("bye bye")
    else:
        print("Opção inválida. Tente novamente.")

#Run
menu()