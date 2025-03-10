/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo.gestionObras;

import java.util.Objects;

/**
 *
 * @author dam117
 */
public class Obra {

    /*ATRIBUTOS*/
    private String titulo;
    private String autor;
    private String genero;
    private double precio;

    /*CONSTRUCTOR*/
    public Obra(String titulo, String autor, String genero, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.precio = precio;
    }

    /*GET*/
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }

    /*SET*/
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /*EQUALS AND HASHCODE*/
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.titulo);
        hash = 71 * hash + Objects.hashCode(this.autor);
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
        final Obra other = (Obra) obj;
        if (!Objects.equals(this.titulo.toLowerCase(), other.titulo.toLowerCase())) {
            return false;
        }
        return Objects.equals(this.autor.toLowerCase(), other.autor.toLowerCase());
    }

    //toString
    @Override
    public String toString() {
        return "Obra{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", precio=" + precio + '}';
    }

}
