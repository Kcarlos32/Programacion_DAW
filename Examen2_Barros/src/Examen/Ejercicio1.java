/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import java.util.Scanner;

/**
 *
 * @author carcas
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int seleccionar;
        Personas estu = new Personas();
        Personas prof = new Personas();

        Estudiante e1 = new Estudiante("Pepe", "Calle Orihuela n1", "IES Serpis", 9.3);
        Estudiante e2 = new Estudiante("Josepa", "Calle Honduras n132", "IES Maria Enriquez", 5);
        Estudiante e3 = new Estudiante("Anton", "Avenida Donete n25", "IES Esparragos", 3.4);
        EstudianteInternacional eI1 = new EstudianteInternacional("Josefra", "Calle Mathousen n5", "IES Yolanda", 7, "Irlanda");
        EstudianteInternacional eI2 = new EstudianteInternacional("Roberto", "Plaza Rotionda n89", "IES Tomate", 5.6, "Malta");
        Profesor p1 = new Profesor("Nacho", "Plaza Honduras", "Biologia");
        Profesor p2 = new Profesor("Kiko", "Calle Ueliuo", "Mates");
        Profesor p3 = new Profesor("Toni", "Avenida Potingue", "Programación");

        estu.anadir(e1);
        estu.anadir(e2);
        estu.anadir(e3);
        estu.anadir(eI1);
        estu.anadir(eI2);
        prof.anadir(p1);
        prof.anadir(p2);
        prof.anadir(p3);

        do {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("································");
            System.out.println("======= PROGRAMA ESCUELA =======");
            System.out.println("1. Listado de personas");
            System.out.println("2. Borrar estudiante");
            System.out.println("3. Modificar asignatura del Profesor");
            System.out.println("4. Modificar el país del estudiante internacional");
            System.out.println("5. Listado de profesores con su nombre y asignatura");
            System.out.println("6. Borrar listado");
            System.out.println("0. Salir");
            System.out.println("································");
            System.out.print("Selecciona una opción:");
            seleccionar = tcl.nextInt();
            System.out.println("································");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

            if (seleccionar > 6 || seleccionar < 0) {
                System.out.println("Numero introducido incorrecto, vuelve a introducir.");
            }

            switch (seleccionar) {
                case 1:
                    System.out.println("--------------------------------\nListar personas\n--------------------------------");
                    estu.ListadoPersonas();
                    break;
                case 2:
                    System.out.println("--------------------------------\nBorrar estudiante\n--------------------------------");
                    estu.borrarEst();
                    break;
                case 3:
                    System.out.println("--------------------------------\nModificar asignatura profesor\n--------------------------------");
                    int pos = Personas.totalPersonas.indexOf(Personas.buscarPer());

                    System.out.print("Introduce el nuevo país : ");
                    String nAsig = tcl.nextLine();
                    //Personas.totalPersonas.get(pos).setAsignatura(nAsig);

                    break;
                case 4:
                    System.out.println("--------------------------------\nModificar país estudiante internacional\n--------------------------------");
                    //Persona aux = new Persona();
                    int posicion = Personas.totalPersonas.indexOf(Personas.buscarPer());

                    System.out.print("Introduce el nuevo país : ");
                    String nPais = tcl.nextLine();
                    //aux.get(posicion).setPais(nPais);

                    break;
                case 5:
                    System.out.println("--------------------------------\nListar Profesores\n--------------------------------");
                    prof.ListadoProf();
                    break;
                case 6:
                    System.out.println("--------------------------------\nBorrar Listado\n--------------------------------");
                    boolean borrar = true;
                    do {
                        System.out.println("Estas seguro de que quieres continuar? \n(1) SI (2) NO");
                        Byte eleccion = tcl.nextByte();
                        if (eleccion == 1) {
                            estu.borrarTodo();
                            borrar = false;
                            System.out.println("Operación completada");
                        } else if (eleccion == 2) {
                            System.out.println("Operación cancelada");
                            borrar = false;
                        } else {
                            System.out.println("El numero introducido es incorrecto");
                        }
                    } while (borrar);
                    break;
            }
        } while (seleccionar != 0);
    }
}
