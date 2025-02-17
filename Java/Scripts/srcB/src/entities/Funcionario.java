package entities;

import java.util.Scanner;

public class Funcionario {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
         return grossSalary - tax;
    }

    public double increaseSalary(double n) {
        return grossSalary + (grossSalary * n/100) - tax;
    }
}
