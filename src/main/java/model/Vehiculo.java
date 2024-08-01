package model;

import java.time.LocalDate;


abstract class Vehiculo {
    protected String nroPlaca, marca, modelo, color, tipo;
    protected LocalDate fechaCrea;
    protected boolean electrico=false;

    public Vehiculo(String nroPlaca, String marca, String modelo, String color, String tipo, LocalDate fechaCrea) {
        this.nroPlaca = nroPlaca;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.fechaCrea = fechaCrea;
    }
    
    
    //--------------------Getter y Setters----------------

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
    
    //---------------toString-------------------

    @Override
    public String toString() {
        return "Vehiculo{" + "nroPlaca=" + nroPlaca + ", marca=" + marca + ", modelo=" +
                modelo + ", color=" + color + ", tipo=" + tipo + ", fechaCrea=" + fechaCrea + ", electrico=" + electrico + '}';
    }
    
}
