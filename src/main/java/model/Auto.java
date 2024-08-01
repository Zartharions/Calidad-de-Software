/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

final public class Auto extends Vehiculo{
    private int nroPuertas;

    public Auto(int nroPuertas, String nroPlaca, String marca, String modelo, String color, String tipo, LocalDate fechaCrea) {
        super(nroPlaca, marca, modelo, color, tipo, fechaCrea);
        this.nroPuertas = nroPuertas;
    }

    public int getNroPuertas() {
        return nroPuertas;
    }

    public String getNroPlaca() {
        return nroPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDate getFechaCrea() {
        return fechaCrea;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setNroPuertas(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }

    public void setNroPlaca(String nroPlaca) {
        this.nroPlaca = nroPlaca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFechaCrea(LocalDate fechaCrea) {
        this.fechaCrea = fechaCrea;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public String toString() {
        return "nroPuertas: " + nroPuertas + "\nnroPlaca: " + nroPlaca+ "\nMarca: "+marca+ "\nModelo: "+modelo+"\nColor: "+color+"\nTipo: "+tipo+"\nFecha de recepcion: "+fechaCrea;
    }

    

    




    
    
    
    
    
}