/*
 * 2.- Desarrollar un sistema de gestión de pacientes:
Tendremos un archivador dónde iremos guardando todas las fichas de los pacientes. 
* Las fichas contienen la siguiente información: nombre, apellidos y edad.
Todas las fichas que vayamos creando, se podrán guardar o eliminar del archivador. 
* Al archivador también le podremos pedir un listado. 
* Este listado consistirá en visualizar por pantalla el número de fichas guardadas, 
* así como el contenido de las fichas.
La clase GestionPacientes tiene un método main en el que se crea un archivador, 
* dos o tres fichas que se guardarán en el archivador, se listará el contenido, 
* se eliminará alguna ficha y se volverá a listar su contenido.
Todas las clases se guardarán en el paquete gestionpacientes

 */
package gestionpacientes;

import java.io.*;

public class GestionPacientes {

    public static void main(String[] args) {
        Archivador a = new Archivador();
        
         ObjectInputStream ist;
        try {
            ist = new ObjectInputStream(new BufferedInputStream(new FileInputStream("archi.dat")));
            a = (Archivador) ist.readObject();
            ist.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }     
        
        Ficha f = new Ficha("Pepe", "Lopez", 22);

        a.guardar(f);
        a.guardar(new Ficha("Teresa", "Argente", 12));
        a.guardar(new Ficha("Edudardo", "Boscá", 34));
        a.listar();
        a.eliminar(f);
        a.listar();
        a.eliminar("Teresa");
        a.listar();
        
        ObjectOutputStream ost;
        try {
            ost = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("multi.dat")));
            ost.writeObject(a);
            ost.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
