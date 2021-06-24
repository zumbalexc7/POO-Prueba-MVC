/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorProyecto;
import java.util.Scanner;
import modelo.Proyecto;

/**
 *
 * @author Alex Zumba
 */
public class VistaProyecto {

    private ControladorProyecto controladorProyecto;
    private Scanner entrada;

    public VistaProyecto() {
        controladorProyecto = new ControladorProyecto();
        entrada = new Scanner(System.in);
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n+++++Gestion de Proyectos+++++");
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
        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.next();
        System.out.print("Ingrese el codigo: ");
        String codigo = entrada.next();
        System.out.println("Resultado: " + controladorProyecto.crear(nombre, codigo));
    }

    public Proyecto buscar() {
        System.out.print("Ingrese el codigo: ");
        String codigo = entrada.next();
        Proyecto proyecto = controladorProyecto.buscar(codigo);
        controladorProyecto.setSeleccionado(proyecto);
        System.out.println(proyecto);
        return proyecto;
    }

    public void actualizar() {
        Proyecto proyecto = buscar();

        System.out.print("Ingrese el nombre nuevo: ");
        String nombre = entrada.next();
        System.out.print("Ingrese el codigo nuevo: ");
        String codigo = entrada.next();
        System.out.println("Resultado: " + controladorProyecto.actualizar(nombre, proyecto.getCodigo(), codigo));
    }

    public void eliminar() {
        Proyecto proyecto = buscar();

        if (proyecto != null) {

            System.out.println("Resultado: " + controladorProyecto.eliminar(proyecto.getCodigo()));
        }

    }

    public void listar() {
        for (Proyecto proyecto : controladorProyecto.getListaProyecto()) {
            System.out.println(proyecto);

        }
    }

    public ControladorProyecto getControladorProyecto() {
        return controladorProyecto;
    }

    public void setControladorProyecto(ControladorProyecto controladorProyecto) {
        this.controladorProyecto = controladorProyecto;
    }

}
