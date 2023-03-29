/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HERENCIA;

/**
 *
 * @author carcas
 */
public class Polimorfismo {

    public static void main(String[] args) throws Exception {
        LISTAMULTIMEDIA ListaMultim = new LISTAMULTIMEDIA(10);

        DISCO d1 = new DISCO("Beep boop", "Moros Pepe", format.mp3, "120", "Porro");
        DISCO d2 = new DISCO("Hippity Hoppy", "Las pacas", format.dvd, "45", "Hip-Hop");
        DISCO d3 = new DISCO("Tolais", "Jose Juan", format.midi, "130", "Jazz");
        ListaMultim.add(d1);
        ListaMultim.add(d2);
        ListaMultim.add(d3);

        PELICULA p1 = new PELICULA("Los miserables", "Gabacho1", format.wav, "120", "Gabacho2", "Gabacha1");
        PELICULA p2 = new PELICULA("Madagascar", "Antonio Banderas", format.wav, "130", "Jose", "La pepes");
        PELICULA p3 = new PELICULA("Roberto Climente", "Robi", format.wav, "320", "Robierto", "");
        ListaMultim.add(p1);
        ListaMultim.add(p2);
        ListaMultim.add(p3);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("································");
        System.out.println("--------------------------------");
        System.out.println(ListaMultim.toString());

        int total = 0;
        for (int i = 0; i < ListaMultim.size(); i++) {
            total += Integer.parseInt(ListaMultim.get(i).getDuracion());

        }
        System.out.println("Minutos totales de la lista:  " + total);

        int contadorSinActriz = 0;
        for (int i = 0; i < ListaMultim.size(); i++) {
            contadorSinActriz++;
        }
        int totalRock = 0;
        for (int i = 0; i < ListaMultim.size(); i++) {
            if (ListaMultim.get(i) instanceof DISCO) {
                if (((DISCO) (ListaMultim.get(i))).getGenero().equalsIgnoreCase("Rock")) {//
                    totalRock++;
                }
                System.out.println("Hay un total de " + totalRock + " discos del género Rock.");
            }
        }
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

       
    }
}