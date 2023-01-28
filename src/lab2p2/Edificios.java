/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2;

/**
 *
 * @author Oliver Iraheta
 */
public class Edificios {
    private int numpisos, locales;
    private String direccion,estado,duenio;

    public Edificios(int numpisos, int locales, String direccion, String estado, String duenio) {
        this.numpisos = numpisos;
        this.locales = locales;
        this.direccion = direccion;
        this.estado = estado;
        this.duenio = duenio;
    }

    public Edificios() {
    }

    public int getNumpisos() {
        return numpisos;
    }

    public void setNumpisos(int numpisos) {
        this.numpisos = numpisos;
    }

    public int getLocales() {
        return locales;
    }

    public void setLocales(int locales) {
        this.locales = locales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Numero de pisos= " + numpisos + ", Cantidad de locales= " + locales + ", Dirección por referencia= " + direccion + ", Estado=" + estado + ", Duenio=" + duenio+"\n";
    }
    
}
