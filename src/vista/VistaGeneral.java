/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Alex Zumba
 */
public class VistaGeneral {

    private Scanner entrada;
    private VistaProyecto vistaProyecto;
    private VistaPlano vistaPlano;
    private VistaJefeDeProyecto vistaJefeDeProyecto;
    private VistaFigura vistaFigura;
    private VistaPoligono vistaPoligono;
    private VistaLineaDeFormacion vistaLineaDeFormacion;

    public VistaGeneral() {
        vistaProyecto = new VistaProyecto();
        vistaPlano = new VistaPlano();
        vistaJefeDeProyecto = new VistaJefeDeProyecto();
        vistaFigura = new VistaFigura();
        vistaPoligono = new VistaPoligono();
        vistaLineaDeFormacion = new VistaLineaDeFormacion();
        entrada = new Scanner(System.in);

    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n***** MENU PRINCIPAL *****");
            System.out.println("1.- Proyectos");
            System.out.println("2.- Planos");
            System.out.println("3.- Jefe-Proyectos");
            System.out.println("4.- Figura");
            System.out.println("5.- Poligono");
            System.out.println("6.- linea-Formacion");
            System.out.println("7.- Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: vistaProyecto.menu();
                    break;
                case 2: vistaPlano.menu();
                    break;
                case 3: vistaJefeDeProyecto.menu();
                    break;
                case 4: vistaFigura.menu();
                    break;
                case 5: vistaPoligono.menu();
                    break;
                case 6: vistaLineaDeFormacion.menu();
                case 7:
                    System.out.println("\n******PROGRAMA FINALIZADO*****");
                    System.out.println("");
                    break;
            }
        } while (opcion < 7);
    }
}
