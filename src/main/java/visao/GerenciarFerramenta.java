package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Ferramenta;
import visao.Mensagem;


public class GerenciarFerramenta extends javax.swing.JFrame {

    private Ferramenta objetoferramenta;
    
    public GerenciarFerramenta() {
        initComponents();
        this.objetoferramenta = new Ferramenta(); // carrega objetoamigo de amigo
        this.carregaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableFerramenta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTFFerramenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFMarca = new javax.swing.JTextField();
        JTFPreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JBRemoverFerramenta = new javax.swing.JToggleButton();
        JBAtualizarFerramenta = new javax.swing.JToggleButton();
        JBVoltar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ferramenta", "Marca", "Preço"
            }
        ));
        JTableFerramenta.setToolTipText("");
        JTableFerramenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableFerramentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableFerramenta);

        jLabel1.setText("Ferramenta");

        JTFFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFerramentaActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca");

        JTFPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPrecoActionPerformed(evt);
            }
        });

        jLabel3.setText("Preço");

        JBRemoverFerramenta.setText("Remover Ferramenta");
        JBRemoverFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverFerramentaActionPerformed(evt);
            }
        });

        JBAtualizarFerramenta.setText("Atualizar Ferramenta");
        JBAtualizarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtualizarFerramentaActionPerformed(evt);
            }
        });

        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JBAtualizarFerramenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBRemoverFerramenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFFerramenta)
                    .addComponent(JBRemoverFerramenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFMarca)
                    .addComponent(JBAtualizarFerramenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JBVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTableFerramentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableFerramentaMouseClicked
        if (this.JTableFerramenta.getSelectedRow() != -1) {
            String ferramenta = this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 1).toString();
            String preco = this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 2).toString();
            String marca = this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 3).toString();

            this.JTFFerramenta.setText(ferramenta);
            this.JTFPreco.setText(preco);
            this.JTFMarca.setText(marca);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTableFerramentaMouseClicked

    private void JTFPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPrecoActionPerformed

    private void JTFFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFerramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaActionPerformed

    private void JBRemoverFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverFerramentaActionPerformed
        try {
            //
            int id = 0;
            if (this.JTableFerramenta.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro Selecione a ferramenta para Apagar");
            } else {
                id = Integer.parseInt(this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 0).toString());
            }

            // 
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar esta ferramenta ?");

            if (respostaUsuario == 0) {// clicou em SIM
                // envia os dados para o Aluno processar
                if (this.objetoferramenta.deleteFerramentaBD(id)) {
                    // limpa os campos
                    this.JTFFerramenta.setText("");
                    this.JTFMarca.setText("");
                    this.JTFPreco.setText("");

                    JOptionPane.showMessageDialog(rootPane, "Ferramenta Apagado com Sucesso!");
                }
            }
            // atualiza a tabela.
            System.out.println(this.objetoferramenta.getMinhaLista().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            //
            carregaTabela();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JBRemoverFerramentaActionPerformed

    private void JBAtualizarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtualizarFerramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBAtualizarFerramentaActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_JBVoltarActionPerformed

   public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTableFerramenta.getModel();
        modelo.setNumRows(0); // Posiciona na primeira linha da tabela
        // Carrega a lista de objetos aluno
        ArrayList<Ferramenta> minhaLista = objetoferramenta.getMinhaLista();
        for (Ferramenta a : minhaLista) {
            modelo.addRow(new Object[]{
                a.getFerramenta(),
                a.getMarca(),
                a.getPreco(),
                });
            }}
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
            java.util.logging.Logger.getLogger(GerenciarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton JBAtualizarFerramenta;
    private javax.swing.JToggleButton JBRemoverFerramenta;
    private javax.swing.JToggleButton JBVoltar;
    private javax.swing.JTextField JTFFerramenta;
    private javax.swing.JTextField JTFMarca;
    private javax.swing.JTextField JTFPreco;
    private javax.swing.JTable JTableFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
