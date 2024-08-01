/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Grupo12
 */
public class Factura {
    private LocalDate fecha;
    private String descripcion;;
    private double subtotal;
    private Auto vehiculo;
    private Cliente cliente;
    private int nroFactura;

    public Factura(LocalDate fecha, String descripcion, double subtotal, Auto vehiculo, Cliente cliente, int nroFactura) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.subtotal = subtotal;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.nroFactura = nroFactura;
    }   

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Auto vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    @Override
    public String toString() {
        return "FacturaSABG{" + "fecha=" + fecha + ", descripcion=" + descripcion + ", subtotal=" + subtotal + ", vehiculo=" + vehiculo + ", cliente=" + cliente + ", nroFactura=" + nroFactura + '}';
    }
    
}
