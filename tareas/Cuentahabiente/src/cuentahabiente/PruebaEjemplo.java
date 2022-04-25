/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author dlaur
 */
public class PruebaEjemplo {
    public static void main(String[]args){
         System.out.println("Arreglo de clientes" );
        Cuentahabiente[] lista = new Cuentahabiente[5];
          lista[0] = new Cuentahabiente(65387, "Juan", 20000.0f);
          lista[1] = new Cuentahabiente(44991, "Amelia", 50000.0f);
          lista[2] = new Cuentahabiente(78426, "Ren", 55679.0f);
          lista[3] = new Cuentahabiente(92749, "Tamara", 72564.0f);
          lista[4] = new Cuentahabiente(75848, "Ray", 68576.0f);
          
          System.out.println("For each");
          for (Cuentahabiente cliente : lista){
             System.out.println( cliente.evaluarNivelCliente() ); 
         }
    }
}