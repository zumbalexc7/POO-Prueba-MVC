/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alex Zumba
 */
public class Figura {

    private long id;
    private int codIdentificador;
    private String nombre;
    private String color;

    public Figura() {
    }

    public Figura(long id, int codIdentificador, String nombre, String color) {
        this.id = id;
        this.codIdentificador = codIdentificador;
        this.nombre = nombre;
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCodIdentificacion() {
        return codIdentificador;
    }

    public void setCodIdentificacion(int codIdentificador) {
        this.codIdentificador = codIdentificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nFigura:   " + "id: " + id + ", codIdentificador: " + codIdentificador
                + "\n nombre: " + nombre + ", color: " + color;
    }

}
