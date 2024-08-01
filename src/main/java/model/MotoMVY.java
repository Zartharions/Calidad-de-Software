package model;
import java.time.LocalDate;

public class MotoMVY extends Vehiculo {
    private String sistema;

    public MotoMVY(String sistema, String nroPlaca, String marca, String modelo, String color, String tipo, LocalDate fechaCrea) {
        super(nroPlaca, marca, modelo, color, tipo, fechaCrea);
        this.sistema = sistema;
    }

    
    //-------------------Getter Setters----------------------------

    public String getSistema() {
        return sistema;
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
    
    public void setSistema(String sistema) {
        this.sistema = sistema;
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
        return "MotoHAYV{" + "sistema=" + sistema +"," + "\nNumero de placa=" + nroPlaca + "," + "\nMarca=" + marca + "," + "\nModelo=" + modelo + "," + "\nColor=" + color +"\nTipo=" + tipo +", \nFechaCrea=" + fechaCrea +'}';
    }

    
}