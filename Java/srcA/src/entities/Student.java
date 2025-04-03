package entities;

public class Student {
    public double p1, p2, p3, finalr;
    public String name;

    public double finalGrade() {
        finalr = (p1 + p2 + p3);
        return finalr;
    }

    public void result() {

        if (finalr > 70) {
            System.out.println("PASS!");
        } else {
            double miss = finalr - 70;
            System.out.println("FAILED MISSING " + miss);
        }
    }

}
