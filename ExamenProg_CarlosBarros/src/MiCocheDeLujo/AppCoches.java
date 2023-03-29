/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiCocheDeLujo;

/**
 *
 * @author carcas
 */
public class AppCoches {
    public static void main(String[] args) {
        Vehiculo coche1 = new Vehiculo();
        Vehiculo coche2 = new Vehiculo();
        Vehiculo coche3 = new Vehiculo();
        Vehiculo coche4= new Vehiculo();
        
        Conductor conductor1 = new Conductor("Pepe","Viyuela Romero","Range Rover G5");
        Conductor conductor2 = new Conductor("Antonio","Garcia Gomez","AudiA8");
        
        coche1.setTipoVe("Mercedes Clase A");
        coche1.setNumBas("7564 KYS");
        coche1.setNumVeAlq(4);
        coche1.setNumVeTipo(5);
        
        coche2.setVehiculo("Audi A9", "2354 YHF", 3, 1);
        coche3.setVehiculo("Bugatti Beyron", "3089 LOL", 1, 3);
        coche4.setVehiculo("Range Rover", "4567 ERT", 3, 5);
        
        conductor1.setNombre("Antonio");
        conductor1.setApellidos("Revilla Roviera");
        conductor1.setVehiculoAlq(coche1.getTipoVe());
        
        conductor2.setConductor("Carlos Miguel", "Barros Castelló", coche2.getTipoVe());
        
        coche1.alquilar();
        coche2.alquilar();
        coche3.devolver();
        coche4.devolver();
        
        System.out.println("-------------------------------------------------");
        System.out.println(conductor1.toString()+coche1.toString());
        System.out.println(conductor2.toString()+coche2.toString());
        System.out.println("-------------------------------------------------");
        
    }
}
