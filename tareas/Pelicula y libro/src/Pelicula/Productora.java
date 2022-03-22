/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author dlaur
 */
public class Productora {
    String nombreProductora;
    int fundacion;

    public Productora() {
    }

    public Productora(String nombreProductora, int fundacion) {
        this.nombreProductora = nombreProductora;
        this.fundacion = fundacion;
    }

    public String getNombreProductora() {
        return nombreProductora;
    }

    public void setNombreProductora(String nombreProductora) {
        this.nombreProductora = nombreProductora;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombreProductora=" + nombreProductora + ", fundacion=" + fundacion + '}';
    }
    
}
