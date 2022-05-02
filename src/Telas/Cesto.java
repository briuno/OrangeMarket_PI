package Telas;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

public class Cesto extends javax.swing.JFrame {

    Busca busca;

    public Cesto() {
        initComponents();
        this.IniciarTela();
        pnlProd1.setVisible(false);
        pnlProd2.setVisible(false);
        pnlProd3.setVisible(false);
        pnlProd4.setVisible(false);
        pnlProd5.setVisible(false);
        lblLink1.setVisible(false);
        lblLink2.setVisible(false);
        lblLink3.setVisible(false);
        lblLink4.setVisible(false);
        lblLink5.setVisible(false);
    }

    private void IniciarTela() {
        Date datatual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        lblData.setText(formato.format(datatual));
        Timer timer = new Timer(0, new hora());
        timer.start();
    }

    public void Cesto(String[] prod1, String[] prod2, String[] prod3, String[] prod4, String[] prod5) {
        
        if (prod1[0] != null) {
            pnlProd1.setVisible(true);
            lblProd1.setText(prod1[0]);
            lblPreco1.setText(prod1[1]);
            lblMercado1.setText(prod1[2]);
            lblDesconto1.setText(prod1[3]);
            lblDistancia1.setText(prod1[4]);
            lblLink1.setText(prod1[5]);
        }
        if (prod1[0] != null && prod2[0] != null) {
            pnlProd2.setVisible(true);
            lblProd2.setText(prod2[0]);
            lblPreco2.setText(prod2[1]);
            lblMercado2.setText(prod2[2]);
            lblDesconto2.setText(prod2[3]);
            lblDistancia2.setText(prod2[4]);
            lblLink2.setText(prod2[5]);
        }
        if (prod2[0] != null && prod3[0] != null) {
            pnlProd3.setVisible(true);
            lblProd3.setText(prod3[0]);
            lblPreco3.setText(prod3[1]);
            lblMercado3.setText(prod3[2]);
            lblDesconto3.setText(prod3[3]);
            lblDistancia3.setText(prod3[4]);
            lblLink3.setText(prod3[5]);
        }
        if (prod3[0] != null && prod4[0] != null) {
            pnlProd4.setVisible(true);
            lblProd4.setText(prod4[0]);
            lblPreco4.setText(prod4[1]);
            lblMercado4.setText(prod4[2]);
            lblDesconto4.setText(prod4[3]);
            lblDistancia4.setText(prod4[4]);
            lblLink4.setText(prod4[5]);
        }
        if (prod4[0] != null && prod5[0] != null) {
            pnlProd5.setVisible(true);
            lblProd5.setText(prod5[0]);
            lblPreco5.setText(prod5[1]);
            lblMercado5.setText(prod5[2]);
            lblDesconto5.setText(prod5[3]);
            lblDistancia5.setText(prod5[4]);
            lblLink5.setText(prod5[5]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblHora = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        pnlProd1 = new javax.swing.JPanel();
        lblProd1 = new javax.swing.JLabel();
        lblPreco1 = new javax.swing.JLabel();
        lblDesconto1 = new javax.swing.JLabel();
        lblMercado1 = new javax.swing.JLabel();
        lblDistancia1 = new javax.swing.JLabel();
        lblSemRes = new javax.swing.JLabel();
        checkProd1 = new javax.swing.JCheckBox();
        lblLink1 = new javax.swing.JLabel();
        pnlProd3 = new javax.swing.JPanel();
        lblPreco3 = new javax.swing.JLabel();
        lblDesconto3 = new javax.swing.JLabel();
        lblMercado3 = new javax.swing.JLabel();
        lblDistancia3 = new javax.swing.JLabel();
        lblProd3 = new javax.swing.JLabel();
        checkProd3 = new javax.swing.JCheckBox();
        lblLink3 = new javax.swing.JLabel();
        pnlProd2 = new javax.swing.JPanel();
        lblPreco2 = new javax.swing.JLabel();
        lblDesconto2 = new javax.swing.JLabel();
        lblMercado2 = new javax.swing.JLabel();
        lblDistancia2 = new javax.swing.JLabel();
        lblProd2 = new javax.swing.JLabel();
        checkProd2 = new javax.swing.JCheckBox();
        lblLink2 = new javax.swing.JLabel();
        pnlProd4 = new javax.swing.JPanel();
        lblPreco4 = new javax.swing.JLabel();
        lblDesconto4 = new javax.swing.JLabel();
        lblMercado4 = new javax.swing.JLabel();
        lblDistancia4 = new javax.swing.JLabel();
        lblProd4 = new javax.swing.JLabel();
        checkProd4 = new javax.swing.JCheckBox();
        lblLink4 = new javax.swing.JLabel();
        pnlProd5 = new javax.swing.JPanel();
        lblPreco5 = new javax.swing.JLabel();
        lblDesconto5 = new javax.swing.JLabel();
        lblMercado5 = new javax.swing.JLabel();
        lblDistancia5 = new javax.swing.JLabel();
        lblProd5 = new javax.swing.JLabel();
        checkProd5 = new javax.swing.JCheckBox();
        lblLink5 = new javax.swing.JLabel();
        lblBusca = new javax.swing.JLabel();
        lblFinalizar = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHora.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 110, 20));

        lblData.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 20));

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
        pnlProd1.add(lblMercado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 80, -1));

        lblDistancia1.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblDistancia1.setForeground(new java.awt.Color(255, 255, 255));
        lblDistancia1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistancia1.setText("Distancia");
        pnlProd1.add(lblDistancia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 80, -1));

        lblSemRes.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lblSemRes.setForeground(new java.awt.Color(255, 255, 255));
        lblSemRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlProd1.add(lblSemRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 260, 20));
        pnlProd1.add(checkProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        pnlProd1.add(lblLink1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jPanel1.add(pnlProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 280, 100));

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
        pnlProd3.add(lblMercado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 80, -1));

        lblDistancia3.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblDistancia3.setForeground(new java.awt.Color(255, 255, 255));
        lblDistancia3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistancia3.setText("Distancia");
        pnlProd3.add(lblDistancia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 80, -1));

        lblProd3.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lblProd3.setForeground(new java.awt.Color(255, 255, 255));
        lblProd3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProd3.setText("Produto 3");
        pnlProd3.add(lblProd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, -1));
        pnlProd3.add(checkProd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        pnlProd3.add(lblLink3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jPanel1.add(pnlProd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 280, 100));

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
        pnlProd2.add(lblMercado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 80, -1));

        lblDistancia2.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblDistancia2.setForeground(new java.awt.Color(255, 255, 255));
        lblDistancia2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistancia2.setText("Distancia");
        pnlProd2.add(lblDistancia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 80, -1));

        lblProd2.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lblProd2.setForeground(new java.awt.Color(255, 255, 255));
        lblProd2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProd2.setText("Produto 2");
        pnlProd2.add(lblProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, -1));
        pnlProd2.add(checkProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        pnlProd2.add(lblLink2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jPanel1.add(pnlProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 280, 100));

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
        pnlProd4.add(lblMercado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 80, -1));

        lblDistancia4.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblDistancia4.setForeground(new java.awt.Color(255, 255, 255));
        lblDistancia4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistancia4.setText("Distancia");
        pnlProd4.add(lblDistancia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 80, -1));

        lblProd4.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lblProd4.setForeground(new java.awt.Color(255, 255, 255));
        lblProd4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProd4.setText("Produto 4");
        pnlProd4.add(lblProd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, -1));
        pnlProd4.add(checkProd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        pnlProd4.add(lblLink4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jPanel1.add(pnlProd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 280, 100));

        pnlProd5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        pnlProd5.setOpaque(false);
        pnlProd5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlProd5MouseClicked(evt);
            }
        });
        pnlProd5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPreco5.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblPreco5.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPreco5.setText("Preço");
        pnlProd5.add(lblPreco5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, -1));

        lblDesconto5.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblDesconto5.setForeground(new java.awt.Color(255, 255, 255));
        lblDesconto5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDesconto5.setText("Desconto");
        pnlProd5.add(lblDesconto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, -1));

        lblMercado5.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblMercado5.setForeground(new java.awt.Color(255, 255, 255));
        lblMercado5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMercado5.setText("Mercado");
        pnlProd5.add(lblMercado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 80, -1));

        lblDistancia5.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        lblDistancia5.setForeground(new java.awt.Color(255, 255, 255));
        lblDistancia5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistancia5.setText("Distancia");
        pnlProd5.add(lblDistancia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 80, -1));

        lblProd5.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lblProd5.setForeground(new java.awt.Color(255, 255, 255));
        lblProd5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProd5.setText("Produto 5");
        pnlProd5.add(lblProd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, -1));
        pnlProd5.add(checkProd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        pnlProd5.add(lblLink5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jPanel1.add(pnlProd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 280, 100));

        lblBusca.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lblBusca.setForeground(new java.awt.Color(1, 89, 41));
        lblBusca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBusca.setText("Busca");
        lblBusca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscaMouseClicked(evt);
            }
        });
        jPanel1.add(lblBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 150, -1));

        lblFinalizar.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lblFinalizar.setForeground(new java.awt.Color(1, 89, 41));
        lblFinalizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFinalizar.setText("Finalizar");
        lblFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFinalizarMouseClicked(evt);
            }
        });
        jPanel1.add(lblFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 150, -1));

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensIcons/Fundo.png"))); // NOI18N
        jPanel1.add(imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlProd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProd1MouseClicked
        try {
            URI link = new URI(lblLink1.getText());
            Desktop.getDesktop().browse(link);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Cesto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cesto.class.getName()).log(Level.SEVERE, null, ex);
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

    private void pnlProd5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProd5MouseClicked
        if (checkProd5.isSelected()) {
            checkProd5.setSelected(false);
        } else {
            checkProd5.setSelected(true);
        }
    }//GEN-LAST:event_pnlProd5MouseClicked

    private void lblFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinalizarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblFinalizarMouseClicked

    private void lblBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscaMouseClicked
        busca = new Busca();
        busca.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblBuscaMouseClicked

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
            java.util.logging.Logger.getLogger(Cesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Cesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkProd1;
    private javax.swing.JCheckBox checkProd2;
    private javax.swing.JCheckBox checkProd3;
    private javax.swing.JCheckBox checkProd4;
    private javax.swing.JCheckBox checkProd5;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDesconto1;
    private javax.swing.JLabel lblDesconto2;
    private javax.swing.JLabel lblDesconto3;
    private javax.swing.JLabel lblDesconto4;
    private javax.swing.JLabel lblDesconto5;
    private javax.swing.JLabel lblDistancia1;
    private javax.swing.JLabel lblDistancia2;
    private javax.swing.JLabel lblDistancia3;
    private javax.swing.JLabel lblDistancia4;
    private javax.swing.JLabel lblDistancia5;
    private javax.swing.JLabel lblFinalizar;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblLink1;
    private javax.swing.JLabel lblLink2;
    private javax.swing.JLabel lblLink3;
    private javax.swing.JLabel lblLink4;
    private javax.swing.JLabel lblLink5;
    private javax.swing.JLabel lblMercado1;
    private javax.swing.JLabel lblMercado2;
    private javax.swing.JLabel lblMercado3;
    private javax.swing.JLabel lblMercado4;
    private javax.swing.JLabel lblMercado5;
    private javax.swing.JLabel lblPreco1;
    private javax.swing.JLabel lblPreco2;
    private javax.swing.JLabel lblPreco3;
    private javax.swing.JLabel lblPreco4;
    private javax.swing.JLabel lblPreco5;
    private javax.swing.JLabel lblProd1;
    private javax.swing.JLabel lblProd2;
    private javax.swing.JLabel lblProd3;
    private javax.swing.JLabel lblProd4;
    private javax.swing.JLabel lblProd5;
    private javax.swing.JLabel lblSemRes;
    private javax.swing.JPanel pnlProd1;
    private javax.swing.JPanel pnlProd2;
    private javax.swing.JPanel pnlProd3;
    private javax.swing.JPanel pnlProd4;
    private javax.swing.JPanel pnlProd5;
    // End of variables declaration//GEN-END:variables

    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            lblHora.setText(String.format("%1$tH:%1$tM", now));
        }
    }
}
