/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dominio;

/**
 *
 * @author Bug0
 */
public class Marca {
    private String codigo;
    private String NomMarca;

    /**
     * @param codigo
     * @param NomMarca
     */
    
    public Marca(String codigo, String NomMarca) {
        this.codigo = codigo;
        this.NomMarca = NomMarca;
    }

    public Marca() {
    }

    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the NomMarca
     */
    public String getNomMarca() {
        return NomMarca;
    }

    /**
     * @param NomMarca the NomMarca to set
     */
    public void setNomMarca(String NomMarca) {
        this.NomMarca = NomMarca;
    }
    
}
