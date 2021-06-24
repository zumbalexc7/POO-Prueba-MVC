/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorFigura;
import java.util.Scanner;
import modelo.Figura;

/**
 *
 * @author Alex Zumba
 */
public class VistaFigura {

    private ControladorFigura controladorFigura;
    private Scanner entrada;

    public VistaFigura() {
        controladorFigura = new ControladorFigura();
        entrada = new Scanner(System.in);
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n+++++Gestion de Figuras+++++");
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
        System.out.print("Ingrese el codigo: ");
        int codigo = entrada.nextInt();
        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.next();
        System.out.print("Ingrese la color: ");
        String color = entrada.next();

        System.out.println("Resultado: " + controladorFigura.crear(codigo, nombre, color));
    }

    public Figura buscar() {
        System.out.print("Ingrese el color: ");
        String color = entrada.next();
        Figura figura = controladorFigura.buscar(color);
        controladorFigura.setSeleccionado(figura);
        System.out.println(figura);
        return figura;
    }

    public void actualizar() {
        Figura figura = buscar();

        System.out.print("Ingrese el codigo nuevo: ");
        int codigo = entrada.nextInt();
        System.out.print("Ingrese el nombre nuevo: ");
        String nombre = entrada.next();
        System.out.print("Ingrese la color nuevo: ");
        String colorNuevo = entrada.next();

        System.out.println("Resultado: " + controladorFigura.actualizar(codigo, nombre, figura.getColor(), colorNuevo));
    }

    public void eliminar() {
        Figura figura = buscar();

        if (figura != null) {

            System.out.println("Resultado: " + controladorFigura.eliminar(figura.getColor()));
        }

    }

    public void listar() {
        for (Figura figura : controladorFigura.getListaFiguras()) {
            System.out.println(figura);

        }
    }

    public ControladorFigura getControladorFigura() {
        return controladorFigura;
    }

    public void setControladorFigura(ControladorFigura controladorFigura) {
        this.controladorFigura = controladorFigura;
    }

}
