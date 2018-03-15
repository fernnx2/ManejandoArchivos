/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorArchivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pojos.Equipo;

/**
 *
 * @author fernando
 */
public class AdministrarArchivos {
    
      public boolean validar(String path){
    
        //"src/test/resources/data.csv"
        boolean acceso =false;
        if(path.trim().isEmpty()){}
        else{
            
        Path p = Paths.get(path);
        if(Files.exists(p)){
         acceso = true;
        }
        
        }
        
       return acceso;
        
    }
    
    
    public boolean validarPerimisos(String path){
    
        boolean acceso = false;
        Path p = Paths.get(path);
        if(path.trim().isEmpty()){}
        else{
        if(Files.isReadable(p) && Files.isWritable(p)){
        acceso = true;
        }
        }
        
        return acceso;
    }
    
    public boolean validarDirectorio(String path){
          boolean acceso = false;
        Path p = Paths.get(path);
        if(path.trim().isEmpty()){}
        else{
        if(Files.isDirectory(p)){
        acceso = true;
        }
        }
        
        return acceso;
    }
    
    
    
    
    
    public List<String> leer_archivo(String path){
    
        List<String> data = new ArrayList() ;
        
        if(validar(path)==true && validarPerimisos(path)==true){
            Path p = Paths.get(path);
            try{
                BufferedReader br = Files.newBufferedReader(p, Charset.defaultCharset());
                String line;
                while((line = br.readLine())!=null){
                data.add(line);
                }
                br.close();
            }
            catch(IOException e){
            
            }
            
        }
    
        return data;
    }
    
    
    
    
    public List<Equipo> convertirArchivo(List<String> data){
        
        List<Equipo> equipos = new ArrayList();
        
        Iterator it = data.iterator();
        
        while(it.hasNext()){
        Equipo e = new Equipo();
        String[] objeto = it.next().toString().split(",");
        e.setHistorico(objeto[0]);
        e.setnInventario(objeto[1]);
        e.setMarca(objeto[2]);
        e.setnSerie(objeto[3]);
        e.setModelo(objeto[4]);
        e.setResponsable(objeto[5]);
        e.setSistema(objeto[6]);
        e.setVersion(objeto[7]);
        e.setLicencia(objeto[8]);
        e.setObservaciones(objeto[9]);
        equipos.add(e);
           
        }
        return equipos;
    }
    
    
    
    
}
