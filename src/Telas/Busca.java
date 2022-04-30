package Telas;

import Back.Produtos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.Timer;

public class Busca extends javax.swing.JFrame {

    Produtos produtos;
    Cesto cesto;
    String[] prod1 = new String[5];
    String[] prod2 = new String[5];
    String[] prod3 = new String[5];
    String[] prod4 = new String[5];
    String[] prod5 = new String[5];

    public Busca() {
        initComponents();
        this.IniciarTela();
        pnlProd1.setVisible(false);
        pnlProd2.setVisible(false);
        pnlProd3.setVisible(false);
        pnlProd4.setVisible(false);
        lblMsg.setVisible(false);
    }

    private void IniciarTela() {
        Date datatual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        lblData.setText(formato.format(datatual));

        Timer timer = new Timer(0, new hora());
        timer.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        lblAdd = new javax.swing.JLabel();
        lblCesto = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        lblHora = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblMsg = new javax.swing.JLabel();
        pnlProd1 = new javax.swing.JPanel();
        lblProd1 = new javax.swing.JLabel();
        lblPreco1 = new javax.swing.JLabel();
        lblDesconto1 = new javax.swing.JLabel();
        lblMercado1 = new javax.swing.JLabel();
        lblDistancia1 = new javax.swing.JLabel();
        lblSemRes = new javax.swing.JLabel();
        checkProd1 = new javax.swing.JCheckBox();
        pnlProd2 = new javax.swing.JPanel();
        lblPreco2 = new javax.swing.JLabel();
        lblDesconto2 = new javax.swing.JLabel();
        lblMercado2 = new javax.swing.JLabel();
        lblDistancia2 = new javax.swing.JLabel();
        lblProd2 = new javax.swing.JLabel();
        checkProd2 = new javax.swing.JCheckBox();
        pnlProd3 = new javax.swing.JPanel();
        lblPreco3 = new javax.swing.JLabel();
        lblDesconto3 = new javax.swing.JLabel();
        lblMercado3 = new javax.swing.JLabel();
        lblDistancia3 = new javax.swing.JLabel();
        lblProd3 = new javax.swing.JLabel();
        checkProd3 = new javax.swing.JCheckBox();
        pnlProd4 = new javax.swing.JPanel();
        lblPreco4 = new javax.swing.JLabel();
        lblDesconto4 = new javax.swing.JLabel();
        lblMercado4 = new javax.swing.JLabel();
        lblDistancia4 = new javax.swing.JLabel();
        lblProd4 = new javax.swing.JLabel();
        checkProd4 = new javax.swing.JCheckBox();
        imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBuscar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(1, 89, 41));
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensIcons/lupa.png"))); // NOI18N
        lblBuscar.setText("Buscar");
        jPanel1.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 100, 30));

        txtBusca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        txtBusca.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBusca.setNextFocusableComponent(cbFiltro);
        txtBusca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscaFocusGained(evt);
            }
        });
        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaKeyPressed(evt);
            }
        });
        jPanel1.add(txtBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 280, 30));

        lblAdd.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblAdd.setForeground(new java.awt.Color(1, 89, 41));
        lblAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdd.setText("Adicionar");
        lblAdd.setNextFocusableComponent(lblBuscar);
        lblAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddMouseClicked(evt);
            }
        });
        jPanel1.add(lblAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 80, 20));

        lblCesto.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblCesto.setForeground(new java.awt.Color(1, 89, 41));
        lblCesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCesto.setText("Cesto");
        lblCesto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCesto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblCesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCestoMouseClicked(evt);
            }
        });
        jPanel1.add(lblCesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 90, 20));

        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Preço (menor p/ maior)", "Distancia (menor p/ maior)"}));
        cbFiltro.setBorder(null);
        jPanel1.add(cbFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 280, -1));

        lblHora.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 110, 20));

        lblData.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 20));

        lblMsg.setFont(new java.awt.Font("Liberation Sans", 3, 16)); // NOI18N
        lblMsg.setForeground(new java.awt.Color(255, 255, 255));
        lblMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMsg.setText("Adicionado com sucesso.");
        jPanel1.add(lblMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 300, 30));

        pnlProd1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        pnlProd1.setOpaque(false);
        pnlProd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlProd1MouseClicked(evt);
            }
        });
        pnlProd1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProd1.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lblProd1.setForeground(new java.awt.Color(255, 255, 255));
        lblProd1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProd1.setText("Produto 1");
        pnlProd1.add(lblProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, -1));

        lblPreco1.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblPreco1.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPreco1.setText("Preço");
        pnlProd1.add(lblPreco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, -1));

        lblDesconto1.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblDesconto1.setForeground(new java.awt.Color(255, 255, 255));
        lblDesconto1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDesconto1.setText("Desconto");
        pnlProd1.add(lblDesconto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, -1));

        lblMercado1.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblMercado1.setForeground(new java.awt.Color(255, 255, 255));
        lblMercado1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMercado1.setText("Mercado");
        pnlProd1.add(lblMercado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 120, -1));

        lblDistancia1.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblDistancia1.setForeground(new java.awt.Color(255, 255, 255));
        lblDistancia1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistancia1.setText("Distancia");
        pnlProd1.add(lblDistancia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 120, -1));

        lblSemRes.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lblSemRes.setForeground(new java.awt.Color(255, 255, 255));
        lblSemRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlProd1.add(lblSemRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 260, 20));
        pnlProd1.add(checkProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(pnlProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 280, 90));

        pnlProd2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        pnlProd2.setOpaque(false);
        pnlProd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlProd2MouseClicked(evt);
            }
        });
        pnlProd2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPreco2.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblPreco2.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPreco2.setText("Preço");
        pnlProd2.add(lblPreco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, -1));

        lblDesconto2.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblDesconto2.setForeground(new java.awt.Color(255, 255, 255));
        lblDesconto2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDesconto2.setText("Desconto");
        pnlProd2.add(lblDesconto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, -1));

        lblMercado2.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblMercado2.setForeground(new java.awt.Color(255, 255, 255));
        lblMercado2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMercado2.setText("Mercado");
        pnlProd2.add(lblMercado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 130, -1));

        lblDistancia2.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblDistancia2.setForeground(new java.awt.Color(255, 255, 255));
        lblDistancia2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistancia2.setText("Distancia");
        pnlProd2.add(lblDistancia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 130, -1));

        lblProd2.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lblProd2.setForeground(new java.awt.Color(255, 255, 255));
        lblProd2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProd2.setText("Produto 2");
        pnlProd2.add(lblProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, -1));
        pnlProd2.add(checkProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(pnlProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 280, 90));

        pnlProd3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        pnlProd3.setOpaque(false);
        pnlProd3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlProd3MouseClicked(evt);
            }
        });
        pnlProd3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPreco3.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblPreco3.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPreco3.setText("Preço");
        pnlProd3.add(lblPreco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, -1));

        lblDesconto3.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblDesconto3.setForeground(new java.awt.Color(255, 255, 255));
        lblDesconto3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDesconto3.setText("Desconto");
        pnlProd3.add(lblDesconto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, -1));

        lblMercado3.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblMercado3.setForeground(new java.awt.Color(255, 255, 255));
        lblMercado3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMercado3.setText("Mercado");
        pnlProd3.add(lblMercado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 120, -1));

        lblDistancia3.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblDistancia3.setForeground(new java.awt.Color(255, 255, 255));
        lblDistancia3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistancia3.setText("Distancia");
        pnlProd3.add(lblDistancia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 120, -1));

        lblProd3.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lblProd3.setForeground(new java.awt.Color(255, 255, 255));
        lblProd3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProd3.setText("Produto 3");
        pnlProd3.add(lblProd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, -1));
        pnlProd3.add(checkProd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(pnlProd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 280, 90));

        pnlProd4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        pnlProd4.setOpaque(false);
        pnlProd4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlProd4MouseClicked(evt);
            }
        });
        pnlProd4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPreco4.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblPreco4.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPreco4.setText("Preço");
        pnlProd4.add(lblPreco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, -1));

        lblDesconto4.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblDesconto4.setForeground(new java.awt.Color(255, 255, 255));
        lblDesconto4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDesconto4.setText("Desconto");
        pnlProd4.add(lblDesconto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, -1));

        lblMercado4.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblMercado4.setForeground(new java.awt.Color(255, 255, 255));
        lblMercado4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMercado4.setText("Mercado");
        pnlProd4.add(lblMercado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 120, -1));

        lblDistancia4.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblDistancia4.setForeground(new java.awt.Color(255, 255, 255));
        lblDistancia4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistancia4.setText("Distancia");
        pnlProd4.add(lblDistancia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 120, -1));

        lblProd4.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lblProd4.setForeground(new java.awt.Color(255, 255, 255));
        lblProd4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProd4.setText("Produto 4");
        pnlProd4.add(lblProd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, -1));

        checkProd4.setNextFocusableComponent(lblAdd);
        pnlProd4.add(checkProd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(pnlProd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 280, 90));

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensIcons/Fundo.png"))); // NOI18N
        jPanel1.add(imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlProd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProd1MouseClicked
        if (checkProd1.isSelected()) {
            checkProd1.setSelected(false);
        } else {
            checkProd1.setSelected(true);
        }
    }//GEN-LAST:event_pnlProd1MouseClicked

    private void pnlProd2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProd2MouseClicked
        if (checkProd2.isSelected()) {
            checkProd2.setSelected(false);
        } else {
            checkProd2.setSelected(true);
        }
    }//GEN-LAST:event_pnlProd2MouseClicked

    private void pnlProd3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProd3MouseClicked
        if (checkProd3.isSelected()) {
            checkProd3.setSelected(false);
        } else {
            checkProd3.setSelected(true);
        }
    }//GEN-LAST:event_pnlProd3MouseClicked

    private void pnlProd4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProd4MouseClicked
        if (checkProd4.isSelected()) {
            checkProd4.setSelected(false);
        } else {
            checkProd4.setSelected(true);
        }
    }//GEN-LAST:event_pnlProd4MouseClicked

    private void lblCestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCestoMouseClicked
        cesto = new Cesto();
        cesto.setVisible(true);
        cesto.Cesto(prod1, prod2, prod3, prod4, prod5);
        dispose();
    }//GEN-LAST:event_lblCestoMouseClicked

    private void txtBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String busca = txtBusca.getText().toLowerCase();
            produtos = new Produtos();

            if (busca.contains("chocolate") || busca.contains("bombom")) {
                this.Chocolate();
            } else if (busca.contains("arroz")) {
                this.Arroz();
            } else if (busca.contains("feijao") || busca.contains("feijão")) {
                this.Feijao();
            } else if (busca.contains("macarrao") || busca.contains("espaguete")) {
                this.Macarrao();
            } else if (busca.contains("monster") || busca.contains("energetico")) {
                this.Monster();
            } else {
                pnlProd1.setVisible(true);
                lblSemRes.setVisible(true);
                lblSemRes.setText("Nenhum produto encontrado");
                lblPreco1.setVisible(false);
                lblMercado1.setVisible(false);
                lblDistancia1.setVisible(false);
                lblDesconto1.setVisible(false);
                checkProd1.setVisible(false);
                lblProd1.setVisible(false);
                pnlProd2.setVisible(false);
                pnlProd3.setVisible(false);
                pnlProd4.setVisible(false);
            }
        }
    }//GEN-LAST:event_txtBuscaKeyPressed

    private void lblAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMouseClicked
        if (checkProd1.isSelected()) {
            if (prod1[0] == null) {
                prod1[0] = lblProd1.getText();
                prod1[1] = lblPreco1.getText();
                prod1[2] = lblMercado1.getText();
                prod1[3] = lblDesconto1.getText();
                prod1[4] = lblDistancia1.getText();
            } else if (prod1[0] != null && prod2[0] == null) {
                prod2[0] = lblProd1.getText();
                prod2[1] = lblPreco1.getText();
                prod2[2] = lblMercado1.getText();
                prod2[3] = lblDesconto1.getText();
                prod2[4] = lblDistancia1.getText();
            } else if (prod2[0] != null && prod3[0] == null) {
                prod3[0] = lblProd1.getText();
                prod3[1] = lblPreco1.getText();
                prod3[2] = lblMercado1.getText();
                prod3[3] = lblDesconto1.getText();
                prod3[4] = lblDistancia1.getText();
            } else if (prod3[0] != null && prod4[0] == null) {
                prod4[0] = lblProd1.getText();
                prod4[1] = lblPreco1.getText();
                prod4[2] = lblMercado1.getText();
                prod4[3] = lblDesconto1.getText();
                prod4[4] = lblDistancia1.getText();
            } else if (prod4[0] != null && prod5[0] == null) {
                prod5[0] = lblProd1.getText();
                prod5[1] = lblPreco1.getText();
                prod5[2] = lblMercado1.getText();
                prod5[3] = lblDesconto1.getText();
                prod5[4] = lblDistancia1.getText();
            }
        }

        if (checkProd2.isSelected()) {
            if (prod1[0] == null) {
                prod1[0] = lblProd2.getText();
                prod1[1] = lblPreco2.getText();
                prod1[2] = lblMercado2.getText();
                prod1[3] = lblDesconto2.getText();
                prod1[4] = lblDistancia2.getText();
            } else if (prod1[0] != null && prod2[0] == null) {
                prod2[0] = lblProd2.getText();
                prod2[1] = lblPreco2.getText();
                prod2[2] = lblMercado2.getText();
                prod2[3] = lblDesconto2.getText();
                prod2[4] = lblDistancia2.getText();
            } else if (prod2[0] != null && prod3[0] == null) {
                prod3[0] = lblProd2.getText();
                prod3[1] = lblPreco2.getText();
                prod3[2] = lblMercado2.getText();
                prod3[3] = lblDesconto2.getText();
                prod3[4] = lblDistancia2.getText();
            } else if (prod3[0] != null && prod4[0] == null) {
                prod3[0] = lblProd2.getText();
                prod3[1] = lblPreco2.getText();
                prod3[2] = lblMercado2.getText();
                prod3[3] = lblDesconto2.getText();
                prod3[4] = lblDistancia2.getText();
            } else if (prod4[0] != null && prod5[0] == null) {
                prod4[0] = lblProd2.getText();
                prod4[1] = lblPreco2.getText();
                prod4[2] = lblMercado2.getText();
                prod4[3] = lblDesconto2.getText();
                prod4[4] = lblDistancia2.getText();
            }
        }

        if (checkProd3.isSelected()) {
            if (prod1[0] == null) {
                prod1[0] = lblProd3.getText();
                prod1[1] = lblPreco3.getText();
                prod1[2] = lblMercado3.getText();
                prod1[3] = lblDesconto3.getText();
                prod1[4] = lblDistancia3.getText();
            } else if (prod1[0] == null && prod2[0] == null) {
                prod2[0] = lblProd3.getText();
                prod2[1] = lblPreco3.getText();
                prod2[2] = lblMercado3.getText();
                prod2[3] = lblDesconto3.getText();
                prod2[4] = lblDistancia3.getText();
            } else if (prod2[0] != null && prod3[0] == null) {
                prod3[0] = lblProd3.getText();
                prod3[1] = lblPreco3.getText();
                prod3[2] = lblMercado3.getText();
                prod3[3] = lblDesconto3.getText();
                prod3[4] = lblDistancia3.getText();
            } else if (prod3[0] != null && prod4[0] == null) {
                prod3[0] = lblProd3.getText();
                prod3[1] = lblPreco3.getText();
                prod3[2] = lblMercado3.getText();
                prod3[3] = lblDesconto3.getText();
                prod3[4] = lblDistancia3.getText();
            } else if (prod4[0] != null && prod5[0] == null) {
                prod4[0] = lblProd3.getText();
                prod4[1] = lblPreco3.getText();
                prod4[2] = lblMercado3.getText();
                prod4[3] = lblDesconto3.getText();
                prod4[4] = lblDistancia3.getText();
            }
        }

        if (checkProd4.isSelected()) {
            if (prod1[0] == null) {
                prod1[0] = lblProd4.getText();
                prod1[1] = lblPreco4.getText();
                prod1[2] = lblMercado4.getText();
                prod1[3] = lblDesconto4.getText();
                prod1[4] = lblDistancia4.getText();
            } else if (prod1[0] == null && prod2[0] == null) {
                prod2[0] = lblProd4.getText();
                prod2[1] = lblPreco4.getText();
                prod2[2] = lblMercado4.getText();
                prod2[3] = lblDesconto4.getText();
                prod2[4] = lblDistancia4.getText();
            } else if (prod2[0] != null && prod3[0] == null) {
                prod3[0] = lblProd4.getText();
                prod3[1] = lblPreco4.getText();
                prod3[2] = lblMercado4.getText();
                prod3[3] = lblDesconto4.getText();
                prod3[4] = lblDistancia4.getText();
            } else if (prod3[0] != null && prod4[0] == null) {
                prod3[0] = lblProd4.getText();
                prod3[1] = lblPreco4.getText();
                prod3[2] = lblMercado4.getText();
                prod3[3] = lblDesconto4.getText();
                prod3[4] = lblDistancia4.getText();
            } else if (prod4[0] != null && prod5[0] == null) {
                prod4[0] = lblProd4.getText();
                prod4[1] = lblPreco4.getText();
                prod4[2] = lblMercado4.getText();
                prod4[3] = lblDesconto4.getText();
                prod4[4] = lblDistancia4.getText();
            }
        }
        checkProd1.setSelected(false);
        checkProd2.setSelected(false);
        checkProd3.setSelected(false);
        checkProd4.setSelected(false);
        txtBusca.setText("");
        lblMsg.setVisible(true);
        
    }//GEN-LAST:event_lblAddMouseClicked

    private void txtBuscaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscaFocusGained
        lblMsg.setVisible(false);
    }//GEN-LAST:event_txtBuscaFocusGained

    

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
            java.util.logging.Logger.getLogger(Busca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JCheckBox checkProd1;
    private javax.swing.JCheckBox checkProd2;
    private javax.swing.JCheckBox checkProd3;
    private javax.swing.JCheckBox checkProd4;
    private javax.swing.JLabel imagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCesto;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDesconto1;
    private javax.swing.JLabel lblDesconto2;
    private javax.swing.JLabel lblDesconto3;
    private javax.swing.JLabel lblDesconto4;
    private javax.swing.JLabel lblDistancia1;
    private javax.swing.JLabel lblDistancia2;
    private javax.swing.JLabel lblDistancia3;
    private javax.swing.JLabel lblDistancia4;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMercado1;
    private javax.swing.JLabel lblMercado2;
    private javax.swing.JLabel lblMercado3;
    private javax.swing.JLabel lblMercado4;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblPreco1;
    private javax.swing.JLabel lblPreco2;
    private javax.swing.JLabel lblPreco3;
    private javax.swing.JLabel lblPreco4;
    private javax.swing.JLabel lblProd1;
    private javax.swing.JLabel lblProd2;
    private javax.swing.JLabel lblProd3;
    private javax.swing.JLabel lblProd4;
    private javax.swing.JLabel lblSemRes;
    private javax.swing.JPanel pnlProd1;
    private javax.swing.JPanel pnlProd2;
    private javax.swing.JPanel pnlProd3;
    private javax.swing.JPanel pnlProd4;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables

    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            lblHora.setText(String.format("%1$tH:%1$tM", now));
        }
    }

    private void Feijao() {
        produtos = new Produtos();
        String[] feijao = new String[9];
        feijao = produtos.feijao();

        pnlProd1.setVisible(true);
        pnlProd2.setVisible(true);
        pnlProd3.setVisible(true);
        lblPreco1.setVisible(true);
        lblMercado1.setVisible(true);
        lblDistancia1.setVisible(true);
        lblDesconto1.setVisible(true);
        lblProd1.setVisible(true);
        checkProd1.setVisible(true);
        lblSemRes.setVisible(false);

        lblProd1.setText(feijao[0]);
        lblPreco1.setText(feijao[1]);
        lblMercado1.setText(feijao[2]);
        lblDistancia1.setText(feijao[3]);
        lblProd2.setText(feijao[0]);
        lblPreco2.setText(feijao[4]);
        lblMercado2.setText(feijao[5]);
        lblDistancia2.setText(feijao[6]);
        lblProd3.setText(feijao[0]);
        lblPreco3.setText(feijao[7]);
        lblMercado3.setText(feijao[8]);
        lblDistancia3.setText(feijao[9]);

        float opcao1 = Float.parseFloat(feijao[1]);
        float opcao2 = Float.parseFloat(feijao[4]);
        float opcao3 = Float.parseFloat(feijao[7]);

        float percent1 = (opcao2 - opcao1) * 100 / opcao2 / 100;
        float percent2 = (opcao3 - opcao2) * 100 / opcao3 / 100;
        float percent3 = (opcao3 - opcao2) * 100 / opcao2 / 100;

        lblDesconto1.setText(new DecimalFormat("-#.##%").format(percent1));
        lblDesconto2.setText(new DecimalFormat("-#.##%").format(percent2));
        lblDesconto3.setText(new DecimalFormat("+#.##%").format(percent3));
    }

    private void Monster() {
        String[] monster = new String[9];
        produtos = new Produtos();
        monster = produtos.monster();

        pnlProd1.setVisible(true);
        pnlProd2.setVisible(true);
        pnlProd3.setVisible(true);
        lblPreco1.setVisible(true);
        lblMercado1.setVisible(true);
        lblDistancia1.setVisible(true);
        lblDesconto1.setVisible(true);
        lblProd1.setVisible(true);
        checkProd1.setVisible(true);
        lblSemRes.setVisible(false);

        lblProd1.setText(monster[0]);
        lblPreco1.setText(monster[1]);
        lblMercado1.setText(monster[2]);
        lblDistancia1.setText(monster[3]);
        lblProd2.setText(monster[0]);
        lblPreco2.setText(monster[4]);
        lblMercado2.setText(monster[5]);
        lblDistancia2.setText(monster[6]);
        lblProd3.setText(monster[0]);
        lblPreco3.setText(monster[7]);
        lblMercado3.setText(monster[8]);
        lblDistancia3.setText(monster[9]);

        float opcao1 = Float.parseFloat(monster[1]);
        float opcao2 = Float.parseFloat(monster[4]);
        float opcao3 = Float.parseFloat(monster[7]);

        float percent1 = (opcao2 - opcao1) * 100 / opcao2 / 100;
        float percent2 = (opcao3 - opcao2) * 100 / opcao3 / 100;
        float percent3 = (opcao3 - opcao2) * 100 / opcao2 / 100;

        lblDesconto1.setText(new DecimalFormat("-#.##%").format(percent1));
        lblDesconto2.setText(new DecimalFormat("-#.##%").format(percent2));
        lblDesconto3.setText(new DecimalFormat("+#.##%").format(percent3));
    }

    private void Macarrao() {

        String[] macarrao = new String[9];
        produtos = new Produtos();
        macarrao = produtos.macarrao();

        pnlProd1.setVisible(true);
        pnlProd2.setVisible(true);
        pnlProd3.setVisible(true);
        lblPreco1.setVisible(true);
        lblMercado1.setVisible(true);
        lblDistancia1.setVisible(true);
        lblDesconto1.setVisible(true);
        lblProd1.setVisible(true);
        checkProd1.setVisible(true);
        lblSemRes.setVisible(false);

        lblProd1.setText(macarrao[0]);
        lblPreco1.setText(macarrao[1]);
        lblMercado1.setText(macarrao[2]);
        lblDistancia1.setText(macarrao[3]);
        lblProd2.setText(macarrao[0]);
        lblPreco2.setText(macarrao[4]);
        lblMercado2.setText(macarrao[5]);
        lblDistancia2.setText(macarrao[6]);
        lblProd3.setText(macarrao[0]);
        lblPreco3.setText(macarrao[7]);
        lblMercado3.setText(macarrao[8]);
        lblDistancia3.setText(macarrao[9]);

        float opcao1 = Float.parseFloat(macarrao[1]);
        float opcao2 = Float.parseFloat(macarrao[4]);
        float opcao3 = Float.parseFloat(macarrao[7]);

        float percent1 = (opcao2 - opcao1) * 100 / opcao2 / 100;
        float percent2 = (opcao3 - opcao2) * 100 / opcao3 / 100;
        float percent3 = (opcao3 - opcao2) * 100 / opcao2 / 100;

        lblDesconto1.setText(new DecimalFormat("-#.##%").format(percent1));
        lblDesconto2.setText(new DecimalFormat("-#.##%").format(percent2));
        lblDesconto3.setText(new DecimalFormat("+#.##%").format(percent3));
    }

    private void Arroz() {

        String[] arroz = new String[9];
        produtos = new Produtos();
        arroz = produtos.arroz();

        pnlProd1.setVisible(true);
        pnlProd2.setVisible(true);
        pnlProd3.setVisible(true);
        lblPreco1.setVisible(true);
        lblMercado1.setVisible(true);
        lblDistancia1.setVisible(true);
        lblDesconto1.setVisible(true);
        lblProd1.setVisible(true);
        checkProd1.setVisible(true);
        lblSemRes.setVisible(false);

        lblProd1.setText(arroz[0]);
        lblPreco1.setText(arroz[1]);
        lblMercado1.setText(arroz[2]);
        lblDistancia1.setText(arroz[3]);
        lblProd2.setText(arroz[0]);
        lblPreco2.setText(arroz[4]);
        lblMercado2.setText(arroz[5]);
        lblDistancia2.setText(arroz[6]);
        lblProd3.setText(arroz[0]);
        lblPreco3.setText(arroz[7]);
        lblMercado3.setText(arroz[8]);
        lblDistancia3.setText(arroz[9]);

        float opcao1 = Float.parseFloat(arroz[1]);
        float opcao2 = Float.parseFloat(arroz[4]);
        float opcao3 = Float.parseFloat(arroz[7]);

        float percent1 = (opcao2 - opcao1) * 100 / opcao2 / 100;
        float percent2 = (opcao3 - opcao2) * 100 / opcao3 / 100;
        float percent3 = (opcao3 - opcao2) * 100 / opcao2 / 100;

        lblDesconto1.setText(new DecimalFormat("-#.##%").format(percent1));
        lblDesconto2.setText(new DecimalFormat("-#.##%").format(percent2));
        lblDesconto3.setText(new DecimalFormat("+#.##%").format(percent3));
    }

    private void Chocolate() {

        String[] bombom = new String[9];
        produtos = new Produtos();
        bombom = produtos.chocolate();

        pnlProd1.setVisible(true);
        pnlProd2.setVisible(true);
        pnlProd3.setVisible(true);
        lblPreco1.setVisible(true);
        lblMercado1.setVisible(true);
        lblDistancia1.setVisible(true);
        lblDesconto1.setVisible(true);
        lblProd1.setVisible(true);
        checkProd1.setVisible(true);
        lblSemRes.setVisible(false);

        lblProd1.setText(bombom[0]);
        lblPreco1.setText(bombom[1]);
        lblMercado1.setText(bombom[2]);
        lblDistancia1.setText(bombom[3]);
        lblProd2.setText(bombom[0]);
        lblPreco2.setText(bombom[4]);
        lblMercado2.setText(bombom[5]);
        lblDistancia2.setText(bombom[6]);
        lblProd3.setText(bombom[0]);
        lblPreco3.setText(bombom[7]);
        lblMercado3.setText(bombom[8]);
        lblDistancia3.setText(bombom[9]);

        float opcao1 = Float.parseFloat(bombom[1]);
        float opcao2 = Float.parseFloat(bombom[4]);
        float opcao3 = Float.parseFloat(bombom[7]);

        float percent1 = (opcao2 - opcao1) * 100 / opcao2 / 100;
        float percent2 = (opcao3 - opcao2) * 100 / opcao3 / 100;
        float percent3 = (opcao3 - opcao2) * 100 / opcao2 / 100;

        lblDesconto1.setText(new DecimalFormat("-#.##%").format(percent1));
        lblDesconto2.setText(new DecimalFormat("-#.##%").format(percent2));
        lblDesconto3.setText(new DecimalFormat("+#.##%").format(percent3));
    }
}
