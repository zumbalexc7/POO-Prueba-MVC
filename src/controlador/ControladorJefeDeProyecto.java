/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.JefeDeProyecto;

/**
 *
 * @author Alex Zumba
 */
public class ControladorJefeDeProyecto {

    private List<JefeDeProyecto> listaJefeDeProyecto;
    private JefeDeProyecto seleccionado;

    public ControladorJefeDeProyecto() {
        listaJefeDeProyecto = new ArrayList<>();
        seleccionado = null;
    }

    public long generarId() {
        return (listaJefeDeProyecto.size() > 0) ? listaJefeDeProyecto.get(listaJefeDeProyecto.size() - 1).getId() + 1 : 1;
    }

    public boolean crear(String nombre, String codigo, String direccion, String telefono) {
        JefeDeProyecto jefeProyecto = new JefeDeProyecto(this.generarId(), nombre, codigo, direccion, telefono);
        return listaJefeDeProyecto.add(jefeProyecto);

    }

    public JefeDeProyecto buscar(String codigo) {
        for (JefeDeProyecto jefeProyecto : listaJefeDeProyecto) {
            if (jefeProyecto.getCodigo().equals(codigo)) {
                return jefeProyecto;
            }
        }
        return null;
    }

    public boolean actualizar(String nombre, String codigo, String codigoNuevo, String direccion, String telefono) {
        JefeDeProyecto jefeProyecto = this.buscar(codigo);

        if (jefeProyecto != null) {
            int posicion = listaJefeDeProyecto.indexOf(jefeProyecto);
            jefeProyecto.setNombre(nombre);
            jefeProyecto.setCodigo(codigoNuevo);
            jefeProyecto.setDireccion(direccion);
            jefeProyecto.setTelefono(telefono);
            listaJefeDeProyecto.set(posicion, jefeProyecto);

            return true;
        }
        return false;
    }

    public boolean eliminar(String codigo) {
        JefeDeProyecto jefeProyecto = this.buscar(codigo);
        if (jefeProyecto != null) {
            return listaJefeDeProyecto.remove(jefeProyecto);
        }
        return false;
    }

    public List<JefeDeProyecto> getListaJefeDeProyecto() {
        return listaJefeDeProyecto;
    }

    public void setListaJefeDeProyecto(List<JefeDeProyecto> listaJefeDeProyecto) {
        this.listaJefeDeProyecto = listaJefeDeProyecto;
    }

    public JefeDeProyecto getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(JefeDeProyecto seleccionado) {
        this.seleccionado = seleccionado;
    }

}
