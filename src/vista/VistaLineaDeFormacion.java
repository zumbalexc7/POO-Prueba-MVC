/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorLineaDeFormacion;
import java.util.Scanner;
import modelo.LineaDeFormacion;

/**
 *
 * @author Alex Zumba
 */
public class VistaLineaDeFormacion {

    private ControladorLineaDeFormacion controladorLineaDeFormacion;
    private Scanner entrada;

    public VistaLineaDeFormacion() {
        controladorLineaDeFormacion = new ControladorLineaDeFormacion();
        entrada = new Scanner(System.in);
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n+++++Lineas de Formacion+++++");
            System.out.println("1.- Crear");
            System.out.println("2.- Buscar");
            System.out.println("3.- Actualizar");
            System.out.println("4.- Eliminar");
            System.out.println("5.- Listar");
            System.out.println("6.- Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: crear();
                    break;
                case 2: buscar();
                    break;
                case 3: actualizar();
                    break;
                case 4: eliminar(); 
                    break;
                case 5: listar();
                    break;
                case 6: System.out.println("-----Finalizado-----");
                    break;
            }
        } while (opcion < 6);
    }

    public void crear() {
        System.out.print("Ingrese el inicio de coordenada X: ");
        double inicioX = entrada.nextDouble();
        System.out.print("Ingrese inicio de coordenada Y: ");
        double inicioY = entrada.nextDouble();
        System.out.print("Ingrese fin de coordenada X: ");
        double finX = entrada.nextDouble();
        System.out.print("Ingrese fin de coordenada X: ");
        double finY = entrada.nextDouble();
        System.out.print("Ingrese la longitud: ");
        double longitud = entrada.nextDouble();
        System.out.print("Ingrese el color: ");
        String color = entrada.next();

        System.out.println("Resultado: " + controladorLineaDeFormacion.crear(inicioX, inicioY, finX, finY, longitud, color));
    }

    public LineaDeFormacion buscar() {
        System.out.print("Ingrese el color: ");
        String color = entrada.next();
        LineaDeFormacion lineaF = controladorLineaDeFormacion.buscar(color);
        controladorLineaDeFormacion.setSeleccionado(lineaF);
        System.out.println(lineaF);
        return lineaF;
    }

    public void actualizar() {
        LineaDeFormacion lineaF = buscar();

        System.out.print("Ingrese el nuevo inicio de coordenada X: ");
        double inicioX = entrada.nextDouble();
        System.out.print("Ingrese el nuevo inicio de coordenada Y: ");
        double inicioY = entrada.nextDouble();
        System.out.print("Ingrese el nuevo fin de coordenada X: ");
        double finX = entrada.nextDouble();
        System.out.print("Ingrese el nuevo fin de coordenada X: ");
        double finY = entrada.nextDouble();
        System.out.print("Ingrese la longitud nueva: ");
        double longitud = entrada.nextDouble();
        System.out.print("Ingrese el color nuevo: ");
        String color = entrada.next();

        System.out.println("Resultado: " + controladorLineaDeFormacion.actualizar(inicioX, inicioY, finX, finY, longitud, lineaF.getColor(), color));

    }

    public void eliminar() {
        LineaDeFormacion lineaF = buscar();

        if (lineaF != null) {

            System.out.println("Resultado: " + controladorLineaDeFormacion.eliminar(lineaF.getColor()));
        }

    }

    public void listar() {
        for (LineaDeFormacion lineaF : controladorLineaDeFormacion.getListaLineaDeFormacion()) {
            System.out.println(lineaF);

        }
    }

    public ControladorLineaDeFormacion getControladorLineaDeFormacion() {
        return controladorLineaDeFormacion;
    }

    public void setControladorLineaDeFormacion(ControladorLineaDeFormacion controladorLineaDeFormacion) {
        this.controladorLineaDeFormacion = controladorLineaDeFormacion;
    }

}
