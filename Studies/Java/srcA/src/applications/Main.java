package applications;

import entities.*;
import java.util.*;

//Code
public class Main {
    static class Exercises {
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
            double r = a + b / (a * b);

            System.out.println("Resultado: " + r);
        }

        static void ex9() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Eu falo sem boca e ouço sem ouvidos. Não tenho corpo, mas ganho vida com o vento. O que sou eu?");

            System.out.print(">>> ");
            String r = scanner.nextLine();

            System.out.println("Parabéns");
        }

        static void ex10() {
            Scanner scanner = new Scanner(System.in);
            double doll;
            double coin;

            System.out.print("Quantas moedas tem?: ");
            coin = scanner.nextByte();

            doll = coin * 0.0045;

            System.out.println("Você possui: " + doll + " em dólares");
        }

        static void ex11() {
            Scanner scanner = new Scanner(System.in);

            byte gato;
            System.out.print("Tem gato?: ");
            gato = scanner.nextByte();

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

            System.out.print("tem gato?: ");
            gato = scanner.nextByte();
            System.out.print("tem cachorro?: ");
            cachorro = scanner.nextByte();

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

            System.out.print("Quanto pesa?: ");
            peso = scanner.nextShort();
            System.out.print("Quanto tem de altura?: ");
            altura = scanner.nextShort();

            if (peso > 40 && altura > 1.20) {
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
            String[] bebidas = {"Guaraná jesus", "Guarana", "Coca", "Pepsi",};

            //bebidas[0] = "dolly"; // atualiza a array

            System.out.println(bebidas[0]);
        }

        static void ex20() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Primeiro valor: ");
            short n1 = sc.nextShort();
            System.out.print("Segundo valor: ");
            short n2 = sc.nextShort();

            int r = n1 + n2;

            System.out.println("O resultado é: " + r);
        }

        static void ex21() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o valor: ");
            byte n = sc.nextByte();

            if (n % 2 == 0) {
                System.out.println(n + " é par");
            } else {
                System.out.println(n + " é ímpar");
            }

        }

        static void ex22() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o valor: ");
            byte n = sc.nextByte();

            if (n > 0) {
                System.out.println(n + " é positivo");
            } else if (n < 0) {
                System.out.println(n + " é negativo");
            } else {
                System.out.println(n + " é nulo");
            }
        }

        static void ex23() {
            Scanner sc = new Scanner(System.in);
            System.out.print("qual a largura?: ");
            short l = sc.nextShort();
            System.out.print("qual a altura?: ");
            short a = sc.nextShort();
            System.out.print("a área do retângulo é: " + l * a);
        }

        static void ex24() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Quantos graus Fahreinheit?: ");
            short f = sc.nextShort();

            int c = (f - 32) * 5 / 9;

            System.out.println("Está fazendo " + c + " lá fora.");
        }

        static void ex25() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o primeiro valor: ");
            short n1 = sc.nextShort();
            System.out.println("Digite o segundo valor: ");
            short n2 = sc.nextShort();
            System.out.println("Digite o terceiro valor: ");
            short n3 = sc.nextShort();

            int m = (n1 + n2 + n3) / 3;

            System.out.println("a média desses valores é: " + m);
        }

        static void ex26() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número(está em String): ");
            String nString = sc.nextLine();
            int n = Integer.parseInt(nString);
            System.out.print("String convertido para número * 15: " + n / 15);
        }

        static void ex27() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o primeiro valor: ");
            byte n1 = sc.nextByte();
            System.out.print("Digite o segundo valor: ");
            byte n2 = sc.nextByte();

            if (n1 > n2) {
                System.out.println("O primeiro valor é maior: " + n1);
            } else {
                System.out.println("O segundo valor é maior: " + n2);
            }
        }

        static void ex28() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o primeiro valor: ");
            byte n1 = sc.nextByte();
            System.out.print("Digite o segundo valor: ");
            byte n2 = sc.nextByte();

            if (n1 < n2) {
                System.out.println("O primeiro valor é maior: " + n1);
            } else {
                System.out.println("O segundo valor é maior: " + n2);
            }
        }

        static void ex29() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Insira o primeiro valor: ");
            short a = sc.nextShort();
            System.out.print("Insira o segundp valor: ");
            short b = sc.nextShort();

            int sum = a + b;
            int sub = a - b;
            int mult = a * b;
            int div = a / b;

            System.out.println("a soma dos valores: " + sum);
            System.out.println("a subtração dos valores: " + sub);
            System.out.println("a multiplicação dos valores: " + mult);
            System.out.println("a divisão dos valores: " + div);
        }

        static void ex30() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Qual tabuada quer ver?: ");
            int n = sc.nextInt();
            for (int i = 1; i < 11; i++) {
                System.out.println(n + "X" + i + "=" + n * i);
            }
        }

        static void ex31() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite sua idade: ");
            short i = sc.nextShort();

            if (i < 18) {
                System.out.println("Menor de idade");
            } else {
                System.out.println("Maior de idade");
            }
        }

        static void ex32() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o valor: ");
            short n = sc.nextShort();
            int n2 = n * n;
            System.out.println(n + " ao quadrado é: " + n2);
        }

        static void ex33() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o valor: ");
            short n = sc.nextShort();
            int n3 = n * n * n;
            System.out.println(n + " ao cubo é: " + n3);
        }

        static void ex34() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Quantos metros?: ");
            short m = sc.nextShort();

            int cm = m * 10 * 10;

            System.out.print(m + " em cm é: " + cm);
        }

        static void ex35() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um valor: ");
            short n = sc.nextByte();

            int n_1 = n - 1;
            int n1 = n + 1;

            System.out.println("Seu anterior: " + n_1);
            System.out.println("Seu sucessor: " + n1);
        }

        static void ex36() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Qual o tamanho dos lados?: ");
            short l = sc.nextShort();
            int p = 4 * l;
            System.out.println("O perímetro do quadrado é: " + l);
        }

        static void ex37() {
            Scanner sc = new Scanner(System.in);
            System.out.print("insira o raio: ");
            short r = sc.nextShort();

            double a = 3.14 * r;

            System.out.println("A circuferência do círculo é: " + a);
        }

        static void ex38() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a distancia total em km: ");
            Short d = sc.nextShort();
            System.out.print("Digite a velocidade estimada em km: ");
            Short v = sc.nextShort();

            int t = d / v;

            System.out.println("O tempo estimado é de: " + t + "Horas");
        }

        static void ex39() {
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

        static void ex40() {
            Scanner sc = new Scanner(System.in);
            int idade = 10;
            String sidade = String.valueOf(idade);
            System.out.println(idade + idade);
            System.out.println(sidade + sidade);
        }

        static void ex41() {
            String nome = "Felipe";
            short idade = 18;
            boolean matricula = true;

            System.out.printf("%s tem %d anos e seu estado de matrícula é %b", nome, idade, matricula);
        }

        static void ex42() {
            String produto1 = "Computador", produto2 = "teclado";
            int idade = 30, code = 5290;
            char genero = 'F';

            double preco1 = 2100.0, preco2 = 650.50, medir = 53.234567;

            System.out.printf("Produtos: %n%s custando $%.2f%n%s custando $%.2f%n", produto1, preco1, produto2, preco2);
            System.out.printf("Recorde: %d anos de idade, codigo %d e gênero: %c%n", idade, code, genero);
            Locale.setDefault(Locale.US);
            System.out.printf("Medida com oito casas decimais: %.8f%nCom 3 casas decimais: %.3f%nCom pontos US: %.3f", medir, medir, medir);

        }

        static void ex43() {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um valor: ");
            double x = sc.nextDouble();
            System.out.print("Digite um segundo valor: ");
            double y = sc.nextDouble();
            double x2 = Math.sqrt(x);
            double xy = Math.pow(x, y);
            double absx = Math.abs(x);

            System.out.printf("A raís quadrada de %.2f é: %.2f%n", x, x2);
            System.out.printf("O número %.2f elevado a %.2f é: %.2f%n", x, y, xy);
            System.out.printf("O valor absoluto de %.2f é: %.2f%n", x, absx);
        }

        static void ex44() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um valor: ");
            int x = sc.nextInt();
            System.out.print("Digite um segundo valor: ");
            int y = sc.nextInt();

            int sum = x + y;

            System.out.printf("%d + %d = %d%n", x, y, sum);
        }

        static void ex45() {
            //Declarações
            Scanner sc = new Scanner(System.in);
            double pi = 3.14159;
            //entrada
            System.out.print("Digite o raio: ");
            double raio = sc.nextDouble();
            //processamento
            double area = pi * Math.pow(raio, 2);
            //saída
            System.out.print("A área do círculo é: " + area);
        }

        static void ex46() {
            Scanner sc = new Scanner(System.in);
            int A, B, C, D;

            System.out.print("Digite o primeiro valor: ");
            A = sc.nextInt();
            System.out.print("Digite o segundo valor: ");
            B = sc.nextInt();
            System.out.print("Digite o terceiro valor: ");
            C = sc.nextInt();
            System.out.print("Digite o quarto valor: ");
            D = sc.nextInt();

            int dif = A - B * C - D;

            System.out.println("A diferença entre o produto AB e o produto CD é: " + dif);
        }

        static void ex47() {
            Scanner sc = new Scanner(System.in);

            System.out.print("valor do produto: ");
            double preco = sc.nextDouble();

            double desconto = (preco < 2) ? preco * 0.1 : preco * 0.5;

            System.out.printf("Seu produto vai receber %.1f de desconto", desconto);


        }

        //melhor uso de While
        static void ex48() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Sistema de captura de números (digite 0 para sair):");
            int n = 1;

            int qtd = 0;

            while (n != 0) {
                n = sc.nextInt();
                qtd++;
            }

            System.out.println("Você digitou " + qtd + " números incluíndo o 0");
        }

        static void ex49() {
            Scanner sc = new Scanner(System.in);
            String r;

            do {
                System.out.print("Digite um valor: ");
                int x = sc.nextInt();
                System.out.print("Digite o outro valor: ");
                int y = sc.nextInt();

                int s = x + y;

                System.out.printf("%d + %d = %d%n%n", x, y, s);

                System.out.print("Repedir processo? (y/n)\n >>> ");
                r = sc.next();
            } while (r.equals("y"));

            System.out.println("Bye Bye...");
        }

        static void ex50() {
            //Funções para String
            String org = "abcde FGHIJ klm NOP qrs    ";

            String teste1 = org.toLowerCase(); //Caixa alta
            String teste2 = org.toUpperCase(); //Caixa baixa
            String teste3 = org.trim(); //elimina espaços no fim da string
            String teste4 = org.substring(2, 9); //Exibe a partir da posição selecionada no parâmetro (inicio / fim)


            System.out.print(teste3);
        }

        static void ex51() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um valor: ");
            short n = sc.nextShort();

            int fatorial = 1;
            for (int i = 1; i < 10; i++) {
                fatorial *= i;
            }

            System.out.println("Fatorial de " + n + " é: " + fatorial);
        }

        static void ex52() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o tamanho da sequencia: ");
            int n = sc.nextShort();

            int p = 0, s = 1;

            for (int i = 0; i < n; i++) {
                int pr = p + s;
                System.out.print(s + ", ");
                p = s;
                s = pr;
            }
        }

        static void ex53() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um valor: ");
            short n = sc.nextShort();

            if (n % 2 == 1) {
                System.out.println(n + " é primo");
            } else {
                System.out.println(n + " não é primo");
            }
        }

        static void ex54() {
            Scanner sc = new Scanner(System.in);
            System.out.print("valor: ");
            int n = sc.nextInt();
            String nStr = String.valueOf(n); //Num > Str
            System.out.println(n + " possui " + nStr.length() + " digitos");
        }

        static void ex55() {
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

        static void ex56() {
                /*Scanner sc = new Scanner(System.in);
                System.out.print("Digite um valor: ");int n = sc.nextInt();

                String nStr = String.valueOf(n);

                System.out.println("Valor invertido: " + nStr);*/
        }

        static void ex57() {
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

        static void ex58(int temp) {
            if (temp > 30) {
                System.out.println("Tá calor");
            } else if (temp < 5) {
                System.out.println("Tá Frio");
            } else {
                System.out.println("Tá de boa");
            }
        }

        static boolean ex59(int a, int b, int c) {
            int sum = a + b + c;

            if (sum == 222) {
                System.out.println("True");
                return true;
            } else {
                System.out.println("False");
                return false;
            }

        }

        static void ex60(int num) {
            System.out.println("Vamos retornar para o número" + num);
        }

        static double ex61(String nome, int peso, String unit) {
            double lua = peso * (1.62 / 9.81);

            System.out.println("Hi " + nome + " Your weight on Earth is " + peso + unit + " and your weight on the moon would be about " + lua);

            return lua;
        }

        static void ex62() {
            Scanner in = new Scanner(System.in);
            String g = in.nextLine();
            int a = in.nextInt();

            if (g.equals("M") && a >= 18 && a < 35) {
                System.out.println("May go to the military");
            } else if (g.equals("F") || g.equals("M") && a < 18) {
                System.out.println("Can't go to the military");
            } else if (g.equals("M") && a > 35) {
                System.out.println("Was already in the military");
            }
        }
    }

    static class Course {
        static void ex63() {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Triangle x = new Triangle();
            Triangle y = new Triangle();

            System.out.println("Valores de X");
            System.out.print("Declare o primeiro valor do trianguloX: ");x.a = sc.nextDouble();
            System.out.print("Declare o segundo valor do trianguloX: ");x.b = sc.nextDouble();
            System.out.print("Declare o terceiro valor do trianguloX: ");x.c = sc.nextDouble();
            System.out.println("Valores de Y");
            System.out.print("Declare o primeiro valor do trianguloY: ");y.a = sc.nextDouble();
            System.out.print("Declare o segundo valor do trianguloY: ");y.b = sc.nextDouble();
            System.out.print("Declare o terceiro valor do trianguloY: ");y.c = sc.nextDouble();

            System.out.println("\nA área do triangulo X é: " + x.area());
            System.out.println("A área do triangulo Y é: " + y.area());

            sc.close();
        }

        static void ex64() {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            Retangulo x = new Retangulo();

            System.out.print("Altura do retângulo: "); x.altura = sc.nextDouble();
            System.out.print("Largura do retângulo: "); x.largura = sc.nextDouble();

            System.out.println("Área: " + x.area());
            System.out.println("Perímetro: " + x.perimetro());
            System.out.println("Diagonal: " + x.diagonal());

            sc.close();
        }

        static void ex65() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter product data:");
            System.out.print("Name: "); String nome = sc.nextLine();
            System.out.print("Price: "); double price = sc.nextDouble();
            System.out.print("Quantity in stock: "); int quantity = sc.nextInt();
            Product product = new Product(nome, price, quantity);

            product.setName("Computador");

            System.out.println("Product data: " + product);

            System.out.print("Enter the number of products to be added in stock: "); quantity = sc.nextInt();
            product.addProducts(quantity);

            System.out.println("Update data: " + product);

            System.out.print("Enter the number of products to be removed from stock: "); quantity = sc.nextInt();
            product.removeProducts(quantity);

            System.out.printf("Update data: " + product);

            sc.close();
        }

        static void ex66() {
            Scanner sc = new Scanner(System.in);
            Funcionario employee = new Funcionario();



            System.out.print("Name: "); employee.name = sc.nextLine();
            System.out.print("Gross Salary: "); employee.grossSalary = sc.nextDouble();
            System.out.print("Tax: "); employee.tax = sc.nextDouble();

            System.out.println("Employed: " + employee.name + ", $" + employee.netSalary());

            System.out.print("Which percentage to increase salary?: "); double plus = sc.nextDouble();

            System.out.println("Update data: " + employee.name + ", $" + employee.increaseSalary(plus));


            sc.close();
        }

        static void ex67() {
            Scanner sc = new Scanner(System.in);
            Student student = new Student();

            System.out.print("Name: "); student.name = sc.nextLine();
            System.out.print("Exam 1: "); student.p1 = sc.nextDouble();
            System.out.print("Exam 2: "); student.p2 = sc.nextDouble();
            System.out.print("Exam 3: "); student.p3 = sc.nextDouble();

            System.out.println("Final grade: " + student.finalGrade());
            student.result();

            sc.close();
        }

        static void ex68() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Register Account!");

            System.out.print("Enter account number: "); int accNum = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter account holder: "); String accName = sc.nextLine();
            Account account = new Account(accNum, accName);

            account.initialDeposit();

            System.out.print("\nAccount data: " + account);

            System.out.print("\nEnter a deposit value: "); double value = sc.nextDouble();
            account.addBalance(value);

            System.out.print("\nUpdate account data: " + account);

            System.out.print("\nEnter a withdraw value: "); value = sc.nextDouble();
            account.withdrawBalance(value);

            System.out.print("\nUpdate account data: " + account);
        }

        static void ex69() {
            Scanner sc = new Scanner(System.in);
            Locale.setDefault(Locale.US);

            System.out.print("Valor do dolar: "); Calculator.doll = sc.nextDouble();
            System.out.print("Quantos dolares quer comprar?: "); Calculator.qtdoll = sc.nextDouble();
            System.out.print("Vai custar: R$" + Calculator.convertbrl());

            sc.close();
        }

        static void ex70() {
            Scanner sc = new Scanner(System.in);
            //Define o Limite
            System.out.print("Quantos números vai digitar?: "); int n = sc.nextInt();
            int[] nums = new int[n];
            //Input
            for (int i = 0; i<n; i++) {
                System.out.print("Insira: "); nums[i] = sc.nextInt();
            }
            //Output
            System.out.print("Números negativos: ");
            for (int i = 0; i<n; i++) {
                if (nums[i] < 0) { //verifica a posição atual do vetor se é positivo
                    System.out.print(nums[i] + ", "); //caso negativo, ele vai printar a posição atual do vetor
                }
            }

            sc.close();
        }

        static void ex71() {
            Scanner sc = new Scanner(System.in);

            // Input
            System.out.print("Quantos números quer digitar?: "); int n = sc.nextInt();
            double[] lista = new double[n];

            // Processamento
            double sum = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Insira: "); lista[i] = sc.nextInt();
                sum += lista[i];
            }

            double avg = sum / n;

            // Output
            System.out.print("Valores = ");
            for (int i = 0; i < n; i++) {
                System.out.print(lista[i] + " ");
            }
            System.out.println(" ");

            System.out.println("Soma dos valores inseridos: " + sum);

            System.out.println("Média dos valores inseridos: " + avg);

            sc.close();
        }

        static void ex72() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Número de registros?: "); int n = sc.nextInt();


            String[] nomes = new String[n];
            int[] idade = new int[n];
            double[] altura = new double[n];

            double sum = 0;
            int menor = 0;
            for (int i = 0 ; i<n ; i++) {
                sc.nextLine();
                System.out.println(i + 1 + "a Pessoa");
                System.out.print("Nome: "); nomes[i] = sc.nextLine();
                System.out.print("Idade: "); idade[i] = sc.nextInt();
                System.out.print("Altura: "); altura[i] = sc.nextDouble();

                sum += altura[i];
                if (idade[i] < 16) {
                    menor ++;
                }
            }
            double alturaMedia = sum / n;

            double pct = (double) menor / n * 100;

            System.out.println("Altura Média: " + alturaMedia);
            System.out.printf("Menores de 16: %.0f%%n", pct);

            //Comparar duas array
            System.out.print("Pessoas menores: ");
            for (int i = 0; i < n; i++) {
                if (idade[i] < 16) {
                    System.out.print(nomes[i]);
                }
            }
            sc.close();
        }

    }




    public static void main(String[] args) {
        Course.ex72();
    }
}