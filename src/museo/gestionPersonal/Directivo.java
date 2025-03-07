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
public class Directivo extends Empleado {

    /*ATRIBUTOS*/
    private String departamento;

    /*CONSTRUCTOR*/
    public Directivo(String departamento, Calendar fechaAlta, int numSeguridadSocial, double sueldo, String nombre, String apellidos, String genero) {
        super(fechaAlta, numSeguridadSocial, sueldo, nombre, apellidos, genero);
        this.departamento = departamento;
    }

    /*GET*/
    public String getDepartamento() {
        return departamento;
    }

    /*SET*/
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
