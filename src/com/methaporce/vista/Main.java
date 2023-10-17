package com.methaporce.vista;

import com.methaporce.modelo.GestorPelicula;
import com.methaporce.modelo.Pelicula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorPelicula gestorPelicula = new GestorPelicula();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu de opciones:");
            System.out.println("1. Agregar pelicula");
            System.out.println("2. Eliminar pelicula");
            //System.out.println("3. Marcar pelicula como disponible");
            System.out.println("3. Mostrar lista de peliculas no disponibles");
            System.out.println("4. Mostrar lista de peliculas disponibles");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("************************");
                    System.out.print("ID de la pelicula: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva linea
                    System.out.print("Nombre de la pelicula: ");
                    String nombre = scanner.nextLine();
                    System.out.print("La pelicula esta disponible? (true/false): ");
                    boolean disponible = scanner.nextBoolean();
                    Pelicula nuevaPelicula = new Pelicula(id, nombre, disponible);
                    gestorPelicula.agregarPelicula(nuevaPelicula);
                    System.out.println("Pelicula agregada.");
                    System.out.println("************************");
                    break;

                case 2:
                    System.out.println("************************");
                    System.out.print("ID de la pelicula a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    gestorPelicula.eliminarPelicula(idEliminar);
                    System.out.println("Pelicula eliminada.");
                    System.out.println("************************");
                    break;

//                

                case 3:
                    System.out.println("*************************");
                    System.out.println("Peliculas no disponibles:");
                    for (Pelicula pelicula : gestorPelicula.obtenerPeliculasNoDisponibles()) {
                        System.out.println(pelicula);
                    }
                    System.out.println("************************");
                    break;

                case 4:
                    System.out.println("************************");
                    System.out.println("Peliculas disponibles:");
                    for (Pelicula pelicula : gestorPelicula.obtenerPeliculasDisponibles()) {
                        System.out.println(pelicula);
                    }
                    System.out.println("************************");
                    break;

                case 5:
                    System.out.println("************************");
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    System.out.println("************************");
                    break;
                    
                default:
                    System.out.println("Opcion no valida. Por favor, elija una opcion valida.");
                    break;
            }
        }
    }
}
