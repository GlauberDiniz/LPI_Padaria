
package Controler;
import DataBase.ComandDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import Objects.ObjProduto;

public class Produto {
    private String sql = null;
    private final ResultSet result = null;
    private final ComandDB ExecComand = new ComandDB();
    public Produto(){    
    }        
    public ResultSet select(int CodigoProd,boolean relacionado) {
        if(relacionado){
            sql = "SELECT Produto.CodProduto, Produto.DescProduto, " +
                  " TipoProduto.DescTP AS TipoProduto, Produto.VLRCompra, " +
                  " Produto.VLRVenda, Pessoa.Nome AS Fornecedor FROM Produto " +
                  " INNER JOIN TipoProduto " +
                  " ON Produto.CodTpProd = TipoProduto.CodTpProd " +
                  " INNER JOIN Pessoa " +
                  " ON Produto.CodFornecedor = Pessoa.CodPessoa ";
        }else{
            sql = "SELECT * FROM Produto ";
        }    
        if (CodigoProd != 0 ) {
            sql = sql + " WHERE CodProduto = " + CodigoProd + " ORDER BY Produto.CodProduto;";
        }else{
            sql = sql + " ORDER BY Produto.CodProduto;";
        }
        return ExecComand.select(sql);
    }
    public Boolean Insert(int CodProd,String DescProd,int CodTpProd,
    double VLRCompra,double VLRVenda,int CodFornecedor){
        
        sql = "INSERT INTO Produto(CodProduto,DescProduto,CodTpProd,VLRCompra,VLRVenda,CodFornecedor)"
                +" VALUES(" + CodProd + ",'" + DescProd + "'," + CodTpProd + ",'" 
                            + VLRCompra +"','" + VLRVenda + "'," + CodFornecedor + ");";
        
        return ExecComand.Insert(sql);
    }
    public int Update(int CodigoProd,String DescProd,int CodTpProd,
    double VLRCompra,double VLRVenda,int CodFornecedor) {
        
        sql = "UPDATE Produto SET ";
        if(DescProd.equals("")!= true){sql = sql + "DescProduto = '" + DescProd +"',";}
        if(CodTpProd!= 0){sql = sql + "CodTpProd = " + CodTpProd +",";}
        if(VLRCompra!= 0){sql = sql + "VLRCompra = '" + VLRCompra +"',";}
        if(VLRVenda!= 0){sql = sql + "VLRVenda = '" + VLRVenda +"',";}
        if(CodFornecedor!= 0){sql = sql + "CodFornecedor = " + CodFornecedor +",";}
        sql = sql.substring(0, sql.length()-1);
        sql = sql + " Where CodProduto = " + CodigoProd + ";";

        return ExecComand.UpdateDelete(sql);
    }
    public int Delete(int CodigoProd){
        
        sql = "DELETE FROM Produto WHERE CodProduto = " + CodigoProd + ";";
        
        return ExecComand.UpdateDelete(sql);
    }
    public void PreencherTabela(JTable modeloTable,boolean Limpar){ 
        ResultSet rsTabela; 
        DefaultTableModel Val = (DefaultTableModel) modeloTable.getModel();
        if (Limpar == true){ Val.setNumRows(0); }
        rsTabela = select(0,true);
        if (rsTabela != null){
            try {                
                while (rsTabela.next()){
                    String codigo = rsTabela.getString(1);
                    String descricao = rsTabela.getString(2);
                    String Tipo = rsTabela.getString(3);
                    String Valor_Compra = rsTabela.getString(4);
                    String Valor_Venda = rsTabela.getString(5);
                    String Fornecedor = rsTabela.getString(6);

                    Val.addRow(new String[] {codigo, descricao,Tipo, Valor_Compra, Valor_Venda, Fornecedor});
                }          
            } catch (SQLException ex) {
                System.err.println(ex);   
            }
        }
    }
    public ObjProduto CarregaDadosFormulario(int CodProd){    
        ObjProduto ProdList = new ObjProduto(); 
        
        ResultSet rsDadosForm = null;        
        try {
            rsDadosForm = select(CodProd,false);
            if (rsDadosForm.next()){
                String codigo = rsDadosForm.getString(1);
                String descricao = rsDadosForm.getString(2);
                String Tipo = rsDadosForm.getString(3);
                String Valor_Compra = rsDadosForm.getString(4);
                String Valor_Venda = rsDadosForm.getString(5);
                String Fornecedor = rsDadosForm.getString(6);

                ProdList.setCodProd(codigo);
                ProdList.setDescProd(descricao);
                ProdList.setCodTpProd(Tipo);
                ProdList.setVLRCompra(Valor_Compra);
                ProdList.setVLRVenda(Valor_Venda);
                ProdList.setCodFornecedor(Fornecedor);             
                
            }
        } catch (SQLException ex) {
            System.out.println(ex);   
        }
        return ProdList;
    }
}