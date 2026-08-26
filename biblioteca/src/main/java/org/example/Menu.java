package org.example;

import java.util.Scanner;

public class Menu {

    private Scanner sc;
    private Libro[] libros;

    public Menu(Scanner sc, Libro[] libros) {
        this.sc = sc;
        this.libros = libros;
    }

    public void menus() {

        Integer option;

        do {
            System.out.println("------- MENU ---------");
            System.out.println("1. Ver lista de libros completa");
            System.out.println("2. Buscar libro");
            System.out.println("0. Salir");
            System.out.println("----------------------");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {

                case 1:
                    allLibros();
                    break;

                case 2:
                    System.out.println("Digite el título del libro:");
                    String search = sc.nextLine();

                    searchLibro(search);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (option != 0);
    }
    private void allLibros() {

        System.out.println("------- LIBROS --------");

        for (Libro libro : libros) {
            libro.mostrarInformacion();
        }
    }
    private void searchLibro(String search) {

        System.out.println("-------- Buscando Libro ---------");

        for (Libro libro : libros) {

            if (libro.getTitulo().equalsIgnoreCase(search)) {
                libro.mostrarInformacion();
                return;
            }
        }

        System.out.println("No se encontró el libro.");
    }
}