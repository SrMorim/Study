//Libs
import javax.swing.*;
import javax.swing.plaf.nimbus.State;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class Main {
    //Codedéx Exercises
    class codedex {
        static void ex1() {
            System.out.println("EU AMO JAVA");
        }

        static void ex2() {
            System.out.println("Olá, sou Felipe!");
        }

        static void ex3() {
            System.out.println("Cafézin BALA:");
            System.out.println("[0]Pega uma tigela");
            System.out.println("[1]Coloca 2 potes de iogurte");
            System.out.println("[2]Coloca 1 scoop de creatina");
            System.out.println("[3]Mistura");
            System.out.println("[4]Coloca banana picada");
            System.out.println("[5]Coloca frutas vermelhas");
            System.out.println("[6]Pronto!");
        }

        static void ex4() {
            System.err.println("Conectando ao servidor…"); //O programa tenta estabelecer uma conexão com um servidor.
            System.err.println("Erro: Tempo limite de conexão esgotado."); //A tentativa de conexão ao servidor falhou porque a conexão demorou muito.
            System.err.println("Repetindo…"); //O programa será reiniciado.
        }

        static void ex5() {
            System.out.println("======== 🎵 Music Wrapped 🎵 ========");
            System.out.println("[1]Replace Me"); //Don Toliver
            System.out.println("[2]Drugs N Hella Melodies"); //Don Toliver
            System.out.println("[3]No Idea"); //Don Toliver
            System.out.println("[4]XSCAPE"); //Don Toliver
            System.out.println("[5]Smack That"); //Akon
            System.out.println("===== 🎵 🎵 🎵 🎵 🎵 🎵 🎵 🎵 🎵 🎵 🎵 ====");
        }

        static void ex6() {
            int salaDeStar;
            int quartoPrincipal;
            int banheiro;

            salaDeStar = 15;
            quartoPrincipal = 45;
            banheiro = 10;

            System.out.println(salaDeStar);
            System.out.println(quartoPrincipal);
            System.out.println(banheiro);
        }

        static void ex7() {
            String nome = "Felipe";
            String estado = "DF";
            char sexo = 'M';
            int idade = 18; //melhor usar byte por armazenar até 3 caractéres.
            boolean matriculado = true;
        }

        static void ex8() {
            double a = 5;
            double b = 121;
            double r = a + b/(a * b);

            System.out.println("Resultado: " + r);
        }

        static void ex9() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Eu falo sem boca e ouço sem ouvidos. Não tenho corpo, mas ganho vida com o vento. O que sou eu?");

            System.out.print(">>> ");String r = scanner.nextLine();

            System.out.println("Parabéns");
        }

        static void ex10() {
            Scanner scanner = new Scanner(System.in);
            double doll;
            double coin;

            System.out.print("Quantas moedas tem?: "); coin = scanner.nextByte();

            doll = coin * 0.0045;

            System.out.println("Você possui: " + doll + " em dólares");
        }

        static void ex11() {
            Scanner scanner = new Scanner(System.in);

            byte gato;
            System.out.print("Tem gato?: "); gato = scanner.nextByte();

            if (gato > 0) {
                System.out.println("20% de desconto em itens selecionados para gatos com o código MEOW2025");
            } else {
                System.out.println("Bem-vindo à loja Pets Pets Pets");
            }
        }

        static void ex12() {
            Scanner scanner = new Scanner(System.in);
            byte gato;
            byte cachorro;

            System.out.print("tem gato?: "); gato = scanner.nextByte();
            System.out.print("tem cachorro?: "); cachorro = scanner.nextByte();

            if (gato > 0) {
                System.out.println("20% de desconto em itens selecionados para gatos com o código MEOW2025");
            } else if (cachorro > 0) {
                System.out.println("Use o código WOOF para 20% de desconto em itens para cães.");
            } else {
                System.out.println("Bem-vindo à loja Pets Pets Pets");
            }

        }

        static void ex13() {
            Scanner scanner = new Scanner(System.in);
            short peso;
            float altura;

            System.out.print("Quanto pesa?: "); peso = scanner.nextShort();
            System.out.print("Quanto tem de altura?: "); altura = scanner.nextShort();

            if (peso > 40 &&  altura > 1.20) {
                System.out.print("Se divirta!");
            } else {
                System.out.print("Deixe para a próxima :(");
            }

        }

        static void ex15() {
            byte i = 0;

            while (i < 5) {
                System.out.println(i);
                i++;
            }
        }

        static void ex16() {
            byte i = 0;

            while (i < 10) {
                System.out.println("LET'S GO CELTICS!");
                i++;
            }
        }

        static void ex17() {
            for (int i = 0; i < 50; i++) {
                System.out.println("I WILL BE THE BEST JAVA PROGRAMMER ");
            }
        }

        static void ex18() {
            for (byte i = 1; i < 52; i++) {
                System.out.println("card " + i);
                if (i == 32) {
                    System.out.println("Uma carta incorreta foi encontrada no item 32");
                    break;
                }
            }
        }

        static void ex19() {
            String[] zmochila = {"machado", "kit médico", "comida", "cantil", "arma", "munição", "roupa reserva", "relógio",};
        }

        static void ex20() {
            String[] bebidas = { "Guaraná jesus", "Guarana", "Coca", "Pepsi",};

            //bebidas[0] = "dolly"; // atualiza a array

            System.out.println(bebidas[0]);
        }

        static void ex21() {
            int[] playlistA = {
                    3094234, 12323, 90990, 373737, 128732, 4388934, 2343947, 6548234, 234823, 4568,
                    2345234, 234234, 678768, 6456, 787, 46456, 678567, 354345, 23423, 645745, 23423,
                    2435423, 786768, 678786
            };
            int[] playlistB = {
                    234823, 678786, 354345, 3094234, 6456, 678567, 23423, 786768,
                    46456, 128732, 6548234, 234234, 4568, 4388934, 23423, 12323,
                    2343947, 2435423, 645745, 678768, 2345234, 90990, 373737, 787
            };
            //organizar cada
            Arrays.sort(playlistA);
            Arrays.sort(playlistB);

            //verificar
            if (Arrays.equals(playlistA, playlistB)) {
                System.out.println("São iguais");
            } else {
                System.out.println("Não são iguais");
            }

        }

        static void ex22(int temp) {
            if (temp >30 ) {
                System.out.println("Tá calor");
            } else if (temp < 5) {
                System.out.println("Tá Frio");
            } else {
                System.out.println("Tá de boa");
            }
        }

        static void ex23() {}

        static void ex24() {}

        static void ex25() {}

        static void ex26() {}

        static void ex27() {}

        static void ex28() {}

        static void ex29() {}

    }
    //
    class exercise {
        //100 Exercícios em Java para praticar.
        //Level 1: Introdução à Sintaxe e Estruturas Simples//
        class nivel1 {
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
        }

        //Nível 2: Estruturas Condicionais e Laços de Repetição//
        class nivel2 {
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
        }

        //Nível 3: Arrays e Strings
        class nivel3 {
            static void introarray() {
                Scanner scanner = new Scanner(System.in);
                ArrayList<Integer> numeros = new ArrayList<>();

                for (int i = 0; i < 5; i++) {
                    System.out.print("Digite um valor: ");int num = scanner.nextInt();
                    numeros.add(num);
                }

                System.out.println(numeros);

            }

            static void arraypares() {
                ArrayList<Integer> numeros = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);



                for (int i = 0; i < 10; i++) {
                    System.out.print("Digite um valor: ");int num = scanner.nextInt();

                    int pro = num % 2;

                    if (pro == 0) {
                        numeros.add(num);
                    }
                }

                System.out.println(numeros);
            }
        }
    }

    public static void main(String[] args) {
        //Rodar Tarefas
        exercise.nivel1.helloWorld();
    }
}