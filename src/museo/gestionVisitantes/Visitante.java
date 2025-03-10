/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo.gestionVisitantes;

/**
 *
 * @author Soliloquy
 */
public class Visitante {

    /*ATRIBUTOS*/
    private int edad;
    private GENERO genero;
    private String provincia;
    private int id;
    private static int Counter = 0;

    /*CONSTURCTOR*/
    public Visitante(int edad, GENERO genero, String provincia) {
        this.edad = edad;
        this.genero = genero;
        this.provincia = provincia;
        this.id = Counter++;
    }

    /*GET*/
    public int getEdad() {
        return edad;
    }

    public GENERO getGenero() {
        return genero;
    }

    public String getProvincia() {
        return provincia;
    }

    public int getId() {
        return id;
    }

    /*SET*/
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(GENERO genero) {
        this.genero = genero;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*toString*/
    @Override
    public String toString() {
        return "Visitante{" + "edad=" + edad + ", genero=" + genero + ", provincia=" + provincia + ", id=" + id + '}';
    }

}

enum GENERO {
    MASCULINO,
    FEMENINO;
}
