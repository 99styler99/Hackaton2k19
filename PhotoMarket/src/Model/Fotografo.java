package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Fotografo extends Pessoa implements Serializable{

    private int id;
    private String tipo;
    private int classificacao;
    private ArrayList<String> tag;
    private int experiencia;
    private String login;
    private String senha;
    
    public Fotografo() {
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void setTag(ArrayList<String> tag) {
        this.tag = tag;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Fotografo getFotografo() {
        return this;
    }

    public int getId() {
        return this.id;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getClassificacao() {
        return this.classificacao;
    }

    public int getExperiencia() {
        return this.experiencia;
    }

    public ArrayList<String> getTag() {
        return this.tag;
    }

    public String getLogin() {
        return this.login;
    }

    public String getSenha() {
        return this.senha;
    }

}
