/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Proyecto;

/**
 *
 * @author Alex Zumba
 */
public class ControladorProyecto {

    private List<Proyecto> listaProyecto;
    private Proyecto seleccionado;

    public ControladorProyecto() {
        listaProyecto = new ArrayList<>();
        seleccionado = null;
    }

    public long generarId() {
        return (listaProyecto.size() > 0) ? listaProyecto.get(listaProyecto.size() - 1).getId() + 1 : 1;
    }

    public boolean crear(String nombre, String codigo) {
        Proyecto proyecto = new Proyecto(this.generarId(), nombre, codigo);
        return listaProyecto.add(proyecto);
    }

    public Proyecto buscar(String codigo) {
        for (Proyecto proyecto : listaProyecto) {
            if (proyecto.getCodigo().equals(codigo)) {
                return proyecto;
            }
        }
        return null;
    }

    public boolean actualizar(String nombre, String codigo, String codigoNuevo) {
        Proyecto proyecto = this.buscar(codigo);
        if (proyecto != null) {
            int posicion = listaProyecto.indexOf(proyecto);
            proyecto.setNombre(nombre);
            proyecto.setCodigo(codigoNuevo);
            listaProyecto.set(posicion, proyecto);
            return true;
        }
        return false;
    }

    public boolean eliminar(String codigo) {
        Proyecto proyecto = this.buscar(codigo);
        if (proyecto != null) {
            return listaProyecto.remove(proyecto);
        }
        return false;
    }

    public List<Proyecto> getListaProyecto() {
        return listaProyecto;
    }

    public void setListaProyecto(List<Proyecto> listaProyecto) {
        this.listaProyecto = listaProyecto;
    }

    public Proyecto getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Proyecto seleccionado) {
        this.seleccionado = seleccionado;
    }

}
