import java.util.*;


public class App {

    static class Course {
        static void ex73() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Quantos números quer registrar?: "); int n = sc.nextInt();
            int[] num = new int[n];
            
            int maior = 0;
            int p = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Digite: "); num[i] = sc.nextInt();
                if (num[i] > maior) {
                    maior = num[i];
                    p = i+1;
                }
            }

            System.out.println("maior valor foi: " + maior);
            System.out.println("posição do maior valor: " + p);

            sc.close();
        }
    
        static void ex74() {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Quantos valores cada vetor?: ");int n = sc.nextInt(); 
            
            int[] a = new int[n];

            int[] b = new int[n];

            int[] r = new int[n];

            System.out.println("Valores de A");
            for (int i = 0; i < a.length; i++) {
                System.out.print("insira: "); a[i] = sc.nextInt();
            }

            System.out.println("Valores de B");
            for (int i = 0; i < b.length; i++) {
                System.out.print("insira: "); b[i] = sc.nextInt();
            }
            System.out.println("---- Soma ----");
            for (int i = 0; i < n; i++) {
                r[i] = a[i] + b[i];
                System.out.println(r[i]);
            }
            sc.close();
        }
        
        static void ex75() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Quantos quartos vão ser reservados?: "); int reserva = sc.nextInt();

            String[] nomes = new String[reserva];
            String[] emails = new String[reserva];
            int[] quartos = new int[reserva];


            for (int i = 0; i < quartos.length; i++) {
                sc.nextLine();
                System.out.println("Reserva " + (i+1));
                System.out.print("Nome: "); nomes[i] = sc.nextLine();
                System.out.print("Email: "); emails[i] = sc.nextLine();
                System.out.print("Quarto: "); quartos[i] = sc.nextInt();
            }

            System.out.println("-- Quartos ocupados --");
            for (int j = 0; j < quartos.length; j++) {
                System.out.println(quartos[j] + ": " + nomes[j] + ", " + emails[j]);
            }
            

        }
        
        static void ex76() {

            
            int r3 = 0;
            for (int i = 0; i < 500; i++) {
                int calc = 3*i;
                if (calc < 1000) {
                    r3 += calc;
                }
            }

            int r5 = 0;
            for (int i = 0; i < 500; i++) {
                int calc = 5*i;
                if (calc < 1000) {
                    r5 += calc;
                }
            }

            int r15 = 0;
            for (int i = 0; i < 500; i++) {
                int calc = 15*i;
                if (calc < 1000) {
                    r15 += calc;
                }
            }

            int finalr = r3+r5-r15;

            System.out.printf("Result multiple of 3: %d %n", r3);
            System.out.printf("Result multiple of 5: %d %n", r5);
            System.out.printf("Result multiple of 5: %d %n", r15);
            System.out.printf("Question result: %d %n", finalr);
        }
    }

    public static void main(String[] args) throws Exception {
        Course.ex76();
    }
}
