
package Controler;

import DataBase.ComandDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DataBase.ConnectDB;
import Objects.ObjTPPessoa;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TipoPessoa {
    private final ComandDB ExecComand = new ComandDB();
    private PreparedStatement ps = null;
    private String sql = null;
    private ResultSet result = null;
    public ResultSet select(int CodTpPes) {
        sql = "SELECT * FROM TipoPessoa";              
        if (CodTpPes != 0 ) {
            sql = sql + " WHERE CodTpPes  = " + CodTpPes + ";";
        }else{
            sql = sql + ";";
        }
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
	public Boolean Insert(int CodTpPes,String DescTP){
        sql = "INSERT INTO TipoPessoa(CodTpPes,DescTP)  VALUES(" + CodTpPes + ",'" + DescTP + "');";        
        return ExecComand.Insert(sql);
    }
    public int Update(int CodTpPes,String DescTP) {
    		if(DescTP.equals("")!= true){
                    sql = "UPDATE TipoPessoa SET ";
                    sql = sql + "DescTP = '" + DescTP +"'";
                    sql = sql + " Where CodTpPes = " + CodTpPes + ";";
                    return ExecComand.UpdateDelete(sql);
		}else{
			return 1;
		}
    }
    public int Delete(int CodTpPes){        
        sql = "DELETE FROM TipoPessoa WHERE CodTpPes = " + CodTpPes + ";";        
        return ExecComand.UpdateDelete(sql);
    }
    public void PreencherTabela(JTable modeloTable,boolean Limpar){ 
        ResultSet rsTabela; 
        DefaultTableModel Val = (DefaultTableModel) modeloTable.getModel();
        if (Limpar == true){ Val.setNumRows(0); }
        		rsTabela = select(0);
        if (rsTabela != null){
            try {                
                while (rsTabela.next()){
                    String codigo = rsTabela.getString(1);
                    String descricao = rsTabela.getString(2);
                    Val.addRow(new String[] {codigo, descricao});
                }          
            } catch (SQLException ex) {
                System.err.println(ex);   
            }
        }
    }
    public ObjTPPessoa CarregaDadosFormulario(int CodTpPes){    
        ObjTPPessoa TPPesList = new ObjTPPessoa();         
        ResultSet rsDadosForm = null;        
        try {
            rsDadosForm = select(CodTpPes);
            if (rsDadosForm.next()){
                String codigo = rsDadosForm.getString(1);
                String descricao = rsDadosForm.getString(2);

                TPPesList.setCodigo(codigo);
                TPPesList.setDesc(descricao);                     
            }
        } catch (SQLException ex) {
            System.out.println(ex);   
        }
        return TPPesList;
    }  
}
