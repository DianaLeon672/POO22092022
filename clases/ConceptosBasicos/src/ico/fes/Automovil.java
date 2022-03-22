/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

import java.awt.Color;

/**
 *
 * @author dlaur
 */
public class Automovil {
    String marca; //Los atributos van en notación lower camel case
    String subMarca; //lower camel case todas van en minuscula y a partir de la 
    
    int modelo;
    Color color;
    
    public Automovil() {
    
}

    public Automovil(String marca, String subMarca,int modelo, Color color ){
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
                
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", subMarca=" + subMarca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
    
}
