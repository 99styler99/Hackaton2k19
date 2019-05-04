package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection getConnection()
           throws SQLException {
       try {
           Class.forName("org.postgresql.Driver");
           return DriverManager.getConnection("jdbc:postgresql://localhost:5432/Database","postgres","Oi!1oioioi");
       } catch (ClassNotFoundException | SQLException e) {
           throw new SQLException (e.getMessage());
       }
   }
}
