//Libs
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    //Começando Java apartir do Codedéx//
    class codedex {
        static void helloworld() {
            System.out.println("Hello, World!");
        }

        static void receita() {
            System.out.println("Receita de Yogurt maneirin");
            System.out.println("[1]Pega uma tigela");
            System.out.println("[2]Adiciona 2 Yogurtes de sua preferência");
            System.out.println("[3]Adiciona Creatina");
            System.out.println("[4]Mistura");
            System.out.println("[5]Adiciona granola");
            System.out.println("[6]Mistura");
            System.out.println("[7]Adiciona Frutas vermelhas");
            System.out.println("[8]Fim");
        }

        static void erro() {
            System.err.println("Connecting to server…"); // O programa tenta estabelecer uma conexão com um servidor.
            System.err.println("Error: Connection timed out."); //A tentativa de conexão ao servidor falhou porque a conexão demorou muito.
            System.err.println("Retrying…"); //O programa será reiniciado.
            //err usado para exibir menssagem de erro.
        }

        static void toplist() {
            System.out.println("========== 🎵 Music Wrapped 🎵 ==========");
            System.out.println("Replace Me"); //Don Toliver, NAS
            System.out.println("Drugs N Hella melodies"); //Don Toliver
            System.out.println("XSCAPE"); //Don Toliver
            System.out.println("God Is"); //Kanye West
            System.out.println("Still Dreaming"); //Kanye West, NAS
            System.out.println("======= 🎵 🎵 🎵 🎵 🎵 🎵 🎵 🎵 ========");
        }

        static void soma() {
            int a = 10;
            int b = 10;
            int c = a + b;
            System.out.println(c);
        }

        static void mudanca() {
            int banheiro = 10;
            int sala = 32;
            int quarto = 12;

            System.out.println(banheiro);
            System.out.println(sala);
            System.out.println(quarto);
        }

        static void vartypes() {
            // Valores inteiros
            byte inteiro1 = 1; // Armazena valores de -128 a 127 (8 bits)
            short inteiro2 = 2; // Armazena valores de -32.768 a 32.767 (16 bits)
            int inteiro3 = 3; // Armazena valores de -2.147.483.648 a 2.147.483.647 (32 bits)
            long inteiro4 = 4; // Armazena valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 (64 bits)

            System.out.println(inteiro1);
            System.out.println(inteiro2);
            System.out.println(inteiro3);
            System.out.println(inteiro4);

            // Valores de ponto flutuante
            float ponto1 = 12.0f; // Armazena números decimais com precisão simples (32 bits, sufixo 'f' necessário)
            double ponto2 = 2.12; // Armazena números decimais com precisão dupla (64 bits)

            System.out.println(ponto1);
            System.out.println(ponto2);

            //Valores Booleanos
            boolean bool = true;
            System.out.println(bool);

            //Valores de texto
            String nome = "Joao";
            System.out.println(nome);

            //Caractere
            char hashtag = '#';
            System.out.println(hashtag);

            //exemplo de uso preciso:
            String name = "Felipe";
            byte idade = 18;
            double saldo = 18.193;
            char sexo = 'M';
            boolean filhos = false;
        }

        static void calculo() {
            double poteA = 5.5;
            double poteB = 2.5;
            double resultado = poteA + poteB / (poteA + poteB);

            System.out.println(resultado);
        }

        static void entrada() {
            System.out.println("Eu falo sem boca e ouço sem ouvidos. Não tenho corpo, mas ganho vida com o vento. O que sou eu?");

            Scanner scanner = new Scanner(System.in);
            String resposta = scanner.nextLine();
            //Obs: resposta correta é echo.
            System.out.println("Parabéns!");
        }

        static void insiranome() {
            System.out.print("Insira seu nome: ");

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
        }

        static void conversor() {
            System.out.println("Veja quantos dolares você tem em moedas club penguin");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Quantas moedas você tem?: ");int suasMoedas = scanner.nextInt();

            double conversao = suasMoedas * 0.0045; //1 moeda no Club Penguin equivale a US$ 0,0045.

            System.out.println("Você tem: " + conversao + " em dolar.");
        }

        static void decisao(){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Está fazendo chuva ou sol?: "); String resposta = scanner.nextLine();

            if (resposta.equals("sol")) {
                System.out.println("Vamos caminhar! Traga seus lanches e botas de caminhada! \uD83E\uDD7E");
            } else {
                System.out.println("Bom... fique em casa e assista a um filme! \uD83C\uDF7F");
            }
        }

        static void prova() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a nota: "); double nota = scanner.nextDouble();

            if (nota < 7){
                System.out.println("Reprovado.");
            } else {
                System.out.println("Aprovado!");
            }
        }

        static void meow() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Quantos gatos tem?: "); int gatos = scanner.nextInt();
            boolean temgato = gatos > 0;

            System.out.print("Quantos cachorros tem?: "); int cachorros = scanner.nextInt();
            boolean temcachorro = cachorros > 0;


            if (temgato) {
                System.out.println("MEOW para 20% de desconto em itens para gatos.");
            } else if (temcachorro) {
                System.out.println("WOOF para 20% de desconto em itens para cães.");
            } else {
                System.out.println("Bem-vindo à loja Pets Pets Pets!");
            }
        }

        static void montanharussa() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite sua altura: ");int altura = scanner.nextInt();
            System.out.print("Digite seu peso: ");int peso = scanner.nextInt();

            if (peso > 40 && altura > 120) {
                System.out.println("Pode entrar!");
            } else {
                System.out.println("Desculpe, mas não pode entrar.");
            }

        }

        static void exrepetir() {
            int num = 1;

            while (num < 10) {
                System.out.print(num);
                num = num + 1;
            }
        }

        static void team() {
            int x = 1;

            while (x <= 15) {
                System.out.println("LET'S GO CELTICS!");
                x++;
            }
        }

        static void limite() {
            int num = 1;

            for (int i = 0; i < 10; i++) {
                System.out.print(num);
                num++;
            }
        }

        static void loopfor() {
            String msg = "i will be great at programmer.";

            for (int i = 0; i < 10; i++) {
                System.out.println(msg);
            }
        }

        static void apocalipse() {
            String[] personalPack = {"Kit médico", "kit sobrevivência básico", "case com documentos","molle com barra de sereais","Cantil"};
            System.out.println(personalPack[0]);
            System.out.println(personalPack[3]);
            System.out.println(personalPack.length);
        }

        static void keys() {
            int[] keys = {2348, 2345823, 654, 30458, 5049, 589458, 3248238,  2374, 4234, 87756, 45654, 4654, 4566, 465465, 908, 798, 678, 67856785, 100, 234852, 23485, 456654, 543, 324534, 45678, 354, 345423, 23423, 5685, 98567, 23465, 6987, 456, 456, 798};

            for (int i = 0; i < keys.length; i++ ) {
                System.out.println(keys[i]);
                if (keys[i] == 100) {
                    System.out.println("Achou a chave dourada!");
                    break;
                }
            }
        }

        static void playlist() {
            int[] playlistA = {
                    3094234, 12323, 90990, 373737, 128732, 4388934, 2343947, 6548234, 234823, 4568,
                    2345234, 234234, 678768, 6456, 787, 46456, 678567, 354345, 23423, 645745, 23423,
                    2435423, 786768, 678786
            };
            Arrays.sort(playlistA);

            int[] playlistB = {
                    234823, 678786, 354345, 3094234, 6456, 678567, 23423, 786768,
                    46456, 128732, 6548234, 234234, 4568, 4388934, 23423, 12323,
                    2343947, 2435423, 645745, 678768, 2345234, 90990, 373737, 787
            };
            Arrays.sort(playlistB);

            if (Arrays.equals(playlistA, playlistB)) {
                System.out.println("Playlists iguais");
            } else {
                System.out.println("Não são iguais.");
            }


        }

        static void funcoes(int temp) {
            if (temp <= 32) {
                System.out.println("Tá de boa");
            } else {
                System.out.println("TÁ QUENTE AAAAAAAAAAAAAAAAAAAAAAAAAH");
            }
        }

        static double multi(double a, double b){
            double muiltiplicar = a * b;
            return muiltiplicar;
        }
    }

    class exercicios
    //Main
    public static void main(String[] args) {
        // Rodar Exercício //
        codedex.helloworld();//<--- aqui

        // Rodar atividades de funções //

    }
}