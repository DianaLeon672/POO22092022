/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author dlaur
 */
public class Director {
   String nombreDirector;
   int edadDirector;

    public Director() {
    }

    public Director(String nombreDirector, int edadDirector) {
        this.nombreDirector = nombreDirector;
        this.edadDirector = edadDirector;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public int getEdadDirector() {
        return edadDirector;
    }

    public void setEdadDirector(int edadDirector) {
        this.edadDirector = edadDirector;
    }

    @Override
    public String toString() {
        return "Director{" + "nombreDirector=" + nombreDirector + ", edadDirector=" + edadDirector + '}';
    }

    
   
   
}
