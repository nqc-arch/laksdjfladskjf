/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo.gestionPersonal;

/**
 *
 * @author dam117
 */
public class Persona {

    /*ATRIBUTOS*/
    private String nombre;
    private String apellidos;
    private String genero;

    /*CONSTRUCTOR*/
    public Persona(String nombre, String apellidos, String genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
    }

    /*GET*/
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGenero() {
        return genero;
    }

    /*SET*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
