/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.beans;


import aplicacion.datos.ListaUsuarios;
import aplicacion.dominio.Usuario;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Bug0
 */
@ManagedBean
@ViewScoped
public class LoginFormBean {
    private String user;
    private String password;

    public LoginFormBean(String user, String password) {
        this.user = user;
        this.password = password;
    }

    /**
     * Creates a new instance of LoginFormBean
     */
    public LoginFormBean() {
    }
    public String validarUsuario(){
        String resultado=null;
        Usuario usuario=null;
        ListaUsuarios unUsuario=new ListaUsuarios();
        usuario=unUsuario.validarUsuario(getUser(), getPassword());
        if(usuario==null){
            FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR,"Credenciales Invalidas","El usuario no existe");
          FacesContext.getCurrentInstance().addMessage(null,facesMessage);
        }
        else{
             FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO,"Credenciales validas"," Usuario valido");
          FacesContext.getCurrentInstance().addMessage(null,facesMessage);
          FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("UsiarioValidado",usuario);
          resultado="/electrodomesticos";
        }
        return resultado;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}