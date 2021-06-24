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
public class Proyecto {

    private long id;
    private String nombre;
    private String codigo;
    private JefeDeProyecto jefeDeProyecto;
    private List<Plano> planos;

    public Proyecto() {
    }

    public Proyecto(long id, String nombre, String codigo) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Proyecto(long id, String nombre, String codigo, 
            JefeDeProyecto jefeDeProyecto) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.jefeDeProyecto = jefeDeProyecto;
    }

    public Proyecto(long id, String nombre, String codigo, 
            JefeDeProyecto jefeDeProyecto, List<Plano> planos) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.jefeDeProyecto = jefeDeProyecto;
        this.planos = planos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public JefeDeProyecto getJefeDeProyecto() {
        return jefeDeProyecto;
    }

    public void setJefeDeProyecto(JefeDeProyecto jefeDeProyecto) {
        this.jefeDeProyecto = jefeDeProyecto;
    }

    public List<Plano> getPlanos() {
        return planos;
    }

    public void setPlanos(List<Plano> planos) {
        this.planos = planos;
    }

    @Override
    public String toString() {
        return "\nProyecto: " + "id: " + id + ", nombre: " + nombre + ", codigo: " + codigo;
    }

}
