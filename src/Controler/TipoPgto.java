
package Controler;

import DataBase.ComandDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DataBase.ConnectDB;
import Objects.ObjTPPgto;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TipoPgto {
    private final ComandDB ExecComand = new ComandDB();
    private PreparedStatement ps = null;
    private String sql = null;
    private ResultSet result = null;
    public ResultSet select(int CodTpPgto) {
        sql = "SELECT * FROM TipoPagamento";              
        if (CodTpPgto != 0 ) {
            sql = sql + " WHERE CodTpPgto  = " + CodTpPgto + ";";
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
	public Boolean Insert(int CodTpPgto,String DescTPPgto){
        sql = "INSERT INTO TipoPagamento(CodTpPgto,DescTPPgto)  VALUES(" + CodTpPgto + ",'" + DescTPPgto + "');";        
        return ExecComand.Insert(sql);
    }
    public int Update(int CodTpPgto,String DescTPPgto) {
    		if(DescTPPgto.equals("")!= true){
                    sql = "UPDATE TipoPagamento SET ";
                    sql = sql + "DescTPPgto = '" + DescTPPgto +"'";
                    sql = sql + " Where CodTpPgto = " + CodTpPgto + ";";
                    return ExecComand.UpdateDelete(sql);
		}else{
			return 1;
		}
    }
    public int Delete(int CodTpPgto){        
        sql = "DELETE FROM TipoPagamento WHERE CodTpPgto = " + CodTpPgto + ";";        
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
    public ObjTPPgto CarregaDadosFormulario(int CodTpPgto){    
        ObjTPPgto TPPgtoList = new ObjTPPgto();         
        ResultSet rsDadosForm = null;        
        try {
            rsDadosForm = select(CodTpPgto);
            if (rsDadosForm.next()){
                String codigo = rsDadosForm.getString(1);
                String descricao = rsDadosForm.getString(2);

                TPPgtoList.setCodigo(codigo);
                TPPgtoList.setDesc(descricao);                     
            }
        } catch (SQLException ex) {
            System.out.println(ex);   
        }
        return TPPgtoList;
    }  
}
