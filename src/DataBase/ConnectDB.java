
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.SQLException;

public class ConnectDB {
    // Dados para conexão com o banco
    private static final String URL    = "jdbc:mysql://localhost:3306/DB_Padaria";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER   = "com.mysql.jdbc.Driver";
    private static Connection conn = null ; 
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            conn = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (conn != null) {
                System.out.println("Conexão realizada com sucesso!");
            } 
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Ocorreu um erro ao conetar no banco. \n" + ex);
        }
        return null;
    }
    public static void closeConnection(){        
        try {
            if (conn != null){
                conn.close();
                System.out.println("Conexão fechada.");
            }
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao fechar conexão no banco. \n" + ex);
        }
        
    }
}
