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
public class Cliente {
    protected String cedula,nombres,apellidos,direccion,correo,telefono;
    protected LocalDate fechaNac;
    protected int edad;


    public Cliente(String cedula, String nombres, String apellidos, String direccion, String correo, String telefono, LocalDate fechaNac, int edad) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
        this.edad = edad;

    }
    
    //------------------ Getter, Setters y ToString-------------------------

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public int getEdad() {
        return edad;
    }


    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
//-----------toString-------------------------
    @Override
    public String toString() {
        return "Codigo cliente" + "\ncedula= " + cedula + "\nnombres= " + nombres + "\napellidos= " + 
                apellidos + "\ndireccion= " + direccion + "\ncorreo= " + correo + "\ntelefono= " + telefono + "\nfecha de nacimiento= " + fechaNac+ "\nEdad= "+edad+"\n-----------------------\n";
    }
    
    
}

