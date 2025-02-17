package entities;

public class Triangle {
    public double a, b, c;


    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c) );
    }
}
