/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorJefeDeProyecto;
import java.util.Scanner;
import modelo.JefeDeProyecto;

/**
 *
 * @author Alex Zumba
 */
public class VistaJefeDeProyecto {

    private ControladorJefeDeProyecto controladorJefeDeProyecto;
    private Scanner entrada;

    public VistaJefeDeProyecto() {
        controladorJefeDeProyecto = new ControladorJefeDeProyecto();
        entrada = new Scanner(System.in);
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n+++++Jefes de Proyectos+++++");
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
        System.out.print("Ingrese la direccion: ");
        String direccion = entrada.next();
        System.out.print("Ingrese el telefono: ");
        String telefono = entrada.next();
        System.out.println("Resultado: " + controladorJefeDeProyecto.crear(nombre, codigo, direccion, telefono));
    }

    public JefeDeProyecto buscar() {
        System.out.print("Ingrese el codigo: ");
        String codigo = entrada.next();
        JefeDeProyecto proyecto = controladorJefeDeProyecto.buscar(codigo);
        controladorJefeDeProyecto.setSeleccionado(proyecto);
        System.out.println(proyecto);
        return proyecto;
    }

    public void actualizar() {
        JefeDeProyecto proyecto = buscar();

        System.out.print("Ingrese el nombre nuevo: ");
        String nombre = entrada.next();
        System.out.print("Ingrese el codigo nuevo: ");
        String codigo = entrada.next();
        System.out.print("Ingrese la direccion nuevo: ");
        String direccion = entrada.next();
        System.out.print("Ingrese el telefono nuevo: ");
        String telefono = entrada.next();
        System.out.println("Resultado: " + controladorJefeDeProyecto.actualizar(nombre, proyecto.getCodigo(), codigo, direccion, telefono));
    }

    public void eliminar() {
        JefeDeProyecto proyecto = buscar();

        if (proyecto != null) {

            System.out.println("Resultado: " + controladorJefeDeProyecto.eliminar(proyecto.getCodigo()));
        }

    }

    public void listar() {
        for (JefeDeProyecto proyecto : controladorJefeDeProyecto.getListaJefeDeProyecto()) {
            System.out.println(proyecto);

        }
    }

    public ControladorJefeDeProyecto getControladorJefeDeProyecto() {
        return controladorJefeDeProyecto;
    }

    public void setControladorJefeDeProyecto(ControladorJefeDeProyecto controladorJefeDeProyecto) {
        this.controladorJefeDeProyecto = controladorJefeDeProyecto;
    }

}
