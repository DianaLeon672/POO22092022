/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia.polimorfismo;

/**
 *
 * @author dlaur
 */
public class Animal {
    int numeropatas;

    public Animal() {
    }

    public Animal(int numeropatas) {
        this.numeropatas = numeropatas;
    }

    public int getNumeropatas() {
        return numeropatas;
    }

    public void setNumeropatas(int numeropatas) {
        this.numeropatas = numeropatas;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeropatas=" + numeropatas + '}';
    }
    
    public void emitirSonido(){
          System.out.println("EmitiendoSonido...");
          
}
}