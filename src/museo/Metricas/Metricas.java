/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo.Metricas;

import museo.gestionPersonal.*;
import museo.gestionObras.*;
import museo.gestionVisitantes.*;

/**
 *
 * @author Soliloquy
 */
public class Metricas {
    //ratioEmpleado():
    public static double ratioEmpleado(GestorEmpleados ge){
        int contadorHombres = 0;
        int contadorMujeres = 0;
        for (Empleado e : ge.getListaEmpleados()){
            if (e.getGenero().equalsIgnoreCase("femenino") || e.getGenero().equalsIgnoreCase("mujer")){
                contadorMujeres++;
            }
            if (e.getGenero().equalsIgnoreCase("masculino") || e.getGenero().equalsIgnoreCase("hombre")){
                contadorHombres++;
            }
        }
        return contadorMujeres/contadorHombres;
    } 
    
    //ratioEmpleadoPorTipo()
    public static double ratioEmpleadoPorTipo(String tipo , GestorEmpleados ge){
        int contadorGuia = 0;
        int contadorLimpieza = 0;
        int contadorDirectivo = 0;
        for (Empleado e : ge.getListaEmpleados()){
        }
        return 0;
    } 
}
