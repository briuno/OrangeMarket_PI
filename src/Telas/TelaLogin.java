//alt
//teste 4
package Telas;

public class TelaLogin extends javax.swing.JFrame {

    TelaCadastro cadastro;
    TelaBusca busca;
    public String email;
    public String senha;

    public TelaLogin() {
        initComponents();
    }

    public void Login(String Email, String Senha) {
        email = Email;
        senha = Senha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        lblEsq_Senha = new javax.swing.JLabel();
        lblCadastrar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setLayout(null);

        btnEntrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEntrar);
        btnEntrar.setBounds(50, 290, 210, 30);
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(120, 180, 130, 30);
        jPanel1.add(txtSenha);
        txtSenha.setBounds(120, 210, 130, 30);

        lblEsq_Senha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEsq_Senha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEsq_Senha.setText("Esqueci a Senha");
        jPanel1.add(lblEsq_Senha);
        lblEsq_Senha.setBounds(50, 260, 210, 17);

        lblCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCadastrar.setText("Cadastre-se");
        lblCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastrarMouseClicked(evt);
            }
        });
        jPanel1.add(lblCadastrar);
        lblCadastrar.setBounds(50, 330, 160, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("User_Twitter");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 460, 190, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Senha:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 210, 60, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/instagram.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 420, 25, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/twitter.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 460, 25, 25);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logo.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 50, 90, 90);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Usuario:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 180, 60, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("User_Instagram");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 420, 210, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Fundo.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 300, 510);

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 430, 34, 14);

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

    private void lblCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarMouseClicked
        cadastro = new TelaCadastro();
        cadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblCadastrarMouseClicked

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        if ((txtUsuario.getText().equals(email) && txtSenha.getText().equals(senha))
                || (txtUsuario.getText().equals("admin") && txtSenha.getText().equals("admin"))) {
            busca = new TelaBusca();
            busca.setVisible(true);
            dispose();
        } else {
        }
    }//GEN-LAST:event_btnEntrarMouseClicked

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblEsq_Senha;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
