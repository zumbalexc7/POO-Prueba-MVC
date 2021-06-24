/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Poligono;

/**
 *
 * @author Alex Zumba
 */
public class ControladorPoligono {

    private List<Poligono> listaPoligonos;
    private Poligono seleccionado;

    public ControladorPoligono() {
        listaPoligonos = new ArrayList<>();
        seleccionado = null;
    }

    public long generarId() {
        return (listaPoligonos.size() > 0) ? listaPoligonos.get(listaPoligonos.size() - 1).getId() + 1 : 1;
    }

    public boolean crear(int codIdentificador, String nombre, String color, int numeroDeLineas) {
        Poligono poligono = new Poligono(numeroDeLineas, codIdentificador, nombre, color, numeroDeLineas);
        return listaPoligonos.add(poligono);

    }

    public Poligono buscar(String color) {
        for (Poligono poligono : listaPoligonos) {
            if (poligono.getColor().equals(color)) {
                return poligono;
            }
        }
        return null;
    }

    public boolean actualizar(int codIdentificador, String nombre, String color,
            String colorNuevo, int numeroDeLineas) {
        Poligono poligono = this.buscar(color);

        if (poligono != null) {
            int posicion = listaPoligonos.indexOf(poligono);

            poligono.setCodIdentificacion(codIdentificador);
            poligono.setNombre(nombre);
            poligono.setColor(colorNuevo);
            poligono.setNumeroDeLineas(numeroDeLineas);

            return true;
        }
        return false;
    }

    public boolean eliminar(String color) {
        Poligono poligono = this.buscar(color);

        if (poligono != null) {
            return listaPoligonos.remove(poligono);
        }
        return false;
    }

    public List<Poligono> getListaPoligonos() {
        return listaPoligonos;
    }

    public void setListaPoligonos(List<Poligono> listaPoligonos) {
        this.listaPoligonos = listaPoligonos;
    }

    public Poligono getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Poligono seleccionado) {
        this.seleccionado = seleccionado;
    }

}
