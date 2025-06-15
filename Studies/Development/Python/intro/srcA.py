def ex1():
    nome = 'felipe'
    sobrenome = 'monteiro'
    idade = 99
    ano_nascimento = 2099
    maioridade = 'sim'
    altura_metros = 3.20

    print("Nome:", nome)
    print("Sobrenome:", sobrenome)
    print("Idade:", idade)
    print("Ano de nascimento:", ano_nascimento)
    print("Maior de idade?:", "sim")
    print("Altura em metros:", altura_metros)

def ex2():
    nome = input("Digite seu nome: ")
    altura = float(input("Digite sua altura em metros:"))
    peso = int(input("Digite seu peso em kg:"))

    imc = peso/altura**2

    print(f"{nome} tem {altura} de altura, pesa {peso} e seu IMC é {imc}")

def ex3():
    print("commit")
    
    

if __name__ == "__main__":
    ex2()