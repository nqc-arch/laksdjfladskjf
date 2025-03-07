/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo.gestionPersonal;

import java.util.Calendar;

/**
 *
 * @author dam117
 */
public class Guia extends Empleado {

    /*ATRIBUTOS*/
    private String idioma;

    /*CONSTRUCTOR*/
    public Guia(Calendar fechaAlta, int numSeguridadSocial, double sueldo, String nombre, String apellidos, String genero) {
        super(fechaAlta, numSeguridadSocial, sueldo, nombre, apellidos, genero);
    }

    /*GET*/
    public String getIdioma() {
        return idioma;
    }

    /*SET*/
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

}
