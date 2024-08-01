/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JTable;


/**
 *
 * @author AY
 */
public interface MotoInterface {
    public static void llenarCombo(JComboBox<String> cmbMoto) {
    }

    public static void registrar(String sistema, String nroPlaca, String marca, String modelo, String color, String tipo, LocalDate fechaCrea){
    }
    
    public static int codigo(){
        return 0;
    }
    
    public static void llenarTabla(JTable tabPresentar){
    }
    
   public static void filtrar(JTable tabFiltro, String sistema, String tipo){
   }
   
   public static void setFilas(JTable tabFiltro,int fila, Map.Entry x){  
   }
   
   public static void editarMoto(String codigo,String marca, String color){
    }
   
   public static void llenarCombo2(JComboBox<String>cmbEditar) {
    }
   
   public static void eliminar(String codigo){
   }
}



    
