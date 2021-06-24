/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Plano;

/**
 *
 * @author Alex Zumba
 */
public class ControladorPlano {

    private List<Plano> listaPlanos;
    private Plano seleccionado;

    public ControladorPlano() {
        listaPlanos = new ArrayList<>();
        seleccionado = null;
    }

    public long generarId() {
        return (listaPlanos.size() > 0) ? listaPlanos.get(listaPlanos.size() - 1).getId() + 1 : 1;
    }

    public boolean crear(int numeroDeIdentificacion, Date fechadeEntrega, String arquitectos,
            String dibujoPlanoGeneral, int numeroDeFiguras) {
        Plano plano = new Plano(this.generarId(), numeroDeIdentificacion, fechadeEntrega, arquitectos,
                dibujoPlanoGeneral, numeroDeFiguras);
        return listaPlanos.add(plano);

    }

    public Plano buscar(String dibujoPlanoGenera) {
        for (Plano plano : listaPlanos) {
            if (plano.getDibujoPlanoGeneral().equals(dibujoPlanoGenera)) {
                return plano;
            }
        }
        return null;
    }

    public boolean actualizar(int numeroDeIdentificacion, Date fechaDeEntrega, String arquitectos,
            String dibujoPlanoGeneral, String NuevoDibujoPlano, int numeroDeFiguras) {
        Plano plano = this.buscar(dibujoPlanoGeneral);
        if (plano != null) {
            int posicion = listaPlanos.indexOf(plano);
            plano.setNumeroDeIdentificacion(numeroDeIdentificacion);
            plano.setFechadeEntrega(fechaDeEntrega);
            plano.setArquitectos(arquitectos);
            plano.setDibujoPlanoGenera(NuevoDibujoPlano);
            plano.setNumeroDeFiguras(numeroDeFiguras);
            listaPlanos.set(posicion, plano);

            return true;
        }
        return false;
    }

    public boolean eliminar(String dibujoPlanoGeneral) {
        Plano plano = this.buscar(dibujoPlanoGeneral);
        if (plano != null) {
            return listaPlanos.remove(plano);
        }
        return false;
    }

    public List<Plano> getListaPlanos() {
        return listaPlanos;
    }

    public void setListaPlanos(List<Plano> listaPlanos) {
        this.listaPlanos = listaPlanos;
    }

    public Plano getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Plano seleccionado) {
        this.seleccionado = seleccionado;
    }

}
