def soma():
    print('soma')
    valorA = int(input("Primeiro valor: "))
    valorB = int(input("Segundo valor: "))
    print("Resultado:", valorA + valorB)
    print("Subtração")
    print("Resultado: ", valorA - valorB)
    print("Multiplicação")
    print("Resultado:", valorA * valorB)
    valorC = int(input("Terceira entrada: "))
    print("Soma dos 3 valores")
    print(valorA + valorB + valorC)

def areatriangulo():
    print("Calcule a área do triangulo")
    
    base = float(input("Base: "))
    altura = float(input("Altura: "))
    area = base * altura / 2

    print(f"A área de um triangulo é: {area:.3f}")

def media():
    print("Calcule a média de 3 provas")
    
    notaA = float(input("Primeira prova: "))
    notaB = float(input("Segunda prova: "))
    notaC = float(input("Terceira prova: "))
    media = (notaA + notaB + notaC) / 3
    mediapon = ((notaA * 1) + (notaB * 2) + (notaC * 3))/6

    print(f"\n\n\nMédia aritmética: {media:.2f}")
    print("Média ponderada:", mediapon)

def doseideal():
    print("Dose ideal de águal para seu corpo")

    massa = float(input("Sua massa (em kg): "))
    dose = massa * 0.03

    print(f"Quantidade ideal para seu corpo é de: {dose:.2f} litros")

def celcius():
    print("Conversão Fahrenheit > Celcius")

    fah = float(input("Quantos graus Fhareinheit?: "))
    cel = 5 * (fah - 32) / 9

    print(f"\nSão {cel:.3f} graus celcius.")

def areacirculo():
    print("Calcule a área do círculo")

    raio = float(input("Qual o raio?: "))
    pi = 3.14
    area = pi * raio**2
    diametro = 2 * raio

    print(f"A área do circulo é: {area:.2f}")
    print(f"e seu diamêtro é: {diametro:.2f}")

def maiormenor():
    entrada = float(int("Digite um valor: "))

    if entrada >= 100:
        print("é maior que cem")
    else:
        print("é menor que cem")

def positivonulo():
    entrada = float(input("Digite um valor: "))
    
    if entrada > 0:
        print("número positivo")
    elif entrada == 0:
        print("numero nulo")
    else:
        print("numero negativo")
    
def imparpar():
    entrada = int(input("Digite um valor: "))
    
    impar = entrada
    resto = entrada % 2
    
    if resto == 0:
        print("par")
    else:
        print("impar")

def aprovado():
    notaA = float(input("Primeira prova: "))
    notaB = float(input("Segunda nota: "))

    media = (notaA + notaB)/2

    if media > 7:
        print("Aprovado!")
    else:
        print("Reprovado.")

def maior():
    a = int(input("Primeiro valor: "))
    b = int(input("Segundo valor: "))

    if a > b:
        print(f"entre {a} e {b}, {a} é maior")

    elif a == b:
        print(f"{a} e {b} são iguais")
    else:
        print(f"entre {b} e {a}, {b} é maior")





if __name__ == "__main__":
    maior()
