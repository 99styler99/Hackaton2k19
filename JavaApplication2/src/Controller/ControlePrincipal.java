
package Controller;

import Model.Banco;
import Model.Fotografo;
import View.*;
public class ControlePrincipal {

    Banco b;
    TelaLogin telaLogin;    
    TelaCadastro telaCadastro;  
    TelaCadastroFotografo telaCadastroFotografo;
    TelaCadastroCliente telaCadastroCliente;    
    TelaMenu telaMenu; 
    TelaPerfil telaPerfil;  
    TelaPerfilUsuario telaPerfilUsuario;    
    
    public void inicio() {
        b = new Banco();
        telaLogin =new TelaLogin();
        telaPerfil=new TelaPerfil();
        telaCadastro=new TelaCadastro(); 
        telaCadastroCliente=new TelaCadastroCliente();
        telaCadastroFotografo = new TelaCadastroFotografo(); 
        telaPerfilUsuario=new TelaPerfilUsuario();
        telaLogin.setControler(this);
        telaLogin.setVisible(true);
    }

    public void chamarTelaMenu() {
        telaMenu = new TelaMenu();
        telaPerfil.setVisible(false);
        telaPerfilUsuario.setVisible(false);
        telaLogin.setVisible(false);
        telaMenu.setControler(this);
        telaMenu.setVisible(true);
    }

    public void chamarTelaPerfil(Fotografo f) {
        telaPerfil = new TelaPerfil();
        telaPerfil.setFotografo(f);
        telaMenu.setVisible(false);
        telaPerfil.setControler(this);
        telaPerfil.setVisible(true);
    }

    public void chamarTelaPerfilUsuario() {
        telaMenu.setVisible(false);
        telaPerfilUsuario.setControler(this);
        telaPerfilUsuario.setVisible(true);
    }

    public void chamarTelaCadastro() {
        telaLogin.setVisible(false);
        telaCadastro.setVisible(true);
        telaCadastro.setControler(this);
       }

    public void chamarTelaCadastroFotografo() {
        telaCadastro.setVisible(false);
        telaCadastroFotografo.setVisible(true);
        telaCadastroFotografo.setControler(this);
    }
    public void chamarTelaCadastroCliente() {
        telaCadastro.setVisible(false);
        telaCadastroCliente.setVisible(true);
        telaCadastroCliente.setControler(this);
    }
    
}
