package org.example;

public class Sale {
    Client client;
    Product product;
    int quantity;
    double total;

    Sale(Client client, Product product, int quantity) {
        this.client = client;
        this.product = product;
        this.quantity = quantity;
        this.total = product.price * quantity;
    }

    void detail() {
        System.out.println("--- DETALLE DE VENTA ---");
        System.out.println("Cliente : " + client.name);
        System.out.println("Producto: " + product.name);
        System.out.println("Precio  : $" + product.price);
        System.out.println("Cantidad: " + quantity);
        System.out.println("Total   : $" + total);
    }
}
