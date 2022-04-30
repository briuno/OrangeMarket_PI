package Telas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.Timer;

public class Login extends javax.swing.JFrame {
    
    Cadastro cadastro;
    Busca busca;
    public String email;
    public String senha;
    
    public Login() {
        initComponents();
        this.IniciarTela();
    }
    
    public void Login(String Email, String Senha){
        email = Email;
        senha = Senha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblError = new javax.swing.JLabel();
        lblEntrar = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblOrange = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblCadastrar = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OrangeMarket v1.0");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblError.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        lblError.setForeground(new java.awt.Color(1, 89, 41));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 300, 20));

        lblEntrar.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lblEntrar.setForeground(new java.awt.Color(255, 255, 255));
        lblEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrar.setText("Entrar");
        lblEntrar.setNextFocusableComponent(lblCadastrar);
        lblEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEntrarMouseClicked(evt);
            }
        });
        lblEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblEntrarKeyPressed(evt);
            }
        });
        jPanel1.add(lblEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 300, -1));

        lblHora.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 110, 20));

        lblData.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 20));

        lblOrange.setFont(new java.awt.Font("aremat font", 0, 36)); // NOI18N
        lblOrange.setForeground(new java.awt.Color(1, 89, 41));
        lblOrange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrange.setText("Orange Market");
        jPanel1.add(lblOrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 300, 50));

        lblSenha.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");
        jPanel1.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 20));

        lblCadastrar.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(1, 89, 41));
        lblCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastrar.setText("Cadastre-se gratuitamente.");
        lblCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastrarMouseClicked(evt);
            }
        });
        lblCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblCadastrarKeyPressed(evt);
            }
        });
        jPanel1.add(lblCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 300, 20));

        lblUser.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Usuário");
        jPanel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, 20));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Não possui login?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 300, -1));

        txtSenha.setToolTipText("Senha");
        txtSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));
        txtSenha.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtSenha.setMinimumSize(new java.awt.Dimension(15, 26));
        txtSenha.setNextFocusableComponent(lblEntrar);
        txtSenha.setPreferredSize(new java.awt.Dimension(15, 26));
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 260, -1));

        txtUser.setToolTipText("Nome de usuário");
        txtUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));
        txtUser.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtUser.setMinimumSize(new java.awt.Dimension(15, 26));
        txtUser.setNextFocusableComponent(txtSenha);
        txtUser.setPreferredSize(new java.awt.Dimension(15, 26));
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 260, -1));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensIcons/logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 300, -1));

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensIcons/Fundo.png"))); // NOI18N
        jPanel1.add(imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarMouseClicked
        cadastro = new Cadastro();
        cadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblCadastrarMouseClicked

    private void lblCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblCadastrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            cadastro = new Cadastro();
            cadastro.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_lblCadastrarKeyPressed

    private void lblEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseClicked
        if ((txtUser.getText().equals(email) && txtSenha.getText().equals(senha))
            || (txtUser.getText().equals("admin") && txtSenha.getText().equals("admin"))) {
            busca = new Busca();
            busca.setVisible(true);
            dispose();
        } else if (txtUser.getText().isEmpty()) {
            lblError.setText("Digite Login e Senha! ");
        }
        else{
            lblError.setText("Credenciais invalidas ");
        }
    }//GEN-LAST:event_lblEntrarMouseClicked

    private void lblEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblEntrarKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){    
            if ((txtUser.getText().equals(email) && txtSenha.getText().equals(senha))
                || (txtUser.getText().equals("admin") && txtSenha.getText().equals("admin"))) {
                busca = new Busca();
                busca.setVisible(true);
                dispose();
            } else if (txtUser.getText().isEmpty()) {
                lblError.setText("Digite Login e Senha! ");
            }
            else{
                lblError.setText("Credenciais invalidas ");
            }
        }
    }//GEN-LAST:event_lblEntrarKeyPressed
    
    
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblOrange;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
    
    private void IniciarTela(){
        Date datatual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        lblData.setText(formato.format(datatual));
        Timer timer = new Timer (0, new hora());
        timer.start();
    }
    
    class hora implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e ){
            Calendar now = Calendar.getInstance();
            lblHora.setText(String.format("%1$tH:%1$tM", now));
        }
    }  
}
