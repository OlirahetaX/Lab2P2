/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2;

/**
 *
 * @author Oliver Iraheta
 */
public class Solares {
    private int ancho,largo,area;
    private String duenio;

    public Solares(int ancho, int largo, String duenio) {
        this.ancho = ancho;
        this.largo = largo;
        this.duenio = duenio;
        this.area = ancho*largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Ancho=" + ancho + ", Largo=" + largo + ", Area=" + area + ", Duenio=" + duenio + "\n";
    }
    

}
