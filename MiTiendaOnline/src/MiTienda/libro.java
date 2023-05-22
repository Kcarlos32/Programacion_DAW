/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiTienda;

/**
 *
 * @author carcas
 */
public class libro extends producto implements Comparable {

    private String editor;
    private int anoPubli;

    @Override
    public double CalcularPrecioVenta() {
        return precioNormal * 1.05;
    }

    public libro(String editor, int anoPubli, double precioNormal) {
        super(precioNormal);
        this.editor = editor;
        this.anoPubli = anoPubli;
    }

    public libro(String editor, int anoPubli) {
        this.editor = editor;
        this.anoPubli = anoPubli;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
    }

    @Override
    public double getPrecioNormal() {
        return precioNormal;
    }

    @Override
    public void setPrecioNormal(double precioNormal) {
        this.precioNormal = precioNormal;
    }

    @Override
    public String toString() {
        return "Libro { " + " Editor = " + editor + ", Año Publicacion = " + anoPubli + ", Precio normal = " + precioNormal + " }\n";
    }

    @Override
    public int compareTo(Object t) {
        libro l = (libro) t;
        return this.getEditor().compareToIgnoreCase(l.getEditor());
    }

}
