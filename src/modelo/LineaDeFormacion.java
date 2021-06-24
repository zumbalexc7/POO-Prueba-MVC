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
public class LineaDeFormacion {

    private long id;
    private double iniciocoordenadaX;
    private double iniciocoordenadaY;
    private double finCoordenadaX;
    private double finCoordenadaY;
    private double longitud;
    private String color;

    public LineaDeFormacion() {
    }

    public LineaDeFormacion(long id, double iniciocoordenadaX, double iniciocoordenadaY,
            double finCoordenadaX, double finCoordenadaY, double longitud, String color) {
        this.id = id;
        this.iniciocoordenadaX = iniciocoordenadaX;
        this.iniciocoordenadaY = iniciocoordenadaY;
        this.finCoordenadaX = finCoordenadaX;
        this.finCoordenadaY = finCoordenadaY;
        this.longitud = longitud;
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getIniciocoordenadaX() {
        return iniciocoordenadaX;
    }

    public void setIniciocoordenadaX(double iniciocoordenadaX) {
        this.iniciocoordenadaX = iniciocoordenadaX;
    }

    public double getIniciocoordenadaY() {
        return iniciocoordenadaY;
    }

    public void setIniciocoordenadaY(double iniciocoordenadaY) {
        this.iniciocoordenadaY = iniciocoordenadaY;
    }

    public double getFinCoordenadaX() {
        return finCoordenadaX;
    }

    public void setFinCoordenadaX(double finCoordenadaX) {
        this.finCoordenadaX = finCoordenadaX;
    }

    public double getFinCoordenadaY() {
        return finCoordenadaY;
    }

    public void setFinCoordenadaY(double finCoordenadaY) {
        this.finCoordenadaY = finCoordenadaY;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    

    @Override
    public String toString() {
        return "\nLineaDeFormacion:   " + "id: " + id + ", iniciocoordenadaX: " + iniciocoordenadaX
                + "\n iniciocoordenadaY: " + iniciocoordenadaY + ", finCoordenadaX: " + finCoordenadaX
                + "\n finCoordenadaY: " + finCoordenadaY + ", longitud: " + longitud + ", color: " + color;
    }

}
