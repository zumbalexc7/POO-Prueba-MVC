/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Alex Zumba
 */
public class Poligono extends Figura {

    private int numeroDeLineas;
    private List<LineaDeFormacion> figuras;

    public Poligono() {
    }

    public Poligono(int numeroDeLineas) {
        this.numeroDeLineas = numeroDeLineas;
    }

    public Poligono(long id, int codIdentificador, String nombre, String color) {
        super(id, codIdentificador, nombre, color);
    }

    public Poligono(long id, int codIdentificador, String nombre, String color,
            int numeroDeLineas) {
        super(id, codIdentificador, nombre, color);
        this.numeroDeLineas = numeroDeLineas;
    }

    public Poligono(List<LineaDeFormacion> figuras, long id, int codIdentificador,
            String nombre, String color, int numeroDeLineas) {
        super(id, codIdentificador, nombre, color);
        this.numeroDeLineas = numeroDeLineas;
        this.figuras = figuras;
    }

    public int getNumeroDeLineas() {
        return numeroDeLineas;
    }

    public void setNumeroDeLineas(int numeroDeLineas) {
        this.numeroDeLineas = numeroDeLineas;
    }

    public List<LineaDeFormacion> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<LineaDeFormacion> figuras) {
        this.figuras = figuras;
    }

    @Override
    public String toString() {
        return "\nPoligono:  " + "numeroDeLineas: " + numeroDeLineas
                + "\n" + super.toString();
    }

}
