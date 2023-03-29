/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author carcas
 */
public class Ejercicio_5 {
    public static String contarUltimaLetra (String cadena, String ultCar){
    int cont = 0;

        for (int i = 0; i < cadena.length(); i++) {
            int indice = cadena.indexOf(ultCar, i);
            if (indice != -1) {
                cont++;
                i = indice;
            }
        }
        String con2 = String.valueOf(cont);
        cadena = con2;
        return cadena;
    }
    public static void main(String[] args) {
        String cadena = "En un lugar de la mancha, de cuyo nombre no puedo acordarme";
        String subCadena = "o ";
        System.out.println("La sub cadena se repite "+contarUltimaLetra(cadena,subCadena)+" veces");
}
}
