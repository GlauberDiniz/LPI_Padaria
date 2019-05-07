
package Layout.Pessoa;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Controler.Pessoa;
import Controler.TipoPessoa;
import DataBase.ComandDB;
import Objects.ObjPessoa;

public class JFMGerenciarPessoa extends javax.swing.JDialog  {
    int RegAfct = 0,TpOp = 0;
    boolean ExecSucess = false;
    ObjPessoa PesForm = new ObjPessoa();
    public JFMGerenciarPessoa(boolean modal,int codProd,int Op) {
        initComponents();
        this.setModal(modal);
        CarregarCombos();
        setTpOp(Op);
        if(codProd!=0){
            PreencherFormulario(codProd);
        }else{
            PreencherCodigo();
        }
        MostrarOp(Op);        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtbCancelar = new javax.swing.JToggleButton();
        jtbConfirmar = new javax.swing.JToggleButton();
        JLTituloGereciamentoPes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbTipoPessoa = new javax.swing.JComboBox<>();
        jtfCodigoPes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfLogradouro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbPesJur = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtfMunicipio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfUF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfComplemento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfCEP = new javax.swing.JTextField();
        jtfCNPJ_CPF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(520, 400));
        setResizable(false);

        jtbCancelar.setText("Cancelar");
        jtbCancelar.setName("JTBCancelar"); // NOI18N
        jtbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbCancelarActionPerformed(evt);
            }
        });

        jtbConfirmar.setText("Confirmar");
        jtbConfirmar.setName("JTBConfirmar"); // NOI18N
        jtbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbConfirmarActionPerformed(evt);
            }
        });

        JLTituloGereciamentoPes.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        JLTituloGereciamentoPes.setText("Gerenciamento de pessoas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Código:");

        jcbTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Nome:");

        jLabel3.setText("Tipo:");

        jLabel4.setText("Logradouro:");

        jLabel5.setText("Numero:");

        jLabel6.setText("Pessoa Juridica:");

        jcbPesJur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2" }));

        jLabel7.setText("Municipio:");

        jLabel8.setText("UF:");

        jLabel9.setText("Complemento:");

        jLabel10.setText("Bairro:");

        jLabel11.setText("CEP:");

        jLabel12.setText("CNPJ / CPF:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNome)
                            .addComponent(jtfCodigoPes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbPesJur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCNPJ_CPF))
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jtfUF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtfCEP))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jtfBairro)
                                            .addComponent(jtfMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 65, Short.MAX_VALUE))
                                    .addComponent(jtfLogradouro))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfCodigoPes))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jcbPesJur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtfCNPJ_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jtfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jtfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jtfUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        jtfCodigoPes.getAccessibleContext().setAccessibleName("");
        jtfNome.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLTituloGereciamentoPes, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jtbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtbConfirmar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTituloGereciamentoPes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtbCancelar)
                    .addComponent(jtbConfirmar))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void setTpOp(int Op){
	this.TpOp = Op;
    }
    private int getTpOp(){
        return TpOp;
    } 
    private void MostrarOp(int Op){
        jcbTipoPessoa.enable();
        jcbPesJur.enable();
        jtfCNPJ_CPF.enable();
        
        switch(Op){
            case 1:
                JLTituloGereciamentoPes.setText("Alterar Produto");
                jcbTipoPessoa.disable();
                jcbPesJur.disable();
                jtfCNPJ_CPF.disable();
                break;
            case 2:
                JLTituloGereciamentoPes.setText("Incluir Produto");
                break;
            case 3:
                JLTituloGereciamentoPes.setText("Excluir Produto");
                break;
            default:
                JLTituloGereciamentoPes.setText("Gerenciar Produto");
        }       
    }
    private void jtbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbConfirmarActionPerformed
        
        int CodPessoa = Integer.parseInt(jtfCodigoPes.getText());
        String Nome = "";
        int CodTpPes = 0;
        String PesJuridicaSN = "";
        int CNPJ_CPF = 0;
        String Logradouro = "";
        String Numero = "";
        String Complemento = "";
        String Bairro = "";
        String Municipio = "";
        String UF = "";
        int CEP = 0;
        int OP = getTpOp();
        
        //Atualizar-Inserir 
        if (( OP == 1 ) || (OP == 2)){
            if(jtfNome.getText().equalsIgnoreCase(PesForm.getCodigo()) == false){
                Nome = jtfNome.getText(); 
            }
            if (jcbTipoPessoa.getModel().getSelectedItem().toString().substring(0, 1).equalsIgnoreCase(PesForm.getTipoPessoa()) == false){
                CodTpPes = Integer.parseInt(jcbTipoPessoa.getModel().getSelectedItem().toString().substring(0, 1));
            }
            if (jcbPesJur.getModel().getSelectedItem().toString().equalsIgnoreCase(PesForm.getPesJuridicaSN()) == false){
                PesJuridicaSN = jcbPesJur.getModel().getSelectedItem().toString();
            } 
            if (jtfCNPJ_CPF.getText().equalsIgnoreCase(PesForm.getCNPJ_CPF()) == false){
                CNPJ_CPF = Integer.parseInt(jtfCNPJ_CPF.getText());
            }
            if (jtfLogradouro.getText().equalsIgnoreCase(PesForm.getLogradouro()) == false){
                Logradouro = jtfLogradouro.getText();
            }
            if (jtfNumero.getText().equalsIgnoreCase(PesForm.getNumero()) == false){
                Numero = jtfNumero.getText();
            }
            if (jtfComplemento.getText().equalsIgnoreCase(PesForm.getComplemento()) == false){
                Complemento = jtfComplemento.getText();
            }
            if (jtfBairro.getText().equalsIgnoreCase(PesForm.getBairro()) == false){
                Bairro = jtfBairro.getText();
            }
            if (jtfMunicipio.getText().equalsIgnoreCase(PesForm.getMunicipio()) == false){
                Municipio = jtfMunicipio.getText();
            }
            if (jtfUF.getText().equalsIgnoreCase(PesForm.getUf()) == false){
                UF = jtfUF.getText();
            }            
            if (jtfCEP.getText().equalsIgnoreCase(PesForm.getCEP()) == false){
                CEP = Integer.parseInt(jtfCEP.getText());
            } 
        }
        switch (OP){
            case 1: //Atualizar
                RegAfct = AtualizarProdutos(CodPessoa,Nome, Logradouro,Numero,Complemento,Bairro,Municipio,UF,CEP);
                if(RegAfct > 0){
                    JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao atualizar o produto. \nContate o administrador.");
                }
                break;
            case 2: //Inserir
                ExecSucess = IncluirProdutos(CodPessoa,Nome,CodTpPes,PesJuridicaSN,CNPJ_CPF,Logradouro,Numero,Complemento,Bairro,Municipio,UF,CEP);
                if(ExecSucess == true){
                    JOptionPane.showMessageDialog(null, "Inclusão realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao inserir o produto. \nContate o administrador.");
                }
                break;
            case 3: //Excluir
                RegAfct = DeletarProdutos(CodPessoa);
                if(RegAfct > 0){
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o produto. \nContate o administrador.");
                }
                break;
            case 0: 
                break;
            default:
                JOptionPane.showMessageDialog(null, "teste");
                break;
        }
        dispose();
    }//GEN-LAST:event_jtbConfirmarActionPerformed
    private void jtbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbCancelarActionPerformed
       dispose();
    }//GEN-LAST:event_jtbCancelarActionPerformed
    private void CarregarCombos() {
        ResultSet Sql  = null;
        int TotalRegs = 0; 
        jcbTipoPessoa.removeAllItems();
        try{
            Sql = BuscarTpPessoa(0);
            Sql.last();
            TotalRegs = Sql.getRow();        
            Sql.first();
            for(int i = 1; i < TotalRegs; i++){
                String Cod = Sql.getString(1);
                String Desc = Sql.getString(2);
                jcbTipoPessoa.addItem(Cod +" - "+ Desc);
                Sql.next();
            }            
        }catch (SQLException ex) {
            System.out.println(ex);   
        }
        jcbPesJur.removeAllItems();
        jcbPesJur.addItem("Sim");
        jcbPesJur.addItem("Não");        
    }
    private static boolean IncluirProdutos(int CodPessoa,String Nome,int CodTpPes, String PesJuridicaSN,
            int CNPJ_CPF, String Logradouro, String Numero, String Complemento,
            String Bairro, String Municipio, String UF, int CEP){        
        Pessoa Tabela = new Pessoa();     
        return Tabela.Insert(CodPessoa, Nome, CodTpPes, PesJuridicaSN, CNPJ_CPF, Logradouro, Numero, Complemento, Bairro, Municipio, UF, CEP);
    }
    private static int AtualizarProdutos(int CodPessoa,String Nome,
            String Logradouro, String Numero, String Complemento,
            String Bairro, String Municipio, String UF, int CEP){        
        Pessoa Tabela = new Pessoa();     
        return Tabela.Update(CodPessoa,Nome,Logradouro,Numero,Complemento,Bairro,Municipio,UF,CEP);
    }
    private static int DeletarProdutos(int CodProd){        
        Pessoa Tabela = new Pessoa();     
        return Tabela.Delete(CodProd);
    }
    private static ResultSet BuscarTpPessoa(int CodPes){        
        TipoPessoa Tabela = new TipoPessoa();     
        return Tabela.select(CodPes);
    }
    private void PreencherFormulario(int CodProd){    
        Pessoa PesDB = new Pessoa();     
        //ResultSet rsDadosForm = null; 
        
        PesForm = PesDB.CarregaDadosFormulario(CodProd);
        if (PesForm != null ){
            jtfCodigoPes.setText(PesForm.getCodigo());
            jtfNome.setText(PesForm.getNome());
            jtfCNPJ_CPF.setText(PesForm.getCNPJ_CPF());
            jtfLogradouro.setText(PesForm.getLogradouro());                
            jtfNumero.setText(PesForm.getNumero());            
            jcbTipoPessoa.setSelectedIndex(IndexValorCombo(PesForm.getTipoPessoa(),1));
            jcbPesJur.setSelectedIndex(IndexValorCombo(PesForm.getPesJuridicaSN(),2));
            jtfBairro.setText(PesForm.getBairro());
            jtfMunicipio.setText(PesForm.getMunicipio());
            jtfUF.setText(PesForm.getUf());
            jtfCEP.setText(PesForm.getCEP());
        }
    }
    private void PreencherCodigo(){
        ComandDB Tabela = new ComandDB();     
        jtfCodigoPes.setText(Tabela.GerarCodigo("Pessoa")); 
        jtfCodigoPes.isDisplayable();
    }
    private int IndexValorCombo(String Valor,int combo ){
        int totVal = 0;
        int indexVal = 0;
        switch (combo){            
            case 1:
                totVal = jcbTipoPessoa.getItemCount();
                for (int i = 1;i < totVal; i++){
                    jcbTipoPessoa.setSelectedIndex(i);
                    if(jcbTipoPessoa.getModel().getSelectedItem().toString().substring(0, 1).equalsIgnoreCase(Valor)==true){
                       indexVal = i; 
                    }
                }
                break;
            case 2:
                totVal = jcbPesJur.getItemCount();
                for (int i = 1;i < totVal; i++){
                    jcbPesJur.setSelectedIndex(i);
                    if(jcbPesJur.getModel().getSelectedItem().toString().substring(0, 1).equalsIgnoreCase(Valor)==true){
                       indexVal = i; 
                    }
                }
                break;
            default:
                indexVal = 0;                
        }
        return indexVal;
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFMGerenciarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMGerenciarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMGerenciarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMGerenciarPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMGerenciarPessoa(true,0,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLTituloGereciamentoPes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbPesJur;
    private javax.swing.JComboBox<String> jcbTipoPessoa;
    private javax.swing.JToggleButton jtbCancelar;
    private javax.swing.JToggleButton jtbConfirmar;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JTextField jtfCEP;
    private javax.swing.JTextField jtfCNPJ_CPF;
    private javax.swing.JTextField jtfCodigoPes;
    private javax.swing.JTextField jtfComplemento;
    private javax.swing.JTextField jtfLogradouro;
    private javax.swing.JTextField jtfMunicipio;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfUF;
    // End of variables declaration//GEN-END:variables
}
