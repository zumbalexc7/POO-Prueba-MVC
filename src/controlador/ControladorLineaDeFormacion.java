/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.LineaDeFormacion;

/**
 *
 * @author Alex Zumba
 */
public class ControladorLineaDeFormacion {
    
    private List<LineaDeFormacion> listaLineaDeFormacion;
    private LineaDeFormacion  seleccionado;

    public ControladorLineaDeFormacion () {
        listaLineaDeFormacion = new ArrayList<>();
        seleccionado = null;
    }

    public long generarId() {
        return (listaLineaDeFormacion.size() > 0) ? listaLineaDeFormacion.get(listaLineaDeFormacion.size() - 1).getId() + 1 : 1;
    }

    public boolean crear(double iniciocoordenadaX, double iniciocoordenadaY,
            double finCoordenadaX, double finCoordenadaY, double longitud, String color) {
        LineaDeFormacion linea = new LineaDeFormacion(this.generarId(), iniciocoordenadaX, iniciocoordenadaY, finCoordenadaX, 
                finCoordenadaY, longitud, color);
        return listaLineaDeFormacion.add(linea);

    }

    public LineaDeFormacion buscar(String color) {
        for (LineaDeFormacion linea : listaLineaDeFormacion) {
            if (linea.getColor().equals(color)) {
                return linea;
            }
        }
        return null;
    }

    public boolean actualizar(double iniciocoordenadaX, double iniciocoordenadaY,
            double finCoordenadaX, double finCoordenadaY, double longitud, 
            String color, String colorNuevo) {
        LineaDeFormacion linea = this.buscar(color);

        if (linea != null) {
            int posicion = listaLineaDeFormacion.indexOf(linea);
            linea.setIniciocoordenadaX(iniciocoordenadaX);
            linea.setIniciocoordenadaY(iniciocoordenadaY);
            linea.setFinCoordenadaX(finCoordenadaX);
            linea.setFinCoordenadaY(finCoordenadaY);
            linea.setColor(colorNuevo);

            return true;
        }
        return false;
    }

    public boolean eliminar(String color) {
        LineaDeFormacion linea = this.buscar(color);

        if (linea != null) {
            return listaLineaDeFormacion.remove(linea);
        }
        return false;
    }

    public List<LineaDeFormacion> getListaLineaDeFormacion() {
        return listaLineaDeFormacion;
    }

    public void setListaLineaDeFormacion(List<LineaDeFormacion> listaLineaDeFormacion) {
        this.listaLineaDeFormacion = listaLineaDeFormacion;
    }

    public LineaDeFormacion getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(LineaDeFormacion seleccionado) {
        this.seleccionado = seleccionado;
    }

   
}
