/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRACTICA_FICHEROS;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author carcas
 */
public class Alumno {
     private String carnet;
    private String nombre;
    private String apellidos;
    private double nota1;
    private double nota2;
    private double nota3;

    public Alumno(String carnet, String nombre, String apellidos, double nota1, double nota2, double nota3) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    @Override
    public String toString() {
        return "Carnet: " + carnet + ", Nombre: " + nombre + ", Apellidos: " + apellidos + ", Nota 1: " + nota1 + ", Nota 2: " + nota2 + ", Nota 3: " + nota3;
    }

    public static void ponerDatos(ArrayList<Alumno> lista) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el carnet del alumno:");
        String carnet = sc.nextLine();
        System.out.println("Introduce el nombre del alumno:");
        String nombre = sc.nextLine();
        System.out.println("Introduce los apellidos del alumno:");
        String apellidos = sc.nextLine();
        System.out.println("Introduce la nota 1 del alumno:");
        double nota1 = Double.parseDouble(sc.nextLine());
        System.out.println("Introduce la nota 2 del alumno:");
        double nota2 = Double.parseDouble(sc.nextLine());
        System.out.println("Introduce la nota 3 del alumno:");
        double nota3 = Double.parseDouble(sc.nextLine());
        Alumno alumno = new Alumno(carnet, nombre, apellidos, nota1, nota2, nota3);
        lista.add(alumno);
    }

    public static void llenarArchivo(ArrayList<Alumno> lista, String fichero) {
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(lista);
            System.out.println("Datos guardados correctamente en " + fichero);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos en " + fichero);
        }
    }

    public static ArrayList<Alumno> pasarALista(String fichero) {
        ArrayList<Alumno> lista = new ArrayList<>();
        try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            lista = (ArrayList<Alumno>) ois.readObject();
            System.out.println("Datos cargados correctamente de " + fichero);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos de " + fichero);
        }
        return lista;
    }

    public static void pasarFichero5(ArrayList<Alumno> lista, String fichero) {
        try ( PrintWriter pw = new PrintWriter(new FileWriter(fichero))) {
            for (Alumno alumno : lista) {
                if (alumno.calcularMedia() > 5) {
                    pw.println(alumno.getCarnet() + " " + alumno.calcularMedia());
                }
            }
            System.out.println("Datos guardados correctamente en " + fichero);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos en " + fichero);
        }
    }

    public static void visualizarFichero5(String fichero) {
        try ( BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero " + fichero);
        }
    }

}
