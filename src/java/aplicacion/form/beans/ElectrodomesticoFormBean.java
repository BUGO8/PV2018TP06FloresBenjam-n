/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.beans;

import aplicacion.datos.ListaElectrodomesticos;
import aplicacion.datos.ListaMarcas;
import aplicacion.dominio.Electrodomestico;
import aplicacion.dominio.Marca;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Bug0
 */
@ManagedBean
@ViewScoped
public class ElectrodomesticoFormBean {
    private String codigo;
    private String tipo;
    private String modelo;
    private Marca marca;
    private Date fecha;
    private Double precio;
    private int stock;
    private byte[] imagenm;
    private boolean disponibilidad;
    private String codencontrado;
    private transient UploadedFile file=null;
    private Electrodomestico unElectrodomestico;
    private ListaElectrodomesticos electrodomesticos;
    private ArrayList <Electrodomestico> lista;
    private ListaMarcas listadoM;
    private ArrayList <Marca> listaMarcas;
    
    public ElectrodomesticoFormBean() {
       electrodomesticos=new ListaElectrodomesticos();
       lista=new ArrayList();
       listadoM=new ListaMarcas();
       listadoM.getListaM().add(new Marca("1","Asus"));
       listadoM.getListaM().add(new Marca("2","Razer"));
       listadoM.getListaM().add(new Marca("3","Samsumg"));
       listadoM.getListaM().add(new Marca("4","Apple"));
    }
    public void agregarElectrodomestico() throws ParseException{
        //SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
        //Date unaFecha=formato.parse(getFecha());
        setUnElectrodomestico(new Electrodomestico(getCodigo(),getTipo(),getMarca(),getFecha(),getModelo(),getPrecio(),getStock(),getImagenm(),isDisponibilidad()));
        setLista(getElectrodomesticos().agregarElectrodomesticos(getUnElectrodomestico()));
    }
    public void buscarElectrodomestico(){
        for(int i=0;i<getLista().size();i++){
           if(getLista().get(i).getCodigo().equals(getCodencontrado())) {
           FacesMessage message=new FacesMessage("El electrodomestico encontrado se muestra en la lista");
           FacesContext.getCurrentInstance().addMessage(null, message);
                getUnElectrodomestico().setCodigo(getLista().get(i).getCodigo());
                getUnElectrodomestico().setTipo(getLista().get(i).getTipo());
                getUnElectrodomestico().setMarca(getLista().get(i).getMarca());
                getUnElectrodomestico().setFecha(getLista().get(i).getFecha());
                getUnElectrodomestico().setModelo(getLista().get(i).getModelo());
                getUnElectrodomestico().setPrecio(getLista().get(i).getPrecio());
                getUnElectrodomestico().setStock(getLista().get(i).getStock());
                getUnElectrodomestico().setImagenm(getLista().get(i).getImagenm());
                getUnElectrodomestico().setDisponibilidad(getLista().get(i).isDisponibilidad());
                setLista((ArrayList<Electrodomestico>) new ArrayList());
                getLista().add(getUnElectrodomestico());
            }
        }
    }
    public void reiniciarLista(){
        FacesMessage message=new FacesMessage("Se ha reiniciado la lista");
        FacesContext.getCurrentInstance().addMessage(null, message);
        lista=new ArrayList();
    }
    public void agregarImagen(){
        setImagenm(file.getContents());
        FacesMessage message=new FacesMessage("Terminado",file.getFileName()+"Subida");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    public StreamedContent getImagenSubida()throws IOException{
        FacesContext context= FacesContext.getCurrentInstance();
        if(context.getCurrentPhaseId()==PhaseId.RENDER_RESPONSE){
            return new DefaultStreamedContent();
        }
        else{ 
            if(getImagenm()==null){
                return null;}
            else{
                return new DefaultStreamedContent(new ByteArrayInputStream(getImagenm()));
            }
        }
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
     * @return the unElectrodomestico
     */
    public Electrodomestico getUnElectrodomestico() {
        return unElectrodomestico;
    }

    /**
     * @param unElectrodomestico the unElectrodomestico to set
     */
    public void setUnElectrodomestico(Electrodomestico unElectrodomestico) {
        this.unElectrodomestico = unElectrodomestico;
    }

    /**
     * @return the electrodomesticos
     */
    public ListaElectrodomesticos getElectrodomesticos() {
        return electrodomesticos;
    }

    /**
     * @param electrodomesticos the electrodomesticos to set
     */
    public void setElectrodomesticos(ListaElectrodomesticos electrodomesticos) {
        this.electrodomesticos = electrodomesticos;
    }

    /**
     * @return the lista
     */
    public ArrayList <Electrodomestico> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList <Electrodomestico> lista) {
        this.lista = lista;
    }

    /**
     * @return the listadoM
     */
    public ListaMarcas getListadoM() {
        return listadoM;
    }

    /**
     * @param listadoM the listadoM to set
     */
    public void setListadoM(ListaMarcas listadoM) {
        this.listadoM = listadoM;
    }

    /**
     * @return the listaMarcas
     */
    public ArrayList <Marca> getListaMarcas() {
        return listaMarcas;
    }

    /**
     * @param listaMarcas the listaMarcas to set
     */
    public void setListaMarcas(ArrayList <Marca> listaMarcas) {
        this.listaMarcas = listaMarcas;
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
     * @return the codencontrado
     */
    public String getCodencontrado() {
        return codencontrado;
    }

    /**
     * @param codencontrado the codencontrado to set
     */
    public void setCodencontrado(String codencontrado) {
        this.codencontrado = codencontrado;
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
     * @return the disponibilidad
     */
    public boolean isDisponibilidad() {
        disponibilidad = getStock() > 0;
        return disponibilidad;
    }

    /**
     * @param disponibilidad the disponibilidad to set
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * @param imagenm the imagenm to set
     */
    public void setImagenm(byte[] imagenm) {
        this.imagenm = imagenm;
    }

    /**
     * @return the file
     */
    public UploadedFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(UploadedFile file) {
        this.file = file;
    }
    
}
