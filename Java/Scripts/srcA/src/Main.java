//Imports
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Rodar Exercício //
        meow(); //<--- aqui
    }

    // Exercícios Abaixo //
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
        //Valores inteiros
        byte inteiro1 = 1;
        short inteiro2 = 2;
        int inteiro3 = 3;
        long inteiro4 = 4;

        System.out.println(inteiro1);
        System.out.println(inteiro2);
        System.out.println(inteiro3);
        System.out.println(inteiro4);

        //Valores de ponto
        double ponto2 = 2.12;
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
    }

    static void ID() {
        String nome = "Felipe";
        String estado = "DF";
        char sexo = 'M';
        int idade = 18;
        boolean afiliado = true;
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
        } if (temcachorro) {
            System.out.println("WOOF para 20% de desconto em itens para cães.");
        } else if (temgato && temcachorro) {
            System.out.println("MEOW e WOOF para 20% de desconto em itens para gatos e cachorros.");
        } else {
            System.out.println("Bem-vindo à loja Pets Pets Pets!");
        }
    }

}