/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Figura;

/**
 *
 * @author Alex Zumba
 */
public class ControladorFigura {

    private List<Figura> listaFiguras;
    private Figura seleccionado;

    public ControladorFigura() {
        listaFiguras = new ArrayList<>();
        seleccionado = null;
    }

    public long generarId() {
        return (listaFiguras.size() > 0) ? listaFiguras.get(listaFiguras.size() - 1).getId() + 1 : 1;
    }

    public boolean crear(int codIdentificador, String nombre, String color) {
        Figura figura = new Figura(this.generarId(), codIdentificador, nombre, color);
        return listaFiguras.add(figura);

    }

    public Figura buscar(String color) {
        for (Figura figura : listaFiguras) {
            if (figura.getColor().equals(color)) {
                return figura;
            }
        }
        return null;
    }

    public boolean actualizar(int codIdentificador, String nombre, String color, String colorNuevo) {
        Figura figura = this.buscar(color);

        if (figura != null) {
            int posicion = listaFiguras.indexOf(figura);
            figura.setCodIdentificacion(codIdentificador);
            figura.setNombre(nombre);
            figura.setColor(colorNuevo);

            return true;
        }
        return false;
    }

    public boolean eliminar(String color) {
        Figura figura = this.buscar(color);

        if (figura != null) {
            return listaFiguras.remove(figura);
        }
        return false;
    }

    public List<Figura> getListaFiguras() {
        return listaFiguras;
    }

    public void setListaFiguras(List<Figura> listaFiguras) {
        this.listaFiguras = listaFiguras;
    }

    public Figura getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Figura seleccionado) {
        this.seleccionado = seleccionado;
    }

}
