/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorPoligono;
import java.util.Scanner;
import modelo.Poligono;

/**
 *
 * @author Alex Zumba
 */
public class VistaPoligono {

    private ControladorPoligono controladorPoligono;
    private Scanner entrada;

    public VistaPoligono() {
        controladorPoligono = new ControladorPoligono();
        entrada = new Scanner(System.in);
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n+++++Gestion de Poligonos+++++");
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
        System.out.print("Ingrese el numero de lineas: ");
        int numLineas = entrada.nextInt();

        System.out.println("Resultado: " + controladorPoligono.crear(codigo, nombre, color, numLineas));
    }

    public Poligono buscar() {
        System.out.print("Ingrese el color: ");
        String color = entrada.next();
        Poligono poligono = controladorPoligono.buscar(color);
        controladorPoligono.setSeleccionado(poligono);
        System.out.println(poligono);
        return poligono;
    }

    public void actualizar() {
        Poligono poligono = buscar();

        System.out.print("Ingrese el codigo nuevo: ");
        int codigo = entrada.nextInt();
        System.out.print("Ingrese el nombre nuevo: ");
        String nombre = entrada.next();
        System.out.print("Ingrese la color nuevo: ");
        String colorNuevo = entrada.next();
        System.out.print("Ingrese el nuevo numero de lineas: ");
        int numLineas = entrada.nextInt();

        System.out.println("Resultado: " + controladorPoligono.actualizar(codigo, nombre, poligono.getColor(), colorNuevo, numLineas));
    }

    public void eliminar() {
        Poligono poligono = buscar();

        if (poligono != null) {

            System.out.println("Resultado: " + controladorPoligono.eliminar(poligono.getColor()));
        }

    }

    public void listar() {
        for (Poligono poligono : controladorPoligono.getListaPoligonos()) {
            System.out.println(poligono);

        }
    }

    public ControladorPoligono getControladorPoligono() {
        return controladorPoligono;
    }

    public void setControladorPoligono(ControladorPoligono controladorPoligono) {
        this.controladorPoligono = controladorPoligono;
    }

}
