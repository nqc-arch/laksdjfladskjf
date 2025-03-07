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
public class PersonalLimpieza extends Empleado {

    /*ATRIBUTOS*/
    private String turno;

    /*CONSTRUCTOR*/
    public PersonalLimpieza(String turno, Calendar fechaAlta, int numSeguridadSocial, double sueldo, String nombre, String apellidos, String genero) {
        super(fechaAlta, numSeguridadSocial, sueldo, nombre, apellidos, genero);
        this.turno = turno;
    }

    /*GET*/
    public String getTurno() {
        return turno;
    }

    /*SET*/
    public void setTurno(String turno) {
        this.turno = turno;
    }

}
