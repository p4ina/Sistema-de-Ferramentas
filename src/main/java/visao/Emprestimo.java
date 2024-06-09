package visao;
//importação necessária
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Amigo;
import dao.AmigoDAO;
import modelo.Ferramenta;
import visao.TelaAmigo;
import visao.TelaFerramenta;
import visao.RelatorioAmigo;
import visao.RelatorioFerramenta;
import visao.RelatorioEmprestimo;

public class Emprestimo extends javax.swing.JFrame {
//interface gráfica do empréstimo
    private AmigoDAO objetoAmigo;
    //declaração de um objeto(amigo DAO) para manipulação de dados amigos
    AmigoDAO amigoDAO = new AmigoDAO();
    //construtor da classe empréstimo
    public Emprestimo() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        JBVoltar = new javax.swing.JButton();
        JCAmigo = new javax.swing.JComboBox<>();
        JCFerramenta = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JBEmprestar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JTFDataDeDevolucao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFDataDoEmprestimo = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JBRelatorioAmigo = new javax.swing.JMenuItem();
        JBRelatorioEmprestimo = new javax.swing.JMenuItem();
        JBRelatorioFerramenta = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        JCAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCAmigoActionPerformed(evt);
            }
        });

        JCFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCFerramentaActionPerformed(evt);
            }
        });

        jLabel1.setText("Amigo");

        jLabel2.setText("Ferramenta");

        JBEmprestar.setText("Emprestar");

        jLabel3.setText("Data de Devolução");

        JTFDataDoEmprestimo.setText("Data do Emprestimo");

        jMenu1.setText("Relatórios");

        JBRelatorioAmigo.setText("Relatório Amigo");
        JBRelatorioAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRelatorioAmigoActionPerformed(evt);
            }
        });
        jMenu1.add(JBRelatorioAmigo);

        JBRelatorioEmprestimo.setText("Relatório Empréstimo");
        JBRelatorioEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRelatorioEmprestimoActionPerformed(evt);
            }
        });
        jMenu1.add(JBRelatorioEmprestimo);

        JBRelatorioFerramenta.setText("Relatório Ferramenta");
        JBRelatorioFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRelatorioFerramentaActionPerformed(evt);
            }
        });
        jMenu1.add(JBRelatorioFerramenta);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBVoltar)
                        .addGap(357, 357, 357))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(JTFDataDeDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JCAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(JBEmprestar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JCFerramenta, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(JTFDataDoEmprestimo)
                                    .addGap(27, 27, 27))))
                        .addGap(42, 42, 42)))
                .addComponent(jLabel4)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBEmprestar)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFDataDeDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTFDataDoEmprestimo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(JBVoltar)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBVoltarActionPerformed
     //botão voltar
    private void JBRelatorioAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRelatorioAmigoActionPerformed
      RelatorioAmigo tela = new RelatorioAmigo();
        tela.setVisible(true);
      //botão relatorio amigo
    }//GEN-LAST:event_JBRelatorioAmigoActionPerformed

    private void JBRelatorioEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRelatorioEmprestimoActionPerformed
        RelatorioEmprestimo tela = new RelatorioEmprestimo();
        tela.setVisible(true);
        //botão relatorio emprestimo
    }//GEN-LAST:event_JBRelatorioEmprestimoActionPerformed

    private void JBRelatorioFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRelatorioFerramentaActionPerformed
        RelatorioFerramenta tela = new RelatorioFerramenta();
        tela.setVisible(true);
        //botao relatorio Ferramenta
    }//GEN-LAST:event_JBRelatorioFerramentaActionPerformed

    private void JCAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCAmigoActionPerformed

        // Configuração do combobox 
    }//GEN-LAST:event_JCAmigoActionPerformed

    private void JCFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCFerramentaActionPerformed
        // Configuração do combobox 
    }//GEN-LAST:event_JCFerramentaActionPerformed


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
            java.util.logging.Logger.getLogger(Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEmprestar;
    private javax.swing.JMenuItem JBRelatorioAmigo;
    private javax.swing.JMenuItem JBRelatorioEmprestimo;
    private javax.swing.JMenuItem JBRelatorioFerramenta;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JComboBox<String> JCAmigo;
    private javax.swing.JComboBox<String> JCFerramenta;
    private javax.swing.JTextField JTFDataDeDevolucao;
    private javax.swing.JLabel JTFDataDoEmprestimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
