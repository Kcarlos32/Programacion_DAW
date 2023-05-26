/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_acronimos;

/**
 *
 * @author carcas
 */
public class Acronimo_Mejora {

    public String obtenerAcronimoM(String cadena) throws Exception {
        String resultado = "";
        char caracter;
        if (cadena == null) {
            throw (new Exception("ERROR, El valor introducido es nulo"
            ));
        }
        int n = cadena.length();
        for (int i = 0; i < n; i++) {
            caracter = cadena.charAt(i);
            if (caracter != ' ') {
                if (i == 0) {
                    resultado = resultado + caracter + '.';
                } else {
                    if (cadena.charAt(i - 1) == ' ' && cadena.charAt(i) != 'Z') {
                        resultado = resultado + caracter + '.';
                    } else if (cadena.charAt(i - 1) == ' ' && cadena.charAt(i) == 'Z') {
                        resultado = resultado + '*' + '.';
                    }
                }
            }
            if (caracter == 'j' && cadena.charAt(i - 1) == ' ' || caracter == 'p' && cadena.charAt(i - 1) == ' ') {
                break;
            }

        }
        return resultado;
    }
    public static void main(String[] args) {
        Acronimos r = new Acronimos();
        String p = "2423 Pep Joj ZarandZnZa Ooja";
        try {
            System.out.println(r.obtenerAcronimo(p));
        } catch (Exception e) {
            System.out.println("ERROR, El valor introducido es nulo");
        }
    }
}
