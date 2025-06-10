#Libs
import os

#Questões
def QuestaoA():
    def mostrar_mensagem(mensagem, numero):
        print(f"Mensagem: {mensagem}")
        input(f"Número: {numero}")

    def main():
        mensagem = input("Digite a mensagem: ")
        numero = int(input("Digite o número: "))
        mostrar_mensagem(mensagem, numero)

    main()  

def QuestaoB():
    def calcular_idade(ano_nascimento, ano_atual):
        return ano_atual - ano_nascimento

    def main():
        ano_nascimento = int(input("Digite o ano de nascimento: "))
        ano_atual = 2024  # Você pode usar datetime.datetime.now().year para obter o ano atual dinamicamente
        idade = calcular_idade(ano_nascimento, ano_atual)
        input(f"A idade da pessoa é: {idade} anos")

    main()

def QuestaoC():
    def somar_numeros(a, b):
        return a + b

    def main():
        a = int(input("Digite o primeiro número: "))
        b = int(input("Digite o segundo número: "))
        resultado = somar_numeros(a, b)
        input(f"O resultado da soma é: {resultado}")

    main()

#Menu
def Menu():
    while True:
        os.system('cls' if os.name == 'nt' else 'clear')
        print('Avaliação prática 5!:')
        escolha = str(input('[A]Questão A\n[B]Questão B\n[C]Questão C\n[S]Sair\nEscolha uma questão: ')).upper()
        if escolha == 'A':
            QuestaoA()
        elif escolha == 'B':
            QuestaoB()
        elif escolha == 'C':
            QuestaoC()
        elif escolha == 'S':
            break
        else:
            print('Opção inválida!')

#Executar
Menu()