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
    }

    public static void main(String[] args) throws Exception {
        Course.ex74();
    }
}
