/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.dominio.Marca;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Bug0
 */
public class ListaMarcas implements Serializable{
    private ArrayList <Marca> listaM;

    public ListaMarcas() {
        listaM=new ArrayList();
    }
    

    /**
     * @return the listaM
     */
    public ArrayList <Marca> getListaM() {
        return listaM;
    }

    /**
     * @param listaM the listaM to set
     */
    public void setListaM(ArrayList <Marca> listaM) {
        this.listaM = listaM;
    }
    
    
    
}
