public class Main {
    public static void main(String[] args) {
        // Rodar Exercício //
        soma(); //<--- aqui
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
}
