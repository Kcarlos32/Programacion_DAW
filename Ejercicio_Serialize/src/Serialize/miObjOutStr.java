/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serialize;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author carcas
 */
public class miObjOutStr extends ObjectOutputStream  {
    //Sobrescribimos el método que crea la cabecera
    @Override
    protected void writeStreamHeader() throws IOException{
        // No hacer nada.
    }

    public miObjOutStr () throws IOException{
        super();
    }
    public miObjOutStr (OutputStream out) throws IOException{
                super(out);
        }
}
