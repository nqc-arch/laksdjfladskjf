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
public class Empleado extends Persona {

    /*ATRIBUTOS*/
    private Calendar fechaAlta;
    private int numSeguridadSocial;
    private double sueldo;

    /*CONSTRUCTOR*/
    public Empleado(Calendar fechaAlta, int numSeguridadSocial, double sueldo, String nombre, String apellidos, String genero) {
        super(nombre, apellidos, genero);
        this.fechaAlta = fechaAlta;
        this.numSeguridadSocial = numSeguridadSocial;
        this.sueldo = sueldo;
    }

    /*GET*/
    public Calendar getFechaAlta() {
        return fechaAlta;
    }

    public int getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public double getSueldo() {
        return sueldo;
    }

    /*SET*/
    public void setFechaAlta(Calendar fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setNumSeguridadSocial(int numSeguridadSocial) {
        this.numSeguridadSocial = numSeguridadSocial;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /*EQUALS && HASHCODE*/
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.numSeguridadSocial;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        return this.numSeguridadSocial == other.numSeguridadSocial;
    }

}
