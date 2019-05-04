package Model;

public class Pessoa{

  private int idade;
  private String nome;
  private String cidade;
  private String cpf;
  private String email;
  private String telefone;
  private int id;
  public Pessoa(){
  }
  
  public void setIdade(int idade){
    this.idade= idade;
  }
  
  public void setEmail(String email){
    this.email= email;
  }
  
  public void setTelefone(String telefone){
    this.telefone= telefone;
  }

  
  public void setNome(String nome){
    this.nome = nome;
  }

  public void setCidade(String cidade){
    this.cidade = cidade;
  }

  public void setCpf(String cpf){
    this.cpf = cpf; 
  }

  public void setId(int id){
    this.id = id;
  }

  public int getIdade(){
    return this.idade;
  }

  public String getNome(){
    return this.nome;
  }

  public String getCidade(){
    return this.cidade;  
  }

  public String getCpf(){
    return this.cpf; 
  }

  public Pessoa getPessoa(){
    return this; 
  }
  
  public String getEmail(){
    return this.email;
  }
  
  public String getTelefone(){
    return this.telefone;
  }

    int getId() {
        return this.id;
    }
}
