package visao;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import visao.Mensagem;
import modelo.Ferramenta;

public class TelaFerramenta extends javax.swing.JFrame {

    private Ferramenta objetoferramenta;

    public TelaFerramenta() {
        initComponents();
        this.objetoferramenta = new Ferramenta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBVoltar = new javax.swing.JButton();
        JBCadastrarFerramenta = new javax.swing.JButton();
        JBGerenciarFerramenta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JTFFerramenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFMarca = new javax.swing.JTextField();
        JTFPreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        JBCadastrarFerramenta.setText("Cadastrar ferramenta");
        JBCadastrarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarFerramentaActionPerformed(evt);
            }
        });

        JBGerenciarFerramenta.setText("GerenciarFerramenta");
        JBGerenciarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGerenciarFerramentaActionPerformed(evt);
            }
        });

        jLabel1.setText("Ferramenta");

        jLabel2.setText("Marca");

        jLabel3.setText("Preço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBCadastrarFerramenta)
                        .addGap(27, 27, 27)
                        .addComponent(JBGerenciarFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(JBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFFerramenta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFMarca))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCadastrarFerramenta)
                    .addComponent(JBGerenciarFerramenta))
                .addGap(18, 18, 18)
                .addComponent(JBVoltar)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_JBVoltarActionPerformed

    private void JBGerenciarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGerenciarFerramentaActionPerformed
         GerenciarFerramenta objeto = new GerenciarFerramenta();
        objeto.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_JBGerenciarFerramentaActionPerformed

    private void JBCadastrarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarFerramentaActionPerformed
       try {
            // recebendo e validando dados da interface gráfica.
            String ferramenta = "";
            String marca = "";
            double preco = 0;

            if (this.JTFFerramenta.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                ferramenta = this.JTFFerramenta.getText();
            }

            if (this.JTFMarca.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                marca = this.JTFMarca.getText();
            }

            if (this.JTFPreco.getText().length() <= 0) {
                throw new Mensagem("Idade deve ser número e maior que zero.");
            } else {
                preco = Integer.parseInt(this.JTFPreco.getText());
            }

            // envia os dados para o Controlador cadastrar
            if (this.objetoferramenta.insertFerramentaBD(ferramenta, marca, preco)) {
                JOptionPane.showMessageDialog(null, "Ferramenta Cadastrado com Sucesso!");
                // limpa campos da interface
                this.JTFFerramenta.setText("");
                this.JTFMarca.setText("");
                this.JTFPreco.setText("");
            }
       } catch (Mensagem ex) {
            Logger.getLogger(TelaFerramenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JBCadastrarFerramentaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrarFerramenta;
    private javax.swing.JButton JBGerenciarFerramenta;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JTextField JTFFerramenta;
    private javax.swing.JTextField JTFMarca;
    private javax.swing.JTextField JTFPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
