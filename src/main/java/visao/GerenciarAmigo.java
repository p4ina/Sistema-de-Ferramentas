package visao;

import dao.AmigoDAO;
import dao.Conexao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import visao.Mensagem; 
import modelo.Amigo;

public class GerenciarAmigo extends javax.swing.JFrame {

    private Amigo objetoamigo;
    AmigoDAO amigoDAO = new AmigoDAO();

    public GerenciarAmigo() {
        initComponents();
        this.amigoDAO = new AmigoDAO(); // carrega objetoamigo de amigo
        this.getMinhaListaFerramentaDAO();
        Conexao conexao = new Conexao();
        Amigo amigo1 = new Amigo();
    ArrayList minhaLista = new ArrayList();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAmigos = new javax.swing.JTable();
        JBRemoverAmigo = new javax.swing.JButton();
        JBAtualizarAmigo = new javax.swing.JButton();
        JTFNome = new javax.swing.JTextField();
        JTFTelefone = new javax.swing.JTextField();
        JBVoltar = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTableAmigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone"
            }
        ));
        JTableAmigos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JTableAmigosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                JTableAmigosAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        JTableAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableAmigosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableAmigos);

        JBRemoverAmigo.setText("Remover Amigo");
        JBRemoverAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverAmigoActionPerformed(evt);
            }
        });

        JBAtualizarAmigo.setText("Atualizar Amigo");
        JBAtualizarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtualizarAmigoActionPerformed(evt);
            }
        });

        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });

        JTFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTelefoneActionPerformed(evt);
            }
        });

        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        jLabel2.setText("Telefone");

        jLabel3.setText("Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(JTFNome))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(JBAtualizarAmigo))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(JBRemoverAmigo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(JBRemoverAmigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(JBAtualizarAmigo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBVoltar)))
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAtualizarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtualizarAmigoActionPerformed
        try {
            // recebe e valida os dados da interface gráfica.
            int id = 0;
            String nome = "";
            String telefone = "";

            if (this.JTFNome.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFNome.getText();
            }

            if (this.JTFTelefone.getText().length() <= 0) {
                throw new Mensagem("telefone deve ser número e maior que zero.");
            } else {
                telefone = this.JTFTelefone.getText();
            }

            if (this.JTableAmigos.getSelectedRow() == -1) {
                throw new Mensagem("Primeiro Selecione um Amigo para Alterar");
            } else {
                id = Integer.parseInt(this.JTableAmigos.getValueAt(this.JTableAmigos.getSelectedRow(), 0).toString());
            }

            // envia os dados para o Aluno processar
            if (this.objetoamigo.updateAmigoBD(id, nome)) {
                // limpa os campos

                this.JTFNome.setText("");
                this.JTFTelefone.setText("");
                JOptionPane.showMessageDialog(null, "Amigo Alterado com Sucesso!");

            }
            // Exibe no console o aluno cadastrado
            System.out.println(this.amigoDAO.getMinhaListaAmigoDAO().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally {
            // atualiza a tabela
        amigoDAO.getMinhaListaAmigoDAO();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_JBAtualizarAmigoActionPerformed

    private void JTableAmigosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JTableAmigosAncestorAdded

        // TODO add your handling code here:
    }//GEN-LAST:event_JTableAmigosAncestorAdded

    private void JTableAmigosAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JTableAmigosAncestorMoved

        // TODO add your handling code here:
    }//GEN-LAST:event_JTableAmigosAncestorMoved

    private void JTableAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableAmigosMouseClicked
        if (this.JTableAmigos.getSelectedRow() != -1) {
            String nome = this.JTableAmigos.getValueAt(this.JTableAmigos.getSelectedRow(), 1).toString();
            String telefone = this.JTableAmigos.getValueAt(this.JTableAmigos.getSelectedRow(), 2).toString();
            
            this.JTFNome.setText(nome);
            this.JTFTelefone.setText(telefone);
        }
    }//GEN-LAST:event_JTableAmigosMouseClicked

    private void JBRemoverAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverAmigoActionPerformed
       String nome = JOptionPane.showInputDialog(null, "Nome:");
        String telefone = JOptionPane.showInputDialog(null, "Telefone:");
        Amigo amigo = new Amigo(nome, telefone);
        amigo.delAmigoDAO(WIDTH);
    }//GEN-LAST:event_JBRemoverAmigoActionPerformed

    private void JTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTelefoneActionPerformed

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNomeActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_JBVoltarActionPerformed

    public void getMinhaListaFerramentaDAO() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTableAmigos.getModel();
        modelo.setNumRows(0); // Posiciona na primeira linha da tabela
        // Carrega a lista de objetos aluno
        ArrayList<Amigo> minhaLista = amigoDAO.getMinhaListaAmigoDAO();
        for (Amigo a : minhaLista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getTelefone(),});
        }
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
            java.util.logging.Logger.getLogger(GerenciarAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAtualizarAmigo;
    private javax.swing.JButton JBRemoverAmigo;
    private javax.swing.JToggleButton JBVoltar;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFTelefone;
    private javax.swing.JTable JTableAmigos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
