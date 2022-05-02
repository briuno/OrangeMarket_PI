//teste
package Telas;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.Timer;

public class Cadastro extends javax.swing.JFrame {
    
    Login login;
    Cadastro cadastro;
    
    public Cadastro() {
        initComponents();
        this.IniciarTela();
    }
    
    private void IniciarTela(){
        Date datatual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        lblData.setText(formato.format(datatual));
        Timer timer = new Timer (0, new hora());
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtConfSenha = new javax.swing.JTextField();
        lblFinalizarCad = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblConfSenha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblErr = new javax.swing.JLabel();
        chkTermos = new javax.swing.JCheckBox();
        logo = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNome.setToolTipText("Nome");
        txtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));
        txtNome.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtNome.setMinimumSize(new java.awt.Dimension(15, 26));
        txtNome.setPreferredSize(new java.awt.Dimension(15, 26));
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 260, 30));

        txtUser.setToolTipText("Usuário");
        txtUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));
        txtUser.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtUser.setMinimumSize(new java.awt.Dimension(15, 26));
        txtUser.setPreferredSize(new java.awt.Dimension(15, 26));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 260, 30));

        txtEmail.setToolTipText("E-mail");
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));
        txtEmail.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtEmail.setMinimumSize(new java.awt.Dimension(15, 26));
        txtEmail.setPreferredSize(new java.awt.Dimension(15, 26));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 260, 30));

        txtSenha.setToolTipText("Senha");
        txtSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));
        txtSenha.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtSenha.setMinimumSize(new java.awt.Dimension(15, 26));
        txtSenha.setPreferredSize(new java.awt.Dimension(15, 26));
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 260, 30));

        txtConfSenha.setToolTipText("Confirmação de senha");
        txtConfSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));
        txtConfSenha.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtConfSenha.setMinimumSize(new java.awt.Dimension(15, 26));
        txtConfSenha.setPreferredSize(new java.awt.Dimension(15, 26));
        txtConfSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfSenhaFocusLost(evt);
            }
        });
        jPanel1.add(txtConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 260, 30));

        lblFinalizarCad.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblFinalizarCad.setForeground(new java.awt.Color(255, 255, 255));
        lblFinalizarCad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFinalizarCad.setText("Finalizar cadastro");
        lblFinalizarCad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFinalizarCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFinalizarCadMouseClicked(evt);
            }
        });
        lblFinalizarCad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblFinalizarCadKeyPressed(evt);
            }
        });
        jPanel1.add(lblFinalizarCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 300, -1));

        lblNome.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        lblUser.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Usuário");
        jPanel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 20));

        lblEmail.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("E-mail");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 20));

        lblSenha.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");
        jPanel1.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, 20));

        lblConfSenha.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblConfSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblConfSenha.setText("Confirmar senha");
        jPanel1.add(lblConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, 20));

        lblHora.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 110, 20));

        lblData.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 20));

        lblErr.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblErr.setForeground(new java.awt.Color(1, 89, 41));
        lblErr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblErr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 300, 20));

        chkTermos.setForeground(new java.awt.Color(1, 89, 41));
        chkTermos.setText("Li e concordo com os Termos.");
        chkTermos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkTermos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chkTermos.setNextFocusableComponent(lblFinalizarCad);
        jPanel1.add(chkTermos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 260, -1));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensIcons/logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 300, -1));

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensIcons/Fundo.png"))); // NOI18N
        jPanel1.add(imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        if (txtNome.getText().isEmpty()){
            lblErr.setText("Digite seu nome");
        }
        else {
            lblErr.setText("");
        }
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if (txtUser.getText().isEmpty()) {
            lblErr.setText("Digite um nome de usuário");
        }
        else {
            lblErr.setText("");
        }
    }//GEN-LAST:event_txtUserFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if (txtEmail.getText().isEmpty()) {
            lblErr.setText("Digite um e-mail válido");
        }
        else {
            lblErr.setText("");
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
        if (txtSenha.getText().isEmpty()) {
            lblErr.setText("Digite uma senha");
        }
        else {
            lblErr.setText("");
        }
    }//GEN-LAST:event_txtSenhaFocusLost

    private void txtConfSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfSenhaFocusLost
        if (txtConfSenha.getText().isEmpty()){
            lblErr.setText("Confirme sua senha");
        }
        else {
            if(!txtSenha.getText().equals(txtConfSenha.getText())){
                lblErr.setText("Senhas não conferem");
            }
            else {
                lblErr.setText("");
            }
        }
    }//GEN-LAST:event_txtConfSenhaFocusLost

    private void lblFinalizarCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinalizarCadMouseClicked
        if (txtNome.getText().isEmpty()) {
        } else {
            if (txtEmail.getText().isEmpty()) {
            } else {
                if (txtSenha.getText().isEmpty()) {
                } else {
                    if (txtConfSenha.getText().isEmpty()) {
                    } else {
                        if (!txtSenha.getText().equals(txtConfSenha.getText())) {
                        } else {
                            if (!chkTermos.isSelected()) {
                            } else {
                                login = new Login();
                                login.setVisible(true);
                                login.Login(txtEmail.getText(), txtConfSenha.getText());
                                dispose();
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_lblFinalizarCadMouseClicked

    private void lblFinalizarCadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblFinalizarCadKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            if (txtNome.getText().isEmpty()) {
            } else {
                if (txtEmail.getText().isEmpty()) {
                } else {
                    if (txtSenha.getText().isEmpty()) {
                    } else {
                        if (txtConfSenha.getText().isEmpty()) {
                        } else {
                            if (!txtSenha.getText().equals(txtConfSenha.getText())) {
                            } else {
                                if (!chkTermos.isSelected()) {
                                } else {
                                    login = new Login();
                                    login.setVisible(true);
                                    login.Login(txtEmail.getText(), txtConfSenha.getText());
                                    dispose();
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_lblFinalizarCadKeyPressed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkTermos;
    private javax.swing.JLabel imagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConfSenha;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblErr;
    private javax.swing.JLabel lblFinalizarCad;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtConfSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    class hora implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            lblHora.setText(String.format("%1$tH:%1$tM", now));
        }
    }
}
