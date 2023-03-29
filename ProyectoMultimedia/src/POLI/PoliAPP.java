/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLI;

/**
 *
 * @author carcas
 */
import java.util.ArrayList;

public class PoliAPP {
    public static void main(String[] args) throws DemasiadoRapidoException {


        ArrayList<poliCOCHECAMION> arrayVehiculos = new ArrayList(4);

        CAMION camion1 = new CAMION("1234-ABC");
        CAMION camion2 = new CAMION("9353-DHF");
        COCHE coche1 = new COCHE(3, "4143-FYM");
        COCHE coche2 = new COCHE(3, "6724-ADA");
        arrayVehiculos.add(camion1);
        arrayVehiculos.add(camion2);
        arrayVehiculos.add(coche1);
        arrayVehiculos.add(coche2);
        REMOLQUE generalRemolque = new REMOLQUE(5000);

        for (int i = 0; i < arrayVehiculos.size(); i++) {
            if (arrayVehiculos.get(i) instanceof CAMION) {
                ((CAMION) (arrayVehiculos.get(i))).ponRemolque(generalRemolque);

            }
            arrayVehiculos.get(i).acelerar(60);
            System.out.println("Vehículo: " + i + ",   " + arrayVehiculos.get(i).toString());
        }
        camion1.acelerarCamion(60);
        System.out.println(camion1.toString());


    }
}