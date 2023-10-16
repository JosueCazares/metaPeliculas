package com.methaporce.modelo;

import java.util.List;
import javax.swing.JOptionPane;

public class GestorPelicula {

    private List<Pelicula> peliculas;

    public static Pelicula agregarPelicula() {
        Pelicula peli = new Pelicula();
        peli.setId(Integer.parseInt(JOptionPane.showInputDialog("Id de peli:")));
        peli.setNombre(JOptionPane.showInputDialog("Nombre de pelicula"));
       
        return peli;
    }

    public static void impAlm(List<Pelicula> peli) {
        for (Pelicula a : peli) {
            JOptionPane.showMessageDialog(null, a);
        }
    }
    
    
    public static Pelicula eliminarPeli(){
        
        
        return null;
    }
    
    public static Pelicula obtenerPelis(){
    return null;
    }
    
    public static Pelicula pelisDisponibles(){
    return null;
    }
    public static Pelicula pelisNoDisponibles(){
    return null;
    }
    
    
    public static Pelicula MarcarPeliculaComoDisponible(int id){
        
        
    return null;
    }
    
}
