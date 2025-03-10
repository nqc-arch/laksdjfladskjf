/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo.gestionObras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author dam117
 */
public class GestorObras {

    /*ATRIBUTOS*/
    private List<Obra> listaObras;

    /*CONSTRUCTOR*/
    public GestorObras() {
        listaObras = new ArrayList<Obra>();
    }


    /*METHODDS*/
    //InsertarObra()
    public void InsertarObra(Obra o) {
        if (listaObras.contains(o)) {
            System.out.println("La obra ya está en la lista.");
        } else {
            listaObras.add(o);
        }
    }

    //EliminarObra()
    public void EliminarObra(String titulo, String autor) {
        Iterator<Obra> it = listaObras.iterator();
        if (it.hasNext()) {
            Obra i = it.next();
            if (i.getGenero().equalsIgnoreCase(titulo) && i.getAutor().equalsIgnoreCase(autor)) {
                listaObras.remove(i);
            }
        }
    }

    //Mostrar():
    public void Mostrar() {
        for (Obra o : listaObras) {
            System.out.println(o.toString());
        }
    }
}
