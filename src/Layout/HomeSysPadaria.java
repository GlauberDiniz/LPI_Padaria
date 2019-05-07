package Layout;
import Layout.CartaoControleVenda.JFCartaoControleVenda;
import Layout.Produto.JFProduto;
import Layout.TPPessoa.JFTipoPessoa;
import Layout.Pessoa.JFPessoa;
import Layout.Estoque.JFEstoque;
import Layout.TPPgto.JFTipoPgto;
import Layout.TPProduto.JFTipoProduto;
import javax.swing.JOptionPane;
import DataBase.ComandDB;
public class HomeSysPadaria extends javax.swing.JFrame {
    private final ComandDB ExecComand = new ComandDB();    
    
    public HomeSysPadaria() { 
        initComponents();
        VerificaConexao();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmFluxo = new javax.swing.JMenu();
        jmiRegistarVenda = new javax.swing.JMenuItem();
        jmiFinalizarVenda = new javax.swing.JMenuItem();
        jmProd = new javax.swing.JMenu();
        jmEst = new javax.swing.JMenu();
        jmPes = new javax.swing.JMenu();
        jmPar = new javax.swing.JMenu();
        jmiGerenciarTPPes = new javax.swing.JMenuItem();
        GerenciarTPProd = new javax.swing.JMenuItem();
        jmiGerenciarTPPgto = new javax.swing.JMenuItem();
        jmiGerenciarCartaoControle = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SysPadaria");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jmFluxo.setText("Fluxo");
        jmFluxo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmFluxo.setMaximumSize(new java.awt.Dimension(71, 40));
        jmFluxo.setName("JMFlux"); // NOI18N
        jmFluxo.setPreferredSize(new java.awt.Dimension(71, 20));

        jmiRegistarVenda.setText("Registrar");
        jmiRegistarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistarVendaActionPerformed(evt);
            }
        });
        jmFluxo.add(jmiRegistarVenda);

        jmiFinalizarVenda.setText("Finalizar");
        jmiFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFinalizarVendaActionPerformed(evt);
            }
        });
        jmFluxo.add(jmiFinalizarVenda);

        jMenuBar1.add(jmFluxo);

        jmProd.setText("Produto");
        jmProd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmProd.setMaximumSize(new java.awt.Dimension(71, 40));
        jmProd.setName("JMProd"); // NOI18N
        jmProd.setPreferredSize(new java.awt.Dimension(71, 20));
        jmProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmProdMouseClicked(evt);
            }
        });
        jmProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProdActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmProd);

        jmEst.setText("Estoque");
        jmEst.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmEst.setMaximumSize(new java.awt.Dimension(71, 40));
        jmEst.setName("JMEst"); // NOI18N
        jmEst.setPreferredSize(new java.awt.Dimension(71, 20));
        jmEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmEstMouseClicked(evt);
            }
        });
        jmEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEstActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmEst);

        jmPes.setText("Pessoas");
        jmPes.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmPes.setMaximumSize(new java.awt.Dimension(71, 40));
        jmPes.setName("JMPes"); // NOI18N
        jmPes.setPreferredSize(new java.awt.Dimension(71, 20));
        jmPes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmPesMouseClicked(evt);
            }
        });
        jmPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPesActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmPes);

        jmPar.setText("Parâmentro");
        jmPar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmPar.setMaximumSize(new java.awt.Dimension(71, 40));
        jmPar.setName("JMPar"); // NOI18N
        jmPar.setPreferredSize(new java.awt.Dimension(71, 20));

        jmiGerenciarTPPes.setText("Tipo Pessoa");
        jmiGerenciarTPPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGerenciarTPPesActionPerformed(evt);
            }
        });
        jmPar.add(jmiGerenciarTPPes);

        GerenciarTPProd.setText("Tipo Produto");
        GerenciarTPProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarTPProdActionPerformed(evt);
            }
        });
        jmPar.add(GerenciarTPProd);

        jmiGerenciarTPPgto.setText("Tipo Pagamento");
        jmiGerenciarTPPgto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGerenciarTPPgtoActionPerformed(evt);
            }
        });
        jmPar.add(jmiGerenciarTPPgto);

        jmiGerenciarCartaoControle.setText("Cartão de Controle");
        jmiGerenciarCartaoControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGerenciarCartaoControleActionPerformed(evt);
            }
        });
        jmPar.add(jmiGerenciarCartaoControle);

        jMenuBar1.add(jmPar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jmiGerenciarTPPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGerenciarTPPesActionPerformed
        new JFTipoPessoa().setVisible(true);
    }//GEN-LAST:event_jmiGerenciarTPPesActionPerformed

    private void GerenciarTPProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciarTPProdActionPerformed
        new JFTipoProduto().setVisible(true);
    }//GEN-LAST:event_GerenciarTPProdActionPerformed

    private void jmiRegistarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistarVendaActionPerformed
        JOptionPane.showMessageDialog(null, "Programa ainda não implementado.");
    }//GEN-LAST:event_jmiRegistarVendaActionPerformed

    private void jmiFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFinalizarVendaActionPerformed
        JOptionPane.showMessageDialog(null, "Programa ainda não implementado.");
    }//GEN-LAST:event_jmiFinalizarVendaActionPerformed

    private void jmiGerenciarTPPgtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGerenciarTPPgtoActionPerformed
        new JFTipoPgto().setVisible(true);
    }//GEN-LAST:event_jmiGerenciarTPPgtoActionPerformed

    private void jmiGerenciarCartaoControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGerenciarCartaoControleActionPerformed
        new JFCartaoControleVenda().setVisible(true);
    }//GEN-LAST:event_jmiGerenciarCartaoControleActionPerformed

    private void jmEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEstActionPerformed
    }//GEN-LAST:event_jmEstActionPerformed

    private void jmProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProdActionPerformed
  
    }//GEN-LAST:event_jmProdActionPerformed

    private void jmPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPesActionPerformed
    }//GEN-LAST:event_jmPesActionPerformed

    private void jmProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmProdMouseClicked
        new JFProduto().setVisible(true);
    }//GEN-LAST:event_jmProdMouseClicked

    private void jmEstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmEstMouseClicked
        new JFEstoque().setVisible(true);
    }//GEN-LAST:event_jmEstMouseClicked

    private void jmPesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmPesMouseClicked
        new JFPessoa().setVisible(true);
    }//GEN-LAST:event_jmPesMouseClicked
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
            java.util.logging.Logger.getLogger(HomeSysPadaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeSysPadaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeSysPadaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeSysPadaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeSysPadaria().setVisible(true);
            }
        });
    }
    public final void VerificaConexao(){
        if (ExecComand.TestarConexão() != true){
            JOptionPane.showMessageDialog(null, "Problema ao conectar ao banco de dados. \n"
                    + "Verifique se o servidor esta ativo.");
            System.exit(0);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GerenciarTPProd;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmEst;
    private javax.swing.JMenu jmFluxo;
    private javax.swing.JMenu jmPar;
    private javax.swing.JMenu jmPes;
    private javax.swing.JMenu jmProd;
    private javax.swing.JMenuItem jmiFinalizarVenda;
    private javax.swing.JMenuItem jmiGerenciarCartaoControle;
    private javax.swing.JMenuItem jmiGerenciarTPPes;
    private javax.swing.JMenuItem jmiGerenciarTPPgto;
    private javax.swing.JMenuItem jmiRegistarVenda;
    // End of variables declaration//GEN-END:variables
}
