/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.uesocc.ingenieria.mantenimientoclient;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pojos.Equipo;

/**
 *
 * @author fernando
 */
public class ControladorInicio {
    
    
  
    
    
    public void llenarTabla(List<Equipo> equipos, JTable tabla){
    
        DefaultTableModel m = new DefaultTableModel();
        tabla.setModel(m);
        int header=0;
        
        
        for(Equipo e  : equipos){
         if(header ==0){
       
        m.addColumn(e.getHistorico());
        
        m.addColumn(e.getnInventario());
        m.addColumn(e.getMarca());
        m.addColumn(e.getnSerie());
        m.addColumn(e.getModelo());
        m.addColumn(e.getResponsable());
        m.addColumn(e.getSistema());
        m.addColumn(e.getVersion());
        m.addColumn(e.isLicencia());
        m.addColumn(e.getObservaciones());
        header = header +1;
         }
         else{
         Object data[] = new Object[10];
        data[0]= e.getHistorico();
        data[1]= e.getnInventario();
        data[2]=e.getMarca();
        data[3]=e.getnSerie();
        data[4]=e.getModelo();
        data[5]=e.getResponsable();
        data[6]=e.getSistema();
        data[7]=e.getVersion();
        data[8]=e.isLicencia();
        data[9]=e.getObservaciones();
        m.addRow(data);
         
         }
        
        }
        
    
    }
    
    
    
}
