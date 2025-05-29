public class Problems {
    static class Solution {
        // 5%
        static void id1() {
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
    
        static void id2() {
            int a = 0, b = 1, c = a + b;
            int sum = 0;

            while (c < 4000000) {  // Continua até c ultrapassar 4 milhões
                if (c % 2 == 0) {  // Verifica se o termo é par
                    sum += c;
                }
                
                // Atualiza os valores para o próximo termo da sequência
                a = b;
                b = c;
                c = a + b;
            }

            System.out.println("Result: " + sum); // Exibe a soma dos pares
        }

        static void id6() {
            double r2 = 0;
            for (int i = 0; i < 101 ; i++) {
                double calc = Math.pow(i, 2);
                r2 += calc;
            }

            double r3 = 0;
            for (int i = 0; i < 101; i++) {
                double calc = i;
                r3 += calc;
            }

            double convert = Math.pow(r3, 2);
      
            System.out.println("ex1: " + r2);
            System.out.println("ex2: " + convert);

            System.out.printf("final: %.0f %n", (convert - r2) );
        }








        // 10%
    }  

    public static void main(String[] args) {
        Solution.id2();
    }
}
