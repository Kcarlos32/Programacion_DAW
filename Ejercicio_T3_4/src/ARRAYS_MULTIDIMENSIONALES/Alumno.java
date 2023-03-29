/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARRAYS_MULTIDIMENSIONALES;

/**
 *
 * @author carcas
 */
public class Alumno {

    int numPersonal;
    String apellido1, apellido2, nombre;
    int numAs;
    double[] notasFin;
    double notaMedFin;
    double copia[][];

    public Alumno(int numPer, String ap1, String ap2, String nom, int numAsig) {
        numPersonal = numPer;
        apellido1 = ap1;
        apellido2 = ap2;
        nombre = nom;
        numAs = numAsig;
        notasFin = new double[numAs];
    }

    public Alumno(int numPer, String ap1, String ap2, String nom, int numAsig, double[] notasF, double nmf) {
        numPersonal = numPer;
        apellido1 = ap1;
        apellido2 = ap2;
        nombre = nom;
        numAs = numAsig;
        notasFin = notasF;
        notaMedFin = nmf;
    }
    
    public String toString() {
        String resul;
        resul = "NumPers: " + numPersonal + "\n"
                + " Nombre: " + nombre
                + " Primer apellido: " + apellido1
                + " Segundo apellido: " + apellido2 + "\n"
                + " Nota Media Final: " + notaMedFin + "\n";
        return resul;
    }

    public double obtenerNotaMediaFinal() {
        return notaMedFin;
    }

    public void asignarNotas(double matriz[][]) {
        double suma = 0;
        copia = new double[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == 0) {
                    copia[j][i] = matriz[j][i] * 0.60;
                } else {
                    copia[j][i] = matriz[j][i] * 0.4;
                }
            }
            notasFin[i] = suma;
            suma = 0;
        }

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma += copia[j][i];
            }
            notasFin[i] = suma;
            suma = 0;
        }
        for (int i = 0; i < notasFin.length; i++) {
            suma += notasFin[i];
        }
        notaMedFin = suma / matriz[0].length;
    }

    public boolean pasaDeCurso() {
        boolean mediaAprobada = false;
        boolean notasAprobadas = false;
        int cont = 0;
        if (notaMedFin >= 5) {
            mediaAprobada = true;
        }
        for (int i = 0; i < notasFin.length; i++) {
            if (notasFin[i] < 5) {
                cont++;
            }
        }
        if (cont < 3) {
            notasAprobadas = true;
        }
        if (notasAprobadas && mediaAprobada) {
            return true;
        } else 
            return false;
    }
}