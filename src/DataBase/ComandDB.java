
package DataBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
public class ComandDB {
    private PreparedStatement ps = null;
    private String sql = null;
    ResultSet result = null;
    private static Connection conn = null;
    public boolean TestarConexão(){
        conn = ConnectDB.getConnection();
        return conn != null;
    }
    public String GerarCodigo(String Tabela){
        sql = "";
        sql = sql + "SELECT CodProduto FROM " + Tabela + " ORDER BY 1 DESC ;";
        try{
            ps = ConnectDB.getConnection().prepareStatement(sql);
            result = ps.executeQuery(sql);
            //Conexao.closeConnection();
            int codTemp;
            if (result.next()){
                String strTemp = result.getString(1);
                codTemp = Integer.parseInt(strTemp) + 1;
            }else{
                codTemp = 1;
            }             
            return Integer.toString(codTemp);
        }catch(SQLException u ){
            System.out.println(u);
            return "999";
        } 
    }
    public ResultSet select(String sql) {
        try{
            ps = ConnectDB.getConnection().prepareStatement(sql);
            result = ps.executeQuery(sql);
            //Conexao.closeConnection();
            return result;
        }catch(SQLException u ){
            System.out.println(u);     
        }
        return result;
    }
    public Boolean Insert(String sql){
        try{
            ps = ConnectDB.getConnection().prepareStatement(sql);
            ps.execute(sql);
            //Conexao.closeConnection();
            return true;
        }catch(SQLException u ){
            System.out.println(u);
            return false;        
        }        
    }
    public int UpdateDelete(String sql) {
        int RegAft = 0;
        try{
            ps = ConnectDB.getConnection().prepareStatement(sql);  
            RegAft = ps.executeUpdate(sql);
            //Conexao.closeConnection();
            return RegAft;
        }catch(SQLException u ){
            System.out.println(u);
            return RegAft;        
        }
    }
}
