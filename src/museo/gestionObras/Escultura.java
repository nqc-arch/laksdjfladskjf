/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo.gestionObras;

/**
 *
 * @author dam117
 */
public class Escultura extends Obra {

    /*ATRIBUTOS*/
    private MATERIAL material;

    /*CONSTRUCTOR*/
    public Escultura(MATERIAL material, String titulo, String autor, String genero, double precio) {
        super(titulo, autor, genero, precio);
        this.material = material;
    }

    /*GET*/
    public MATERIAL getMaterial() {
        return material;
    }

    /*SET*/
    public void setMaterial(MATERIAL material) {
        this.material = material;
    }

}

enum MATERIAL{
    MARMOL,
    MADERA,
    PIEDRA,
    CUARZO;
}
