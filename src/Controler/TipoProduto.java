
package Controler;

import DataBase.ComandDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DataBase.ConnectDB;
import Objects.ObjTPProduto;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TipoProduto {
    private final ComandDB ExecComand = new ComandDB();
    private PreparedStatement ps = null;
    private String sql = null;
    private ResultSet result = null;
    public ResultSet select(int CodTpProd) {
        sql = "SELECT * FROM TipoProduto";              
        if (CodTpProd != 0 ) {
            sql = sql + " WHERE CodTpProd = " + CodTpProd + ";";
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
    public Boolean Insert(int CodTpProd,String DescTP){
        sql = "INSERT INTO TipoProduto(CodTpProd,DescTP)  VALUES(" + CodTpProd + ",'" + DescTP + "');";        
        return ExecComand.Insert(sql);
    }
    public int Update(int CodTpProd,String DescTP) {
    		if(DescTP.equals("")!= true){
	        sql = "UPDATE TipoProduto SET ";
	       	sql = sql + "DescTP = '" + DescTP +"'";
	        sql = sql + " Where CodTpProd = " + CodTpProd + ";";
	        return ExecComand.UpdateDelete(sql);
		}else{
			return 0;
		}
    }
    public int Delete(int CodTpProd){        
        sql = "DELETE FROM TipoProduto WHERE CodTpProd = " + CodTpProd + ";";        
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
    public ObjTPProduto CarregaDadosFormulario(int CodProd){    
        ObjTPProduto TPProdList = new ObjTPProduto();         
        ResultSet rsDadosForm = null;        
        try {
            rsDadosForm = select(CodProd);
            if (rsDadosForm.next()){
                String codigo = rsDadosForm.getString(1);
                String descricao = rsDadosForm.getString(2);

                TPProdList.setCodigo(codigo);
                TPProdList.setDesc(descricao);                     
            }
        } catch (SQLException ex) {
            System.out.println(ex);   
        }
        return TPProdList;
    }          
}
