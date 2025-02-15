//Libs
import javax.swing.*;
import java.util.*;

//Code
public class Main {

    //Codedéx Exercises
    class Codedex {
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

        static void ex14() {
            byte i = 0;

            while (i < 5) {
                System.out.println(i);
                i++;
            }
        }

        static void ex15() {
            byte i = 0;

            while (i < 10) {
                System.out.println("LET'S GO CELTICS!");
                i++;
            }
        }

        static void ex16() {
            for (int i = 0; i < 50; i++) {
                System.out.println("I WILL BE THE BEST JAVA PROGRAMMER ");
            }
        }

        static void ex17() {
            for (byte i = 1; i < 52; i++) {
                System.out.println("card " + i);
                if (i == 32) {
                    System.out.println("Uma carta incorreta foi encontrada no item 32");
                    break;
                }
            }
        }

        static void ex18() {
            String[] zmochila = {"machado", "kit médico", "comida", "cantil", "arma", "munição", "roupa reserva", "relógio",};
        }

        static void ex19() {
            String[] bebidas = { "Guaraná jesus", "Guarana", "Coca", "Pepsi",};

            //bebidas[0] = "dolly"; // atualiza a array

            System.out.println(bebidas[0]);
        }

        static void ex20() {
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

        static void ex21(int temp) {
            if (temp >30 ) {
                System.out.println("Tá calor");
            } else if (temp < 5) {
                System.out.println("Tá Frio");
            } else {
                System.out.println("Tá de boa");
            }
        }

        static boolean ex22(int a, int b, int c) {
            int sum = a + b + c;

            if (sum == 222) {
                System.out.println("True");
                return true;
            } else {
                System.out.println("False");
                return false;
            }

        }

        static void ex23(int num) {
            System.out.println("Vamos retornar para o número" + num);
        }

        static double ex24(String nome, int peso, String unit) {
            double lua = peso * (1.62/9.81);

            System.out.println("Hi " + nome + " Your weight on Earth is " + peso + unit + " and your weight on the moon would be about " + lua);

            return lua;
        }
    }

    //100 Exercises
    class Exercises {
        class level1 {
            static void ex1() {
                System.out.println("Hello, World!");
            }

            static void ex2() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Primeiro valor: ");short n1 = sc.nextShort();
                System.out.print("Segundo valor: ");short n2 = sc.nextShort();

                int r = n1 + n2;

                System.out.println("O resultado é: " + r);
            }

            static void ex3() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Digite o valor: ");byte n = sc.nextByte();

                if (n % 2 == 0) {
                    System.out.println(n + " é par");
                } else {
                    System.out.println(n + " é ímpar");
                }

        }

            static void ex4() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Digite o valor: "); byte n = sc.nextByte();

                if (n > 0) {
                    System.out.println(n + " é positivo");
                } else if (n < 0) {
                    System.out.println(n + " é negativo");
                } else {
                    System.out.println(n + " é nulo");
                }
            }

            static void ex5() {
                Scanner sc = new Scanner(System.in);
                System.out.print("qual a largura?: ");short l = sc.nextShort();
                System.out.print("qual a altura?: ");short a = sc.nextShort();
                System.out.print("a área do retângulo é: " + l*a);
            }

            static void ex6() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Quantos graus Fahreinheit?: "); short f = sc.nextShort();

                int c = (f-32)*5/9;

