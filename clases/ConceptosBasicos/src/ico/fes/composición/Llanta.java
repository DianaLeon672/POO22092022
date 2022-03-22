/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.composición;

/**
 *
 * @author dlaur
 */
public class Llanta {
    String marca;
    String rodada;

    public Llanta() {
    }

    public Llanta(String marca, String rodada) {
        this.marca = marca;
        this.rodada = rodada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    @Override
    public String toString() {
        return "Llanta{" + "marca=" + marca + ", rodada=" + rodada + '}';
    }
    
    

}
