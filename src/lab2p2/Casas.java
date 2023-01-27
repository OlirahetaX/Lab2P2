/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2;

import java.awt.Color;

/**
 *
 * @author Oliver Iraheta
 */
public class Casas {
    private int numcasa,numbloque,ancho,largo,numbanios,numcuartos;
    private Color c;
    private String duenio,estado;
    
    public Casas() {
    }

    public Casas(int numcasa, int numbloque, int ancho, int largo, int numbanios, int numcuartos, Color c, String duenio, String estado) {
        this.numcasa = numcasa;
        this.numbloque = numbloque;
        this.ancho = ancho;
        this.largo = largo;
        this.numbanios = numbanios;
        this.numcuartos = numcuartos;
        this.c = c;
        this.duenio = duenio;
        this.estado = estado;
    }

    public int getNumcasa() {
        return numcasa;
    }

    public void setNumcasa(int numcasa) {
        this.numcasa = numcasa;
    }

    public int getNumbloque() {
        return numbloque;
    }

    public void setNumbloque(int numbloque) {
        this.numbloque = numbloque;
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

    public int getNumbanios() {
        return numbanios;
    }

    public void setNumbanios(int numbanios) {
        this.numbanios = numbanios;
    }

    public int getNumcuartos() {
        return numcuartos;
    }

    public void setNumcuartos(int numcuartos) {
        this.numcuartos = numcuartos;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Numero de Casa= " + numcasa + ", Numero de Bloque= " + numbloque + ", ancho= " + ancho + ", largo= " + largo + ", Numero de Baños= " + numbanios + ", Numero de Cuartos= " + numcuartos + ", Color= " + c + ", Duenio= " + duenio + ", Estado=" + estado + '}';
    }
    
}
