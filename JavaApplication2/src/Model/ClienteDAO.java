
package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Conexao;
import java.sql.ResultSet;

public class ClienteDAO extends Conexao{/*
  id_cliente serial primary key,
	login varchar(50),
	senha varchar(50),
	idade numeric(3),
	nome varchar(200),
	cidade varchar(100),
	cpf varchar(11),
	email varchar(100),
	telefone varchar(20)*/
    
       public void cadastrar (Cliente cliente) throws Exception {
        String sql = "INSERT INTO cliente  values (?,?,?,?,?,?,?,?,?)";

        try {
        PreparedStatement p=this.getConnection().prepareStatement(sql);
            p.setString(1, "default");
            p.setString(2, cliente.getLogin());
            p.setString(3, cliente.getSenha());
            p.setInt(4, cliente.getIdade());
            p.setString(5, cliente.getNome());
            p.setString(6, cliente.getCidade());
            p.setString(7, cliente.getCpf());
            p.setString(8, cliente.getEmail());
            p.setString(9, cliente.getTelefone());
            p.execute();
            p.close();
        } catch (Exception e) {
            System.out.println("Erro no cadastrar." + e.getMessage());

        }

       }
       
        public Cliente buscar (int id) throws Exception {
        String sql = "Select * from cliente where id_cliente = ? ";

        try {
        PreparedStatement p=this.getConnection().prepareStatement(sql);
            p.setInt(1, id);
            ResultSet temp = p.executeQuery();
            Cliente t = new Cliente();
            t.setId(temp.getInt("id_cliente"));
            t.setLogin(temp.getString("login"));
            t.setSenha(temp.getString("senha"));
            t.setIdade(temp.getInt("idade"));
            t.setNome(temp.getString("nome"));
            t.setCidade(temp.getString("cidade"));
            t.setCpf(temp.getString("cpf"));
            t.setEmail(temp.getString("email"));
            t.setTelefone(temp.getString("telefone"));
            
            p.execute();
            p.close();
            return t;
        } catch (Exception e) {
            System.out.println("Erro no cadastrar." + e.getMessage());
            return null;
        }

    }

   public int setId () {
        String sql = "Select count (id_cliente) from cliente";

        try {
        PreparedStatement p=this.getConnection().prepareStatement(sql);
        ResultSet temp = p.executeQuery(sql);
        return temp.getInt("count");
        }catch (Exception e){
            System.out.println("Erro no cadastrar." + e.getMessage());
            return 0;
        }
   }
}
