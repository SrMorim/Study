package Application;

import Entities.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: "); String nome = sc.nextLine();
        System.out.print("Price: "); double price = sc.nextDouble();
        System.out.print("Quantity in stock: "); int quantity = sc.nextInt();
        Product product = new Product(nome, price, quantity);

        product.setName("Computador");

        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be added in stock: "); quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Update data: " + product);

        System.out.print("Enter the number of products to be removed from stock: "); quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.printf("Update data: " + product);

        sc.close();
    }

}
