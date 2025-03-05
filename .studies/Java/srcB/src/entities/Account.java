package entities;

public class Account {
    private int accnum; private double money;
    public String name;

    public Account(String name, int accnum) {
        this.name = name;
        this.accnum = accnum;
    }
}
