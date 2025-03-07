/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo.gestionPersonal;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author dam117
 */
public class GestorEmpleados {

    /*ATRIBUTOS*/
    Set<Empleado> listaEmpleados;

    /*CONSTRUCTOR*/
    public GestorEmpleados() {
        this.listaEmpleados = new HashSet<Empleado>();
    }

    /*METODOS*/
    //insertarEmpleado()
    public void insertarEmpleado(Empleado e) {
        if (!listaEmpleados.add(e)) {
            System.out.println("El empleado ya existe.");
        } else {
            System.out.println("Empleado insertado con exito.");
        }
    }

    //eliminarEmpleado()
    public void eliminarEmpleado(int numSeguridadSocial) {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados agregados");
        } else {
            int contador = 0;
            for (Empleado e : listaEmpleados) {
                if (e.getNumSeguridadSocial() == numSeguridadSocial) {
                    listaEmpleados.remove(e);
                    System.out.println("Empleado eliminado con exito.");
                } else {
                    contador++;
                }
            }
            if (contador == listaEmpleados.size()) System.out.println("No hay"
                    + " empleados con ese numero de seguridad social.");
        }
    }

}
