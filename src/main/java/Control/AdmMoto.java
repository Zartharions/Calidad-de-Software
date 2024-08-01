/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.MotoMVY;

/**
 *
 * @author AY
 */
public class AdmMoto {
    private static AdmMoto adm=null;
    HashMap<Integer,MotoMVY> motos=new HashMap<>();
    LocalDate date = LocalDate.now();
    
    private MotoMVY moto=null;
    public static AdmMoto getAdm(){
        if(adm==null){
            adm=new AdmMoto();
        }
        return adm;
    }

    public void llenarCombo(JComboBox<String> cmbMoto) {
        cmbMoto.removeAllItems();
        cmbMoto.addItem("Electrico");
        cmbMoto.addItem("Mecanico");
    }

    public boolean verificar(LocalDate dFecha) {
        boolean x=true;
        if(dFecha!=null)
            x=false;
        return x;
    }
    
    public void registrar(String sistema, String nroPlaca, String marca, String modelo, String color, String tipo, LocalDate fechaCrea){
        int codigo= codigo();
        this.moto=new MotoMVY( sistema, nroPlaca, marca, modelo, color, tipo, fechaCrea);
        motos.put(codigo,this.moto);
    }
    
    public int codigo(){
        int numero = (int)(Math.random()*9999+1);
        return numero;
    }
    
    public void llenarTabla(JTable tabPresentar){
        DefaultTableModel modelo=(DefaultTableModel)tabPresentar.getModel();
        int fila=0;
        if(motos.size()>0){
            for(Map.Entry x:motos.entrySet()){
                modelo.addRow(new Object[1]);
                moto=(MotoMVY)x.getValue();
                String codigo=String.valueOf(x.getKey());
                tabPresentar.setValueAt(codigo,fila,0);
               tabPresentar.setValueAt(moto.getSistema(),fila,1);
               tabPresentar.setValueAt(moto.getNroPlaca(),fila,2);
               tabPresentar.setValueAt(moto.getMarca(),fila,3);
               tabPresentar.setValueAt(moto.getModelo(),fila,4);
               tabPresentar.setValueAt(moto.getColor(),fila,5);
               tabPresentar.setValueAt(moto.getTipo(),fila,6);
               tabPresentar.setValueAt(moto.getFechaCrea(),fila,7);
               fila++;      
            }
        }
    }
    
   public void filtrar(JTable tabFiltro, String sistema, String tipo){
       DefaultTableModel modelo=(DefaultTableModel)tabFiltro.getModel();
       int fila=0;
       modelo.setNumRows(0);
       if(motos.size()>0){
           for(Map.Entry x:motos.entrySet()){
               moto=(MotoMVY)x.getValue();
               if(this.moto.getSistema().compareTo(sistema)==0){
                  if(this.moto.getTipo().compareTo(tipo)==0){
                   modelo.addRow(new Object[1]);
                   setFilas(tabFiltro, fila,x);
                   fila++;
                  }
                   
               }
           }
           
       }
   }
   
   private void setFilas(JTable tabFiltro,int fila, Map.Entry x){
        tabFiltro.setValueAt(moto.getSistema(),fila,0);
        tabFiltro.setValueAt(moto.getNroPlaca(),fila,1);
        tabFiltro.setValueAt(moto.getMarca(),fila,2);
        tabFiltro.setValueAt(moto.getModelo(),fila,3);
        tabFiltro.setValueAt(moto.getColor(),fila,4);
        tabFiltro.setValueAt(moto.getTipo(),fila,5);
        tabFiltro.setValueAt(moto.getFechaCrea(),fila,6);
       
   }
   
   public void editarMoto(String codigo,String marca, String color){
        int key=Integer.parseInt(codigo);
        motos.get(key).setMarca(marca);
        motos.get(key).setColor(color);
    }
   
   public void llenarCombo2(JComboBox<String>cmbEditar) {
        cmbEditar.removeAllItems();
        for(Map.Entry<Integer,MotoMVY>x:motos.entrySet()){
            String codigo=String.valueOf(x.getKey());
            cmbEditar.addItem(codigo);
        }
    }
   
   public void eliminar(String codigo){
       int key=0;
       int cf=JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar esta opcion");
       if(JOptionPane.OK_OPTION==cf){
           key=Integer.parseInt(codigo);
       }else{
           JOptionPane.showMessageDialog(null, "No se eliminio esta opcion");
       }
       motos.remove(key);
   }
}