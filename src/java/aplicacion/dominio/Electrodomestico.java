/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Bug0
 */
public class Electrodomestico implements Serializable {
    private String codigo;
    private String modelo;
    private String tipo;
    private Double precio;
    private Marca marca;
    private Date fecha;
    private int stock;
    private byte[] imagenm;
    private boolean disponibilidad;
    public Electrodomestico() {
    }

    public Electrodomestico(String codigo, String tipo, Marca marca, Date fecha, String modelo, Double precio, int stock, byte[] imagenm, boolean disponibilidad) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.marca = marca;
        this.fecha = fecha;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
        this.imagenm = imagenm;
        this.disponibilidad = disponibilidad;
    }


  

  

    /**
     * @return the codigo
     */
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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the imagenm
     */
    public byte[] getImagenm() {
        return imagenm;
    }

    /**
     * @param imagenm the imagenm to set
     */
    public void setImagenm(byte[] imagenm) {
        this.imagenm = imagenm;
    }

    /**
     * @return the disponibilidad
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * @param disponibilidad the disponibilidad to set
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
}
