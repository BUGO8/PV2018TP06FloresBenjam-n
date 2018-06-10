/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.dominio.Electrodomestico;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Bug0
 */
public class ListaElectrodomesticos implements Serializable {
    private ArrayList <Electrodomestico> listaE;

    public ListaElectrodomesticos() {
        listaE=new ArrayList();
    }

    public ListaElectrodomesticos(ArrayList<Electrodomestico> listaE) {
        this.listaE = listaE;
    }
    
    public ArrayList<Electrodomestico> agregarElectrodomesticos(Electrodomestico e){
        getListaE().add(e);
        return getListaE();
    }

    /**
     * @return the listaE
     */
    public ArrayList <Electrodomestico> getListaE() {
        return listaE;
    }

    /**
     * @param listaE the listaE to set
     */
    public void setListaE(ArrayList <Electrodomestico> listaE) {
        this.listaE = listaE;
    }
    
    
    
}
