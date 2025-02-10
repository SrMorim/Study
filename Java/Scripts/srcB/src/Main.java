//Libs//
import java.util.Scanner;
//Body
public class Main {
    //100 Exercícios em Java para praticar.
    //Level 1: Introdução à Sintaxe e Estruturas Simples//
    static void helloWorld() {
        System.out.println("Hello, Wordl!");
    }

    static void ID() {
        String nome = "Felipe";
        int idade = 18;
        double altura = 2.00;
        boolean trabalhando = true;
        char inicial = 70;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(trabalhando);
        System.out.println(inicial);
    }

    static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");double n = scanner.nextDouble();

        System.out.println("Numero digitado: " + n);
    }

    static void sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");double n2 = scanner.nextDouble();

        double sum = n1 + n2;

        System.out.println("A soma ente os número é: " + sum);
    }

    static void average() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");double n2 = scanner.nextDouble();

        double average = (n1 + n2)/2;

        System.out.println("A média entre os dois valores é: " + average);
    }

    static void fahrenheit() {
        double c = 28;
        double f = c * 1.8 + 32;

        System.out.println("Está fazendo: " + f + " Graus Fahrenheit.");
    }

    static void odd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");int num = scanner.nextInt();

        int process = num % 2;

        if (process == 0) {
            System.out.println("é par");
        } else {
            System.out.println("é ímpar");
        }
    }

    static void triple() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: "); int n = scanner.nextInt();

        int dobro = n * 2;
        int triplo = n * 3;

        System.out.println("O dobro de " + n + " é: " + dobro);
        System.out.println("O triplo de " + n + " é: " + triplo);
    }

    static void welcome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual seu nome?: ");String nome = scanner.nextLine();

        System.out.println("Seja bem vindo, " + nome + "!");



    }

    static void age() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos anos tem?: "); int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("É menor de idade.");
        } else {
            System.out.println("É maior de idade!");
        }
    }

    //Nível 2: Estruturas Condicionais e Laços de Repetição//
    static void major() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: "); int n1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: "); int n2 = scanner.nextInt();
        System.out.print("Digite o terceiro valor: "); int n3 = scanner.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("o maior número é: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("O maior número é: " + n3);
        }
    }

    static void minor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: "); int n1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: "); int n2 = scanner.nextInt();
        System.out.print("Digite o terceiro valor: "); int n3 = scanner.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println("o menor número é: " + n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("O menor número é: " + n2);
        } else {
            System.out.println("O menor número é: " + n3);
        }

    }

    static void numverify() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor: ");int num = scanner.nextInt();

        if (num >= 1 ) {
            System.out.println("Valor positivo.");
        } else if (num == 0) {
            System.out.println("Nulo");
        } else {
            System.out.println("Valor negativo.");
        }

    }

    static void tabuada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual tabuada quer ver? (Digite o número): "); int num = scanner.nextInt();

        for (int i = 0; i < 11; i++){
            int tab = num * i;
            System.out.println(num + "x" + i + "=" + tab);
        }
    }

    static void primenum() {
        Scanner scanner = new Scanner(System.in);
    }

    //Main
    public static void main(String[] args) {
        // Rodar Atividades //
        tabuada(); //<-- Aqui
    }
}