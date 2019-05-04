/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Ikedas
 */
public class Cliente extends Pessoa implements Serializable{
    private String login;
    private String senha;
    ClienteDAO c = new ClienteDAO();
    
    public Cliente(){
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getLogin(){
        return this.login;
    }
    public String getSenha(){
        return this.senha;
    }
    
    public Cliente getCliente(){
        return this;
    }

}
