package Telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TelaCadastro extends javax.swing.JFrame {
    
    TelaLogin inicial;
    
    public TelaCadastro() {
        initComponents();
        this.AbrirTela();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtNovaSenha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        chkTermos = new javax.swing.JCheckBox();
        lblVoltar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        Fundo_Cad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        txtNome.setPreferredSize(new java.awt.Dimension(7, 30));
        jPanel1.add(txtNome);
        txtNome.setBounds(140, 120, 110, 30);
        jPanel1.add(txtEmail);
        txtEmail.setBounds(140, 150, 110, 30);
        jPanel1.add(txtSenha);
        txtSenha.setBounds(140, 180, 110, 30);

        txtNovaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNovaSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNovaSenha);
        txtNovaSenha.setBounds(140, 210, 110, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 120, 70, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Email:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 150, 70, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Senha:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 180, 70, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Repitir senha:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 210, 100, 20);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCadastrar);
        btnCadastrar.setBounds(50, 290, 184, 30);

        chkTermos.setText("Li e concordo com os termos de serviço");
        chkTermos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chkTermos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTermosActionPerformed(evt);
            }
        });
        jPanel1.add(chkTermos);
        chkTermos.setBounds(13, 250, 270, 23);

        lblVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/voltar.png"))); // NOI18N
        lblVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltarMouseClicked(evt);
            }
        });
        jPanel1.add(lblVoltar);
        lblVoltar.setBounds(20, 30, 30, 30);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setForeground(new java.awt.Color(255, 153, 0));

        lblData.setBackground(new java.awt.Color(255, 255, 255));
        lblData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sinal-wifi.png"))); // NOI18N
        lblHora.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 300, 20);

        Fundo_Cad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Fundo.png"))); // NOI18N
        Fundo_Cad.setText("jLabel5");
        jPanel1.add(Fundo_Cad);
        Fundo_Cad.setBounds(0, 0, 300, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AbrirTela() {        
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        lblData.setText(formato.format(dataSistema));
        
        Timer timer = new Timer(1000, new hora());
        timer.start();
    }    
    private void txtNovaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNovaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNovaSenhaActionPerformed

    private void chkTermosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTermosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTermosActionPerformed

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite seu nome!");
        } else {
            if (txtEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite seu Email!");
            } else {
                if (txtSenha.getText().isEmpty() || !txtSenha.getText().equals(txtNovaSenha.getText())) {
                    JOptionPane.showMessageDialog(null, "Suas senhas não estão iguais!");
                } else {
                    if (txtNovaSenha.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Repita a senha!");
                    } else {
                        if (!chkTermos.isSelected()) {
                            JOptionPane.showMessageDialog(null, "Você precisa aceitar os \ntermos e condiçoes para continuar");
                        } else {
                            inicial = new TelaLogin();
                            inicial.setVisible(true);
                            inicial.Login(txtEmail.getText(), txtNovaSenha.getText());
                            dispose();
                        }
                    }
                }
            }
        }
        
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void lblVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarMouseClicked
        inicial = new TelaLogin();
        inicial.setVisible(true);        
        dispose();
    }//GEN-LAST:event_lblVoltarMouseClicked
    
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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo_Cad;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JCheckBox chkTermos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNovaSenha;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            lblHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }
}
