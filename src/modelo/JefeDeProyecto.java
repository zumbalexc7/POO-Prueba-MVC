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
public class JefeDeProyecto {

    private long id;
    private String nombre;
    private String codigo;
    private String direccion;
    private String telefono;

    public JefeDeProyecto() {
    }

    public JefeDeProyecto(long id, String nombre, String codigo,
            String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\nJefeDeProyecto:   " + "id: " + id + ", nombre: " + nombre 
                + "\n codigo: " + codigo + ", direccion: " + direccion 
                + "\n telefono: " + telefono;
    }

}
