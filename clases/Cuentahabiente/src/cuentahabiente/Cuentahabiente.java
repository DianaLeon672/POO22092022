/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author dlaur
 */
public class Cuentahabiente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    int idCliente;
    String nombre;
    float balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(int idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
    public void retirarDinero ( float monto){
        System.out.println( "balance actual" + this.balance);
        this.balance -= monto;
        System.out.println("balance posterior" + this.balance);
    }
    
    public String evaluarNivelCliente() {
     return this.balance > 50000.0f?"Cliente Premium":"Cliente Regular";
}
          
}
