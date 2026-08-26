package org.example;

import java.util.Scanner;

public class SaveLibro {
    private Scanner sc;

    public SaveLibro(Scanner sc) {
        this.sc = sc;
    }

    public Libro[] saveLibros() {

        Libro[] libros = new Libro[2];

        for (int i = 0; i < libros.length; i++) {

            System.out.println("Libro número: " + (i + 1));

            System.out.println("Digita el título del libro:");
            String titulo = sc.nextLine();

            System.out.println("Digita el autor del libro:");
            String autor = sc.nextLine();

            System.out.println("Digita el año de publicación:");
            int anioPublicacion = sc.nextInt();

            sc.nextLine();

            libros[i] = new Libro(
                    autor,
                    titulo,
                    anioPublicacion
            );
        }

        return libros;
    }
}