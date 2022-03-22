/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;

import ico.fes.Alumno;
import ico.fes.Automovil;
import ico.fes.Persona;
import ico.fes.Silla;
import java.awt.Color;
/**
 *
 * @author dlaur
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System .out.println("Hola de nuevo");
        Silla s1 = new Silla();
        System.out.println( s1 ); //por defecto se invoca tuString()
        System.out.println( s1.toString() );
        
        Automovil miBocho = new Automovil();
        miBocho.setMarca ("VM");
        miBocho.setSubMarca ("Sedan");
        miBocho.setModelo(1978);
        miBocho.setColor(Color.BLUE);
        System.out.println (miBocho);
        
        Automovil miMustang = new Automovil("Ford", "Mustang", 2010, Color.yellow);
        System.out.println(miMustang);
        
        Automovil miAcura = new Automovil ("Acura", "NSX", 2013, Color.gray);
        System.out.println(miAcura);
        
        Persona per1=new Persona();
         //per1.edad=200000; no se permite por seguridad
         per1.setEdad(200000);
        System.out.println(per1);
        
        Alumno al = new Alumno();
        al.setNombre("Diana");
        al.setNumeroCuenta("319034244");
        System.out.print( al );
    }
}
