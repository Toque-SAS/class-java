package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        SaveLibro saveLibros = new SaveLibro(sc);

        Libro[] libros = saveLibros.saveLibros();

        Menu menu = new Menu(sc, libros);
        menu.menus();

        sc.close();
    }
}
