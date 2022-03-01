/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;

/**
 *
 * @author dlaur
 */
public class Libro {
    String Titulo;
    String Autor;
    String Editorial;
    String Idioma;
    int Paginas;
    
    public Libro() {
        
    }
           
    public Libro(String Titulo,String Autor, String Editorial, String Idioma, int Paginas){
       this.Titulo = Titulo;
       this.Autor = Autor;
       this.Editorial = Editorial;
       this.Idioma = Idioma;

    }
    
    public String getTitulo(){
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }   
     public static void main(String[] args) {
        System.out.println("Tarea Libro");
        Libro lib = new Libro();
        lib.setTitulo("Los miserables");
        System.out.println("Titulo: " + lib.getTitulo() );
        lib.setAutor("Victor Hugo");
        System.out.println("Autor: " +lib.getAutor() );
        lib.setEditorial ("Porrua");
        System.out.println("Editorial: " +lib.getEditorial() );
        lib.setIdioma ("Español");
        System.out.println("Idioma: " +lib.getIdioma() );  
        lib.setPaginas(1000);
        System.out.println("Paginas: " +lib.getPaginas() );
    
}
    
    
}
