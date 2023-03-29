/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLI;

/**
 *
 * @author carcas
 */
public class CAMION extends poliCOCHECAMION {

    protected REMOLQUE remolque;

    public CAMION(String matricula) {
        super(matricula);
        this.remolque = null;
    }

    public void ponRemolque(REMOLQUE REMOLQUE) {
        this.remolque = REMOLQUE;
    }

    public void quitarRemolque() {
        this.remolque = null;
    }

    @Override
    public String toString() {
        return "CAMION{" + "remolque=" + remolque + '}';
    }

    public void acelerarCamion(int velocidad) throws DemasiadoRapidoException {
        if ((super.velocidad + velocidad) > 100 && this.remolque != null) {
            throw new DemasiadoRapidoException("Frena o quita el remolque.");

        }
    }
}
