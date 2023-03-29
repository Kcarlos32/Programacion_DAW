/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HERENCIA;

/**
 *
 * @author carcas
 */
public class PELICULA extends MULTIMEDIA{
    protected String actorPrincipal, actrizPrincipal;
    
    public PELICULA (String titulo, String autor, format formato, String duracion, String actorPrincipal, String actrizPrincipal) throws Exception{
        super (titulo, autor, formato, duracion);
        if((actorPrincipal == null && actrizPrincipal == null) || (actorPrincipal.isEmpty()  && actrizPrincipal.length() == 0)){
            throw new Exception("Datos incorrectos. Cuenta no creada");
        } else {
            this.actorPrincipal = actorPrincipal;
            this.actrizPrincipal = actrizPrincipal;
        }
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    @Override
    public String toString() {
        return "PELICULA{ " + "actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal + " }";
    }
}
