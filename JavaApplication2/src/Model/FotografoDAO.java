
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FotografoDAO extends Conexao {
      public void cadastrar (Fotografo fotografo) throws Exception {
        String sql = "INSERT INTO fotografo(idade, nome, cidade, email, cpf,telefone, tipo, classificacao, experiencia, login, senha)  values (?,?,?,?,?,?,?,?,?,?,?)";

        try {
        PreparedStatement p=this.getConnection().prepareStatement(sql);
            p.setInt(1, fotografo.getIdade());
            p.setString(2, fotografo.getNome());
            p.setString(3, fotografo.getCidade());
            p.setString(4, fotografo.getCpf());
            p.setString(5, fotografo.getEmail());
            p.setString(6, fotografo.getTelefone());
            p.setString(7, fotografo.getTipo());
            p.setInt(8, fotografo.getClassificacao());
            p.setInt(9, fotografo.getExperiencia());
            p.setString(10, fotografo.getLogin());
            p.setString(11, fotografo.getSenha());           

            p.execute();
            p.close();
        } catch (Exception e) {
            System.out.println("Erro no cadastrar." + e.getMessage());

        }
      }

      public Fotografo buscar (int id) throws Exception {
        String sql = "Select * from fotografo where id_fotografo = ? ";
        try {
        PreparedStatement p=this.getConnection().prepareStatement(sql);
            p.setInt(1, id);
            ResultSet temp = p.executeQuery();
            Fotografo t = new Fotografo();
            while(temp.next()){
            t.setId(temp.getInt("id_fotografo"));
            t.setIdade(temp.getInt("idade"));
            t.setNome(temp.getString("nome"));
            t.setCidade(temp.getString("cidade"));
            t.setCpf(temp.getString("cpf"));
            t.setEmail(temp.getString("email"));
            t.setCidade(temp.getString("telefone"));
            t.setClassificacao(temp.getInt("Classificacao"));
            t.setExperiencia(temp.getInt("experiencia"));
            t.setLogin(temp.getString("login"));
            t.setSenha(temp.getString("senha"));
            t.setTipo(temp.getString("tipo"));
            }
            p.close();
            return t;
        } catch (Exception e) {
            System.out.println("Erro no cadastrar." + e.getMessage());
            return null;
        }

    }
      
   public int setId (){
        String sql = "Select count (id_fotografo)from fotografo";

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