/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author dlaur
 */
public class Persona { //Java Bean Es diferente a un Enterprise Java Bean
    public int edad;
    private String nombre;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >=0 && edad <=120){
    this.edad = edad;
        }else{
            System.out.println("Valor fuera de rango");
        }
     }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }
    
}
