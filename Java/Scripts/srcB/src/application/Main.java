package application;

import entities.*;
import java.util.*;
public class Main {

    static void ex1() {
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

    static void ex2() {
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

    static void ex3() {
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

    static void ex4() {
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

    static void ex5() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Valor do dolar: "); Calculator.doll = sc.nextDouble();
        System.out.print("Quantos dolares quer comprar?: "); Calculator.qtdoll = sc.nextDouble();
        System.out.print("Vai custar: R$" + Calculator.convertbrl());

        sc.close();
    }

    public static void main(String[] args) {

    }
}
