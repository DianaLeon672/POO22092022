/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia.polimorfismo;

/**
 *
 * @author dlaur
 */
public class Perro extends Animal {
    
    String raza;
    String pedegree;

    public Perro() {
    }

    public Perro(String raza, String pedegree, int numeropatas) {
        super(numeropatas);
        this.raza = raza;
        this.pedegree = pedegree;
    }
 
 
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPedegree() {
        return pedegree;
    }

    public void setPedegree(String pedegree) {
        this.pedegree = pedegree;
    }

 
    

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", pedegree=" + pedegree + ", numeropatas=" + numeropatas + '}';
    }
    
    @Override
    public void emitirSonido(){
        System.out.println("El perro esta ladrando");
    }
}
