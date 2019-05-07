
package Controler;

import DataBase.ComandDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DataBase.ConnectDB;
import Objects.ObjCartaoControleVenda;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CartaoControleVenda {
    private final ComandDB ExecComand = new ComandDB();
    private PreparedStatement ps = null;
    private String sql = null;
    private ResultSet result = null;
    public ResultSet select(int CodCard) {
        sql = "SELECT * FROM CartaoControle";              
        if (CodCard != 0 ) {
            sql = sql + " WHERE CodCard = " + CodCard + ";";
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
    public Boolean Insert(int CodCard,String CardAtivoSN){
        sql = "INSERT INTO CartaoControle(CodCard,CardAtivoSN,DtCadastro)  VALUES(" + CodCard + ", '" + CardAtivoSN +"', CURRENT_DATE());";        
        return ExecComand.Insert(sql);
    }
    public int Update(int CodCard,String CardAtivoSN) {
    		if(CardAtivoSN.equals("")!= true){
	        sql = "UPDATE CartaoControle SET ";
	       	sql = sql + "CardAtivoSN = '" + CardAtivoSN +"',";
			sql = sql + "DtCadastro =  CURRENT_DATE()";
	        sql = sql + " Where CodCard = " + CodCard + ";";
	        return ExecComand.UpdateDelete(sql);
		}else{
			return 0;
		}
    }
    public int Delete(int CodCard){        
        sql = "DELETE FROM CartaoControle WHERE CodCard = " + CodCard + ";";        
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
                    String AtivoSN = rsTabela.getString(2);
                    String dtCad = rsTabela.getString(3);
                    Val.addRow(new String[] {codigo,AtivoSN, dtCad});
                }          
            } catch (SQLException ex) {
                System.err.println(ex);   
            }
        }
    }
    public ObjCartaoControleVenda CarregaDadosFormulario(int CodProd){    
        ObjCartaoControleVenda CarContVD = new ObjCartaoControleVenda();         
        ResultSet rsDadosForm = null;        
        try {
            rsDadosForm = select(CodProd);
            if (rsDadosForm.next()){
                String codigo = rsDadosForm.getString(1);
                String ativoSN = rsDadosForm.getString(2);
                String dtCad = rsDadosForm.getString(3);

                CarContVD.setCodigo(codigo);
                CarContVD.setAtivoSN(ativoSN);    
		CarContVD.setDtCad(dtCad);                 
            }
        } catch (SQLException ex) {
            System.out.println(ex);   
        }
        return CarContVD;
    }          
}
