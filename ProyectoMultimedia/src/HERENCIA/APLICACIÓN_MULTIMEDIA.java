/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HERENCIA;

import java.util.Scanner;

/**
 *
 * @author carcas
 */
public class APLICACIÓN_MULTIMEDIA {

    public static void main(String[] args) throws Exception {
        Scanner tcl = new Scanner(System.in);

        LISTAMULTIMEDIA listaMultimedia = new LISTAMULTIMEDIA(10);

        format formato = null;
        int seleccionar;
        boolean falso = true;
        
        do{
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("································");
        System.out.println("--------------------------------");
        System.out.println("======= VIDEOCLUB  PEPE ========");
        System.out.println("--------------------------------");
        System.out.println("BIENVENIDO AL VIDEOCLUB PARIS DE VALENCIA: seleccione si quiere registrar una pelicula o disco");
        System.out.println("--------------------------------");
        System.out.println("1. PELICULA");
        System.out.println("2. DISCO");
        System.out.println("3. CERRAR");
        System.out.println("--------------------------------");
        System.out.println("································");
        seleccionar = tcl.nextInt();

        switch (seleccionar) {
            case 1:
                String tituloPel,
                 actrizPrincipal,
                 autorPel,
                 actorPrincipal,
                 duracionPel = "";
                
                System.out.println("--------------------------------");
                System.out.println("PELICULA");
                System.out.println("--------------------------------");
                tcl.nextLine();

                System.out.println("Introduzca el titulo de la pelicula:");
                tituloPel = tcl.nextLine();
                
                System.out.println("Introduzca el/la autor/a de la pelicula:");
                autorPel = tcl.nextLine();
                
                System.out.println("Introduzca la duracion de la pelicula:");
                duracionPel = tcl.nextLine();

                System.out.println("Escoja el formato de la pelicula");
                System.out.println("1. WAV");
                System.out.println("2. MP3");
                System.out.println("3. MIDI");
                System.out.println("4. AVI");
                System.out.println("5. MOV");
                System.out.println("6. MPG");
                System.out.println("7. CD AUDIO");
                System.out.println("8. DVD");
                int selecFormato = tcl.nextInt();
                switch (selecFormato) {
                    case 1:
                        formato = format.wav;
                        break;
                    case 2:
                        formato = format.mp3;
                        break;
                    case 3:
                        formato = format.midi;
                        break;
                    case 4:
                        formato = format.avi;
                        break;
                    case 5:
                        formato = format.mov;
                        break;
                    case 6:
                        formato = format.mpg;
                        break;
                    case 7:
                        formato = format.cdaudio;
                        break;
                    case 8:
                        formato = format.dvd;
                }
                tcl.nextLine();
                boolean erroneo;
                do {
                    
                    System.out.println("Introduzca el actor principal");
                    actorPrincipal = tcl.nextLine();
                    
                    System.out.println("Introduzca la actriz principal");
                    actrizPrincipal = tcl.nextLine();
                    erroneo = true;
                    try {
                    PELICULA p1 = new PELICULA(tituloPel, autorPel, formato, duracionPel, actorPrincipal, actrizPrincipal);
                    listaMultimedia.add(p1);
                    erroneo = false;
                    
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } while (erroneo);
                    System.out.println("Todo en orden, pelicula creada y añadida al listado");
                    System.out.println("--------------------------------");
                    System.out.println("································");
                    break;

                  case 2:
                String genero = "";
                String tituloDisco = "";
                String autorDisco = "";
                String duracionDisco = "";
                format formatoDisco = null;

                System.out.println("--------------------------------");
                System.out.println("DISCO");
                System.out.println("--------------------------------");
                tcl.nextLine();
                
                System.out.println("Introduzca el titulo del disco:  ");
                tituloDisco = tcl.nextLine();
                
                System.out.println("Introduzca el/la autor/a del disco");
                autorDisco = tcl.nextLine();

                System.out.println("Escoja el formato deel disco");
                System.out.println("1. WAV");
                System.out.println("2. MP3");
                System.out.println("3. MIDI");
                System.out.println("4. AVI");
                System.out.println("5. MOV");
                System.out.println("6. MPG");
                System.out.println("7. CD AUDIO");
                System.out.println("8. DVD");
                int selecFormato2 = tcl.nextInt();
                
                switch (selecFormato2) {
                    case 1:
                        formatoDisco = format.wav;
                        break;
                    case 2:
                        formatoDisco = format.mp3;
                        break;
                    case 3:
                        formatoDisco = format.midi;
                        break;
                    case 4:
                        formatoDisco = format.avi;
                        break;
                    case 5:
                        formatoDisco = format.mov;
                        break;
                    case 6:
                        formatoDisco = format.mpg;
                        break;
                    case 7:
                        formatoDisco = format.cdaudio;
                        break;
                    case 8:
                        formatoDisco = format.dvd;
                        break;
                }
                
                System.out.println("Introduzca la duracion del disco");
                duracionDisco = tcl.nextLine();
                
                System.out.println("Introduzca el genero del disco: ");
                genero = tcl.nextLine();

                DISCO d1 = new DISCO(tituloDisco, autorDisco, formatoDisco, duracionDisco, genero);
                
                listaMultimedia.add(d1);
                System.out.println("Todo en orden, disco creado");
                System.out.println("--------------------------------");
                System.out.println("································");
                break;
            case 3:
                System.out.println("--------------------------------");
                System.out.println("PROGRAMA ACABADO");
                System.out.println("--------------------------------");
                System.out.println("································");
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
                falso = false;
                break;

        }

    
        }while(falso);
    }
    }
