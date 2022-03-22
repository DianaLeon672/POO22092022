/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LyP;

import Libro.Libro;
import Libro.Editorial;
import Libro.Autor;
import Pelicula.Pelicula;
import Pelicula.Actor;
import Pelicula.Director;
import Pelicula.Productora;

/**
 *
 * @author dlaur
 */
public class LyP {
    
      public static void main(String[] args) {
      Libro lib = new Libro("Carry On",
                new Autor("Rainbow Rowell", 49),
                new Editorial("Alfaguara Juvenil", 544));
      System.out.println( lib );
      
       Pelicula pelicula = new Pelicula("Belle", 
             new Actor("Kaho Nakamura", 29),
             new Director("Mamoru Hosoda", 54),
             new Productora("Studio Chizu", 2011));
       System.out.println( pelicula );
    }
     
}