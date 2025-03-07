package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    //Construtores
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Setter e Getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }



    //Funções
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() { //qualquer outro nome, caso printe somente o objeto, ele vai retornar o espaço reservado na memória, mas se sobrescrever o toString, ele converte o espaço na memória para a mensagem personalizada.
        return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, total: $" + String.format("%.2f", totalValueInStock());
    }

}
