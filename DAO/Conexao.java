package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao{

    private static final String url = "jdbc:postgresql://localhost:5432/funcionariosteste";
    private static final String user = "postgres";
    private static final String password = "admin";


    private static Connection conn;

    public static Connection getConexao(){

        
        try{
            if(conn == null){
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        } else {
            return conn;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return null;
    }
}

}