                System.out.println("Está fazendo " + c + " lá fora.");
            }

            static void ex7() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o primeiro valor: "); short n1 = sc.nextShort();
                System.out.println("Digite o segundo valor: "); short n2 = sc.nextShort();
                System.out.println("Digite o terceiro valor: "); short n3 = sc.nextShort();

                int m = (n1+n2+n3)/3;

                System.out.println("a média desses valores é: " + m);
            }

            static void ex8() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Digite um número(está em String): ");String nString = sc.nextLine();
                int n = Integer.parseInt(nString);
                System.out.print("String convertido para número * 15: " + n / 15);
            }

            static void ex9() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Digite o primeiro valor: ");byte n1 = sc.nextByte();
                System.out.print("Digite o segundo valor: ");byte n2 = sc.nextByte();

                if (n1 > n2) {
                    System.out.println("O primeiro valor é maior: " + n1);
                } else {
                    System.out.println("O segundo valor é maior: " + n2);
                }
            }

            static void ex10() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Digite o primeiro valor: ");byte n1 = sc.nextByte();
                System.out.print("Digite o segundo valor: ");byte n2 = sc.nextByte();

                if (n1 < n2) {
                    System.out.println("O primeiro valor é maior: " + n1);
                } else {
                    System.out.println("O segundo valor é maior: " + n2);
                }
            }

            static void ex11() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Insira o primeiro valor: "); short a = sc.nextShort();
                System.out.print("Insira o segundp valor: "); short b = sc.nextShort();

                int sum = a + b;
                int sub = a - b;
                int mult = a * b;
                int div = a / b;

                System.out.println("a soma dos valores: " + sum);
                System.out.println("a subtração dos valores: " + sub);
                System.out.println("a multiplicação dos valores: " + mult);
                System.out.println("a divisão dos valores: " + div);
            }

            static void ex12() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Qual tabuada quer ver?: "); int n = sc.nextInt();
                for (int i = 1; i < 11; i++) {
                    System.out.println(n + "X" + i + "=" + n*i);
                }
            }

            static void ex13() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Digite sua idade: "); short i = sc.nextShort();

                if (i < 18) {
                    System.out.println("Menor de idade");
                } else {
                    System.out.println("Maior de idade");
                }
            }

            static void ex14() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o valor: "); short n = sc.nextShort();
                int n2 = n*n;
                System.out.println(n + " ao quadrado é: " + n2 );
            }

            static void ex15() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Digite o valor: ");short n = sc.nextShort();
                int n3 = n*n*n;
                System.out.println(n + " ao cubo é: " + n3);
            }

            static void ex16() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Quantos metros?: "); short m = sc.nextShort();

                int cm = m * 10 * 10;

                System.out.print(m + " em cm é: " + cm);
            }

            static void ex17() {
                Scanner sc = new Scanner(System.in);

                System.out.print("Digite um valor: "); short n = sc.nextByte();

                int n_1= n-1;
                int n1 = n+1;

                System.out.println("Seu anterior: " + n_1);
                System.out.println("Seu sucessor: " + n1);
            }

            static void ex18() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Qual o tamanho dos lados?: ");short l = sc.nextShort();
                int p = 4 * l;
                System.out.println("O perímetro do quadrado é: " + l);
            }

            static void ex19() {
                Scanner sc = new Scanner(System.in);
                System.out.print("insira o raio: "); short r = sc.nextShort();

                double a = 3.14 * r;

                System.out.println("A circuferência do círculo é: " +  a);
            }

            static void ex20(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Digite a distancia total em km: ");Short d = sc.nextShort();
                System.out.print("Digite a velocidade estimada em km: ");Short v = sc.nextShort();

                int t = d/v;

                System.out.println("O tempo estimado é de: " + t + "Horas");
            }

        }

        class level2 {
            static void ex21() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Digite um valor: ");short n = sc.nextShort();

                int fatorial = 1;
                for (int i = 1; i < 10; i++) {
                    fatorial *= i;
                }

                System.out.println("Fatorial de " + n + " é: " + fatorial);
            }

            static void ex22() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Digite o tamanho da sequencia: ");int n = sc.nextShort();

                int p = 0, s = 1;

                for (int i = 0; i < n;i++) {
                    int pr = p + s;
                    System.out.print(s + ", ");
                    p = s;
                    s = pr;
                }
            }

            static void ex23() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Digite um valor: ");short n = sc.nextShort();

                if (n % 2 == 1) {
                    System.out.println(n + " é primo");
                } else {
                    System.out.println(n + " não é primo");
                }
            }

            static void ex24() {
                Scanner sc = new Scanner(System.in);
                System.out.print("valor: "); int n = sc.nextInt();
                String nStr = String.valueOf(n); //Num > Str
                System.out.println(n + " possui " + nStr.length() + " digitos");
            }

            static void ex25() {
                /*Scanner sc = new Scanner(System.in);
                System.out.print("valor: ");int n = sc.nextInt();

                String nStr = String.valueOf(n);
                int n2 = nStr.length();

                System.out.println("A quantidade de digitos que n tem é: " + n2 );

                int p = 1, s = 2;
                int pro = p + s;

                for (int i = 0; i < n2;i++) {
                    p = s;
                    s = pro;
                }
                System.out.print("A soma dos dos dígitos é: " + pro);*/ //Corrigir.
            }

            static void ex26() {
                /*Scanner sc = new Scanner(System.in);
                System.out.print("Digite um valor: ");int n = sc.nextInt();

                String nStr = String.valueOf(n);

                System.out.println("Valor invertido: " + nStr);*/
            }
        }
   }

    class SoloStudies {
        static void ex1() {
            int idade = 18;
            String nome = "Felipe";
            System.out.printf("%s tem %d \n", nome, idade);

            //int = %d
            //float/double = %f
            //char = %c
            //String = %s
            //boolean = %e
            //hex (int) = %x
            //octal(int) = %o
            //hashcode = %h
        }

        static void ex2() {
            Scanner sc = new Scanner(System.in);
            int idade = 10;
            String sidade = String.valueOf(idade);
            System.out.println(idade + idade);
        }
   }

    class CodinGame{
        class Solutions{
            static void ex1() {
                Scanner in = new Scanner(System.in);
                String g = in.nextLine();
                int a = in.nextInt();

                if (g.equals("M") && a >= 18 && a < 35){
                    System.out.println("May go to the military");
                } else if (g.equals("F") || g.equals("M") && a < 18) {
                    System.out.println("Can't go to the military");
                } else if (g.equals("M") && a > 35) {
                    System.out.println("Was already in the military");
                }
            }
        }
    }

   //Main
    public static void main(String[] args) {
        //Run Exercises
        SoloStudies.ex2();
    }
}