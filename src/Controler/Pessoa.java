
package Controler;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DataBase.ConnectDB;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Objects.ObjPessoa;

public class Pessoa {
    private final ConnectDB Conexao = new ConnectDB();
    private PreparedStatement ps = null;
    private String sql = null;
    private ResultSet result = null;
    public ResultSet select(int CodigoPessoa,int TipoPessoa) {
        sql = "SELECT Pessoa.CodPessoa, Pessoa.Nome," +
              " TipoPessoa.DescTP AS TipoPessoa, " +
              " Pessoa.PesJuridicaSN, Pessoa.CNPJ_CPF," +
              " Pessoa.Logradouro, Pessoa.Numero,"+
              " Pessoa.Complemento, Pessoa.Bairro,"+
              " Pessoa.Municipio, Pessoa.UF, Pessoa.CEP"+
              " FROM Pessoa" +
              " INNER JOIN TipoPessoa" +
              " ON Pessoa.CodTpPes = TipoPessoa.CodTpPes" +
              " WHERE";
      
        if (CodigoPessoa != 0 ) {
            sql = sql + " CodPessoa = " + CodigoPessoa ;
        }
        if (TipoPessoa != 0 ) {
            if(CodigoPessoa != 0){sql = sql + " AND ";} 
            sql = sql + " TipoProduto = " + TipoPessoa;
        }
        //if(sql.substring(sql.length()-4,  sql.length()).equals("WHERE")==true){
        if((CodigoPessoa == 0 )&& (TipoPessoa == 0 )){
            sql = sql.substring(0,sql.length()-5);
        }
        sql = sql + ";";
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
    public Boolean Insert(int CodPessoa,String Nome,int CodTpPes, String PesJuridicaSN,
            int CNPJ_CPF, String Logradouro, String Numero, String Complemento,
            String Bairro, String Municipio, String UF, int CEP){
        
        sql = "INSERT INTO Produto(CodPessoa,Nome,CodTpPes,PesJuridicaSN,CNPJ_CPF,"
            + "Logradouro,Numero,Complemento,Bairro,Municipio,UF,CEP)"
            + " VALUES(" + CodPessoa + ",'" + Nome + "'," + CodTpPes + ",'" + PesJuridicaSN + "'"
            + "," + CNPJ_CPF + ",'" + Logradouro + "','" + Numero + "','" + Complemento + "'"
            + ",'" + Bairro + "','"+ Municipio + "','" + UF + "'," + CEP + ");";
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
    public int Update(int CodPessoa,String Nome, String Logradouro, String Numero,
    String Complemento, String Bairro, String Municipio, String UF, int CEP) {
        int RegAft = 0;
    
        sql = "UPDATE Produto SET ";
        if(Nome.equals("")!= true){sql = sql + "Nome = '" + Nome +"',";}
        if(Logradouro.equals("")!= true){sql = sql + "Logradouro = '" + Logradouro +"',";}
        if(Numero.equals("")!= true){sql = sql + "Numero = '" + Numero +"',";}
        if(Bairro.equals("")!= true){sql = sql + "Bairro = '" + Bairro +"',";}
        if(Municipio.equals("")!= true){sql = sql + "Municipio = '" + Municipio +"',";}
        if(UF.equals("")!= true){sql = sql + "PesJuridicaSN = '" + UF +"',";}
        if(CEP!= 0){sql = sql + "CEP = " + CEP +",";}        
      
        sql = sql.substring(0, sql.length()-1);
        sql = sql + " Where CodProduto = " + CodPessoa + ";";
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
    public int Delete(int CodPessoa){
        int RegAft = 0;
        sql = "DELETE FROM Pessoa WHERE CodPessoa = " + CodPessoa + ";";
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
    public void PreencherTabela(JTable modeloTable,boolean Limpar){ 
        ResultSet rsTabela; 
        DefaultTableModel Val = (DefaultTableModel) modeloTable.getModel();
        if (Limpar == true){ Val.setNumRows(0); }
        rsTabela = select(0,0);
        if (rsTabela != null){
            try {                
                while (rsTabela.next()){
                     
                    String CodPessoa = rsTabela.getString(1);
                    String Nome = rsTabela.getString(2);
                    String CodTpPes = rsTabela.getString(3);
                    String CNPJ_CPF = rsTabela.getString(4);

                    Val.addRow(new String[] {CodPessoa, Nome,CodTpPes, CNPJ_CPF});
                }          
            } catch (SQLException ex) {
                System.err.println(ex);   
            }
        }
    }
    public ObjPessoa CarregaDadosFormulario(int CodProd){    
        ObjPessoa PesList = new ObjPessoa(); 
        
        ResultSet rsDadosForm = null;        
        try {
            rsDadosForm = select(CodProd,0);
            if (rsDadosForm.next()){
               
                String CodPessoa = rsDadosForm.getString(1);
                String Nome = rsDadosForm.getString(2);
                String CodTpPes = rsDadosForm.getString(3);
                String PesJuridicaSN = rsDadosForm.getString(4);
                String CNPJ_CPF = rsDadosForm.getString(5);
                String Logradouro = rsDadosForm.getString(6);
                String Numero = rsDadosForm.getString(7);
                String Complemento = rsDadosForm.getString(8);
                String Bairro = rsDadosForm.getString(9);
                String Municipio = rsDadosForm.getString(10);
                String UF = rsDadosForm.getString(11);
                String CEP = rsDadosForm.getString(12);

                PesList.setCodigo(CodPessoa);
                PesList.setNome(Nome);
                PesList.setTipoPessoa(CodTpPes);
                PesList.setPesJuridicaSN(PesJuridicaSN);
                PesList.setCNPJ_CPF(CNPJ_CPF);
                PesList.setLogradouro(Logradouro); 
                PesList.setNumero(Numero);
                PesList.setComplemento(Complemento);
                PesList.setBairro(Bairro);
                PesList.setMunicipio(Municipio);
                PesList.setUf(UF);
                PesList.setCEP(CEP);
            }
        } catch (SQLException ex) {
            System.out.println(ex);   
        }
        return PesList;
    }
}
