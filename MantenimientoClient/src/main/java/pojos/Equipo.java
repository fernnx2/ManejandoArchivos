/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;



/**
 *
 * @author fernando
 */

public class Equipo {
    
     
    private String historico;
    private String nInventario;
    private String marca;
    private String nSerie;
    private String modelo;
    private String responsable;
    private String sistema;
    private String version;
    private String licencia;
    private String observaciones;

    public Equipo(String historico, String nInventario, String marca, String nSerie, String modelo, String responsable, String sistema, String version,String licencia, String observaciones) {
        this.historico = historico;
        this.nInventario = nInventario;
        this.marca = marca;
        this.nSerie = nSerie;
        this.modelo = modelo;
        this.responsable = responsable;
        this.sistema = sistema;
        this.version = version;
        this.licencia = licencia;
        this.observaciones = observaciones;
    }
    
    
    
    public Equipo(){}
    
    

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getnInventario() {
        return nInventario;
    }

    public void setnInventario(String nInventario) {
        this.nInventario = nInventario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getnSerie() {
        return nSerie;
    }

    public void setnSerie(String nSerie) {
        this.nSerie = nSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String isLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
    
    
}
