/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author dlaur
 */
public class Editorial {
    String nombreEd;
    int numpags;

    public Editorial() {
    }

    public Editorial(String nombreEd, int numpags) {
        this.nombreEd = nombreEd;
        this.numpags = numpags;
    }

    public String getNombreEd() {
        return nombreEd;
    }

    public void setNombreEd(String nombreEd) {
        this.nombreEd = nombreEd;
    }

    public int getFecha() {
        return numpags;
    }

    public void setFecha(int fecha) {
        this.numpags = fecha;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombreEd=" + nombreEd + ", numpags=" + numpags + '}';
    }

     
}
