/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajointegrador;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;

/**
 *
 * @author Agustin
 */
public class Recordatorios implements Serializable {
    
    private String tituloRecordatorio;
    private String contenidoRecordatorio;
    private Font fuente; 
    private Color colorFuente;

    public Recordatorios(String titulo, String contenido, Font fuente, Color color) {
        
        this.tituloRecordatorio = titulo;
        this.contenidoRecordatorio = contenido;
        this.fuente = fuente;
        this.colorFuente = color;
        
    }
    
    public Recordatorios (Font fuente, Color color) {
        
        this.tituloRecordatorio = "Titulo por defecto";
        this.fuente = fuente;
        this.colorFuente = color;
        
    }
     
    
    /**
     * @return the fuente
     */
    public Font getFuente() {
        return fuente;
    }

    /**
     * @param fuente the fuente to set
     */
    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }

    /**
     * @return the colorFuente
     */
    public Color getColorFuente() {
        return colorFuente;
    }
    
    public String colorToString() {
        
        int rgb = this.colorFuente.getRGB();
        
        if (rgb == Color.GREEN.getRGB()) {
            return "Verde";
        }
        if (rgb == Color.RED.getRGB()) {
            return "Rojo ";
        }
        if (rgb == Color.WHITE.getRGB()) {
            return "Blanco";
        }
        if (rgb == Color.BLUE.getRGB()) {
            return "Azul";
        }
        if (rgb == Color.BLACK.getRGB()) {
            return "Negro";
        }
        
        return "";
        
    }
    
    public String fuenteToString() {
        return fuente.getName();
    }

    /**
     * @param colorFuente the colorFuente to set
     */
    public void setColorFuente(Color colorFuente) {
        this.colorFuente = colorFuente;
    }
    /**
     * @return the tituloRecordatorio
     */
    public String getTituloRecordatorio() {
        return tituloRecordatorio;
    }

    /**
     * @param tituloRecordatorio the tituloRecordatorio to set
     */
    public void setTituloRecordatorio(String tituloRecordatorio) {
        this.tituloRecordatorio = tituloRecordatorio;
    }

    /**
     * @return the contenidoRecordatorio
     */
    public String getContenidoRecordatorio() {
        return contenidoRecordatorio;
    }

    /**
     * @param contenidoRecordatorio the contenidoRecordatorio to set
     */
    public void setContenidoRecordatorio(String contenidoRecordatorio) {
        this.contenidoRecordatorio = contenidoRecordatorio;
    }
    
    
    
    
}
