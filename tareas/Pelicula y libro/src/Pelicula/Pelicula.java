/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author dlaur
 */
public class Pelicula {
    String nombre;
    Actor actor;
    Director director;
    Productora productora;

    public Pelicula() {
    }

    public Pelicula(String nombre, Actor actor, Director director, Productora productora) {
        this.nombre = nombre;
        this.actor = actor;
        this.director = director;
        this.productora = productora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", actor=" + actor + ", director=" + director + ", productora=" + productora + '}';
    }
    
    
}
