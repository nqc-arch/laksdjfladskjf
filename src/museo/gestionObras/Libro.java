/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo.gestionObras;

/**
 *
 * @author dam117
 */
public class Libro extends Obra {

    /*ATRIBUTOS*/
    private String editorial;

    /*CONSTRUCTOR*/
    public Libro(String editorial, String titulo, String autor, String genero, double precio) {
        super(titulo, autor, genero, precio);
        this.editorial = editorial;
    }

    /*GET*/
    public String getEditorial() {
        return editorial;
    }

    /*SET*/
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

}
