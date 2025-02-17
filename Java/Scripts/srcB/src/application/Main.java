package application;

import entities.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
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
    }
}
