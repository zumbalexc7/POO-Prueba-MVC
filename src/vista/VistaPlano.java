/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorPlano;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import modelo.Plano;

/**
 *
 * @author Alex Zumba
 */
public class VistaPlano {

    private ControladorPlano controladorPlano;
    private Scanner entrada;
    private DateFormat formatoFecha;

    public VistaPlano() {
        controladorPlano = new ControladorPlano();
        entrada = new Scanner(System.in);
        formatoFecha = new SimpleDateFormat("dd/mm/yy");
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n+++++Gestion de Planos+++++");
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
        System.out.print("Ingrese el numero de identificacion: ");
        int numeroDeIdentificacion = entrada.nextInt();
        System.out.print("Ingrese la fecha de entrega (dd/mm/yy): ");
        String fechaDeEntrega = entrada.next();
        System.out.print("Ingrese el arquitecto: ");
        String arquitectos = entrada.next();
        System.out.print("Ingrese el dibujo del plano: ");
        String dibujoPlanoGeneral = entrada.next();
        System.out.print("Ingrese el numero de figuras: ");
        int numeroDeFiguras = entrada.nextInt();
        try {
            System.out.println("Resultado: " + controladorPlano.crear(numeroDeIdentificacion, formatoFecha.parse(fechaDeEntrega), arquitectos, dibujoPlanoGeneral, numeroDeFiguras));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Plano buscar() {
        System.out.print("Ingrese el dibujo del plano: ");
        String dibujo = entrada.next();
        Plano plano = controladorPlano.buscar(dibujo);
        controladorPlano.setSeleccionado(plano);
        System.out.println(plano);
        return plano;
    }

    public void actualizar() {
        Plano plano = buscar();

        System.out.print("Ingrese el nuevo numero de identificacion: ");
        int numero = entrada.nextInt();
        System.out.print("Ingrese la nueva fecha de entrega (dd/mm/yy): ");
        String fecha = entrada.next();
        System.out.print("Ingrese el nuevo arquitecto: ");
        String arquitecto = entrada.next();
        System.out.print("Ingrese el nuevo dibujo del plano: ");
        String dibujo = entrada.next();
        System.out.print("Ingrese el nuevo numero de figuras: ");
        int figuras = entrada.nextInt();

        try {
            System.out.println("Resultado: " + controladorPlano.actualizar(numero, formatoFecha.parse(fecha), arquitecto, plano.getDibujoPlanoGeneral(), dibujo, figuras));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void eliminar() {
        Plano plano = buscar();

        if (plano != null) {

            System.out.println("Resultado: " + controladorPlano.eliminar(plano.getDibujoPlanoGeneral()));
        }

    }

    public void listar() {
        for (Plano plano : controladorPlano.getListaPlanos()) {
            System.out.println(plano);

        }
    }

    public ControladorPlano getControladorPlano() {
        return controladorPlano;
    }

    public void setControladorPlano(ControladorPlano controladorPlano) {
        this.controladorPlano = controladorPlano;
    }

}
