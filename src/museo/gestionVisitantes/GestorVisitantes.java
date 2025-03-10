/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo.gestionVisitantes;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Soliloquy
 */
public class GestorVisitantes {

    /*ATRIBUTOS*/
    Queue<Visitante> colaVisitantes;

    /*CONSTRUCTOR*/
    public GestorVisitantes() {
        colaVisitantes = new LinkedList<Visitante>();
    }

    /*MEHTODS*/
    //InseertarVisitante()
    public void InsertarVisitante(Visitante visit) {
        colaVisitantes.add(visit);
    }

    //EliminarVisitante()
    public void EliminarPrimero() {
        colaVisitantes.remove();
    }

    //EliminarVisitante() : eliminar un visitante dando su id.
    public void EliminarVisitante(int idTarget) {
        for (Visitante v : colaVisitantes) {
            if (v.getId() == idTarget) {
                colaVisitantes.remove(v);
            }
        }
    }

    //MostrarVisitante():
    public void MostrarVisitante(int idTarget) {
        for (Visitante v : colaVisitantes) {
            if (v.getId() == idTarget) {
                System.out.println(v.toString());
            }
        }
    }
}
