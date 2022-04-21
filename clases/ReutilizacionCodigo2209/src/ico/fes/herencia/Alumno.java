/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author dlaur
 */
public class Alumno extends Persona{
    String numerocuenta;
    String carrera;

    public Alumno() {
    }

    public Alumno(String numerocuenta, String carrera) {
        this.numerocuenta = numerocuenta;
        this.carrera = carrera;
    }

    public Alumno(String numerocuenta, String carrera, String nombre, int edad) {
        super(nombre, edad);
        this.numerocuenta = numerocuenta;
        this.carrera = carrera;
    }

    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    

    @Override
    public String toString() {
        return "Alumno{" + " numerocuenta=" + numerocuenta + ", carrera=" + carrera + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

      
    
    public void estudiar( int cantidad ){
        System.out.println(this.getNombre() + "Esta  estudiando " + cantidad + "Hrs" );
    }
    
    //Polimorfismo por sobre escritura
    @Override
    public void dormir(){
        System.out.println( "El estudiante " + getNombre() + " Esta durmiendo 5 horas . . .");
    }
    //Polimorfismo por sobrecarga
    
    public void dormir( int horasEstudio ){
        int horasDormir = 8;
        System.out.println( this.getNombre() 
                 + " esta durmiendo " + (horasDormir - horasEstudio) + " Horas ");
    }
}
