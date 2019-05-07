
package Layout.TPPessoa;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Controler.TipoPessoa;
import DataBase.ComandDB;
import Objects.ObjTPPessoa;

public class JFMGerenciarTPPessoa extends javax.swing.JDialog  {
    int RegAfct = 0,TpOp = 0;
    boolean ExecSucess = false;
    ObjTPPessoa TPPesForm = new ObjTPPessoa();
    public JFMGerenciarTPPessoa(boolean modal,int codTPPes,int Op) {
        initComponents();
        this.setModal(modal);
        setTpOp(Op);
        if(codTPPes!=0){
            PreencherFormulario(codTPPes);
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
        jtfCodigoPes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfDescricao = new javax.swing.JTextField();

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

        jLabel2.setText("Descrição:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodigoPes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(206, 206, 206))
        );

        jtfCodigoPes.getAccessibleContext().setAccessibleName("");
        jtfDescricao.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLTituloGereciamentoPes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        switch(Op){
            case 1:
                JLTituloGereciamentoPes.setText("Alterar Tipo Pessoa");
                 break;
            case 2:
                JLTituloGereciamentoPes.setText("Incluir Tipo Pessoa");
                break;
            case 3:
                JLTituloGereciamentoPes.setText("Excluir Tipo Pessoa");
                break;
            default:
                JLTituloGereciamentoPes.setText("Gerenciar Tipo Pessoa");
        }       
    }
    private void jtbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbConfirmarActionPerformed
        
        int CodTPPessoa = Integer.parseInt(jtfCodigoPes.getText());
        String Desc = "";
        int OP = getTpOp();
        
        //Atualizar-Inserir 
        if (( OP == 1 ) || (OP == 2)){
            if(jtfDescricao.getText().equalsIgnoreCase(TPPesForm.getCodigo()) == false){
                Desc = jtfDescricao.getText(); 
            }
        }
        switch (OP){
            case 1: //Atualizar
                RegAfct = AtualizarTPPessoa(CodTPPessoa,Desc);
                if(RegAfct > 0){
                    JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao atualizar o tipo de pessoa. \nContate o administrador.");
                }
                break;
            case 2: //Inserir
                ExecSucess = IncluirTPPessoa(CodTPPessoa,Desc);
                if(ExecSucess == true){
                    JOptionPane.showMessageDialog(null, "Inclusão realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao inserir o tipo de pessoa. \nContate o administrador.");
                }
                break;
            case 3: //Excluir
                RegAfct = DeletarTPPessoa(CodTPPessoa);
                if(RegAfct > 0){
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o tipo de pessoa. \nContate o administrador.");
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
    private static boolean IncluirTPPessoa(int CodTPPessoa,String Desc){        
        TipoPessoa Tabela = new TipoPessoa();     
        return Tabela.Insert(CodTPPessoa, Desc);
    }
    private static int AtualizarTPPessoa(int CodTPPessoa,String Desc){        
        TipoPessoa Tabela = new TipoPessoa();     
        return Tabela.Update(CodTPPessoa,Desc);
    }
    private static int DeletarTPPessoa(int CodProd){        
        TipoPessoa Tabela = new TipoPessoa();     
        return Tabela.Delete(CodProd);
    }
    private static ResultSet BuscarTPPessoa(int CodTPPes){        
        TipoPessoa Tabela = new TipoPessoa();     
        return Tabela.select(CodTPPes);
    }
    private void PreencherFormulario(int CodTPPes){    
        TipoPessoa TPPesDB = new TipoPessoa();     
        //ResultSet rsDadosForm = null; 
        
        TPPesForm = TPPesDB.CarregaDadosFormulario(CodTPPes);
        if (TPPesForm != null ){
            jtfCodigoPes.setText(TPPesForm.getCodigo());
            jtfDescricao.setText(TPPesForm.getDesc());
        }
    }
    private void PreencherCodigo(){
        ComandDB Tabela = new ComandDB();     
        jtfCodigoPes.setText(Tabela.GerarCodigo("TipoProduto")); 
        jtfCodigoPes.isDisplayable();
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
            java.util.logging.Logger.getLogger(JFMGerenciarTPPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMGerenciarTPPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMGerenciarTPPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMGerenciarTPPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMGerenciarTPPessoa(true,0,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLTituloGereciamentoPes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jtbCancelar;
    private javax.swing.JToggleButton jtbConfirmar;
    private javax.swing.JTextField jtfCodigoPes;
    private javax.swing.JTextField jtfDescricao;
    // End of variables declaration//GEN-END:variables
}
