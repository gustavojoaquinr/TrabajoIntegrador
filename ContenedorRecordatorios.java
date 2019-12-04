/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajointegrador;

import java.awt.Color;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Agustin
 */
public class ContenedorRecordatorios {
    private ArrayList<Recordatorios> listaRecordatorios = new ArrayList<>();
    
    public ArrayList<Recordatorios> getListaRecordatorios() {
        return listaRecordatorios;
    }

    public void setListaRecordatorios(ArrayList<Recordatorios> listaRecordatorios) {
        this.listaRecordatorios = listaRecordatorios;
    }
    
    public void agregarRecordatorio(Recordatorios r) {
        listaRecordatorios.add(r);
    }
    
    public void eliminarRecordatorio(String tituloRecordatorio) {
        
       Iterator<Recordatorios> iterador = listaRecordatorios.iterator();
       
       while (iterador.hasNext()) {
           if (iterador.next().getTituloRecordatorio().equals(tituloRecordatorio)) {
               iterador.remove();
           }
       }
        
    }
    
    public void leerRecordatorios() {
        
    	try {
            ObjectInputStream entradaRecordatorios = new ObjectInputStream(new FileInputStream("C:/Users/Usuario/Desktop/recordatorios.txt"));
            listaRecordatorios = (ArrayList<Recordatorios>) entradaRecordatorios.readObject();
	}catch (IOException | ClassNotFoundException e) { //Exception e
		//e.printStackTrace();
        }
    	
    }
    
    public void guardarRecordatorios() {
    	
    	try {
            ObjectOutputStream salidaRecordatorios = new ObjectOutputStream(new FileOutputStream("C:/Users/Usuario/Desktop/recordatorios.txt"));
            salidaRecordatorios.writeObject(listaRecordatorios);
	} catch (FileNotFoundException e) {
		//e.printStackTrace();
	} catch (IOException e) {
		//e.printStackTrace();
	}
    	
    }
    
    public void modificarRecordatorio(String tituloOriginal, String nuevoTitulo, String nuevoContenido, Color nuevoColor, Font nuevaFuente) {
        
        for (int i = 0; i < listaRecordatorios.size(); i++) {
           Recordatorios r = listaRecordatorios.get(i);
           
           if (r.getTituloRecordatorio().equals(tituloOriginal)) {
               listaRecordatorios.set(i, new Recordatorios(nuevoTitulo, nuevoContenido, nuevaFuente, nuevoColor));
               break;
           }
        }
    }
    
    
    
    
    
    
}
