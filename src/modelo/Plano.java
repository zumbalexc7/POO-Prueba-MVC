/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Alex Zumba
 */
public class Plano {

    private long id;
    private int numeroDeIdentificacion;
    private Date fechadeEntrega;
    private String arquitectos;
    private String dibujoPlanoGeneral;
    private int numeroDeFiguras;
    private List<Figura> figuras;

    public Plano() {
    }

    public Plano(long id, int numeroDeIdentificacion, Date fechadeEntrega,
            String arquitectos, String dibujoPlanoGeneral, int numeroDeFiguras) {
        this.id = id;
        this.numeroDeIdentificacion = numeroDeIdentificacion;
        this.fechadeEntrega = fechadeEntrega;
        this.arquitectos = arquitectos;
        this.dibujoPlanoGeneral = dibujoPlanoGeneral;
        this.numeroDeFiguras = numeroDeFiguras;
    }

    public Plano(long id, int numeroDeIdentificacion, Date fechadeEntrega,
            String arquitectos, String dibujoPlanoGeneral, int numeroDeFiguras,
            List<Figura> figuras) {
        this.id = id;
        this.numeroDeIdentificacion = numeroDeIdentificacion;
        this.fechadeEntrega = fechadeEntrega;
        this.arquitectos = arquitectos;
        this.dibujoPlanoGeneral = dibujoPlanoGeneral;
        this.numeroDeFiguras = numeroDeFiguras;
        this.figuras = figuras;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumeroDeIdentificacion() {
        return numeroDeIdentificacion;
    }

    public void setNumeroDeIdentificacion(int numeroDeIdentificacion) {
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }

    public Date getFechadeEntrega() {
        return fechadeEntrega;
    }

    public void setFechadeEntrega(Date fechadeEntrega) {
        this.fechadeEntrega = fechadeEntrega;
    }

    public String getArquitectos() {
        return arquitectos;
    }

    public void setArquitectos(String arquitectos) {
        this.arquitectos = arquitectos;
    }

    public String getDibujoPlanoGeneral() {
        return dibujoPlanoGeneral;
    }

    public void setDibujoPlanoGenera(String dibujoPlanoGenera) {
        this.dibujoPlanoGeneral = dibujoPlanoGenera;
    }

    public int getNumeroDeFiguras() {
        return numeroDeFiguras;
    }

    public void setNumeroDeFiguras(int numeroDeFiguras) {
        this.numeroDeFiguras = numeroDeFiguras;
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    @Override
    public String toString() {
        return "\nPlano:   " + "id: " + id + ", numeroDeIdentificacion: " + numeroDeIdentificacion
                + ", fechadeEntrga: " + fechadeEntrega + ", arquitectos: " + arquitectos
                + ", dibujoPlanoGenera: " + dibujoPlanoGeneral + ", numeroDeFiguras: " + numeroDeFiguras;
    }

}
