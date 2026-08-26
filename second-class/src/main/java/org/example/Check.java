package org.example;

import java.util.Scanner;

public class Check {

    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del cliente: ");
        String clientName = sc.nextLine();

        System.out.print("Nombre del producto: ");
        String productName = sc.nextLine();

        System.out.print("Precio: ");
        double price = sc.nextDouble();

        System.out.print("Cantidad: ");
        int quantity = sc.nextInt();

        Client client = new Client(clientName);
        Product product = new Product(productName, price);
        Sale sale = new Sale(client, product, quantity);

        sale.detail();

        sc.close();
    }
}