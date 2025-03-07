/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo.gestionObras;

/**
 *
 * @author dam117
 */
public class Pintura extends Obra {

    /*ATRIBUTOS*/
    private TIPOPINTURA tipoPintura;

    /*CONSTRUCTOR*/
    public Pintura(TIPOPINTURA tipoPintura, String titulo, String autor, String genero, double precio) {
        super(titulo, autor, genero, precio);
        this.tipoPintura = tipoPintura;
    }

    /*GET*/
    public TIPOPINTURA getTipoPintura() {
        return tipoPintura;
    }

    /*SET*/
    public void setTipoPintura(TIPOPINTURA tipoPintura) {
        this.tipoPintura = tipoPintura;
    }

}

enum TIPOPINTURA {
    OLEO,
    ACUARELA,
    TEMPLE,
    CAL;
}