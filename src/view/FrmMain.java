/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author noeba
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        ImageIcon icone = new ImageIcon("src/img/gamesphere-ico.png");
        setIconImage(icone.getImage());
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtbGameSphere = new javax.swing.JToolBar();
        jtbCliente = new javax.swing.JButton();
        jtbProduto = new javax.swing.JButton();
        jtbReserva = new javax.swing.JButton();
        jtbSobre = new javax.swing.JButton();
        jtbSair = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        menMenu = new javax.swing.JMenuBar();
        menCliente = new javax.swing.JMenu();
        iteCliente = new javax.swing.JMenuItem();
        iteFuncionario = new javax.swing.JMenuItem();
        iteFornecedor = new javax.swing.JMenuItem();
        menProduto = new javax.swing.JMenu();
        iteProduto = new javax.swing.JMenuItem();
        iteTipoproduto = new javax.swing.JMenuItem();
        menReserva = new javax.swing.JMenu();
        iteReserva = new javax.swing.JMenuItem();
        iteTiporeserva = new javax.swing.JMenuItem();
        menSobre = new javax.swing.JMenu();
        menSair = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GameSphere");
        setName("FrmMain"); // NOI18N
        setResizable(false);

        jtbGameSphere.setRollover(true);
        jtbGameSphere.setBorderPainted(false);
        jtbGameSphere.setName("GameSphere Toolbar"); // NOI18N

        jtbCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jtbCliente.setToolTipText("Cliente");
        jtbCliente.setFocusable(false);
        jtbCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtbCliente.setMaximumSize(new java.awt.Dimension(64, 64));
        jtbCliente.setMinimumSize(new java.awt.Dimension(64, 64));
        jtbCliente.setName("jtbCliente"); // NOI18N
        jtbCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbClienteActionPerformed(evt);
            }
        });
        jtbGameSphere.add(jtbCliente);

        jtbProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produto.png"))); // NOI18N
        jtbProduto.setToolTipText("Produto");
        jtbProduto.setFocusable(false);
        jtbProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtbProduto.setMaximumSize(new java.awt.Dimension(64, 64));
        jtbProduto.setMinimumSize(new java.awt.Dimension(64, 64));
        jtbProduto.setName("jtbProduto"); // NOI18N
        jtbProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbProdutoActionPerformed(evt);
            }
        });
        jtbGameSphere.add(jtbProduto);

        jtbReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reserva.png"))); // NOI18N
        jtbReserva.setToolTipText("Reserva");
        jtbReserva.setFocusable(false);
        jtbReserva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtbReserva.setMaximumSize(new java.awt.Dimension(64, 64));
        jtbReserva.setMinimumSize(new java.awt.Dimension(64, 64));
        jtbReserva.setName("jtbReserva"); // NOI18N
        jtbReserva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbReservaActionPerformed(evt);
            }
        });
        jtbGameSphere.add(jtbReserva);

        jtbSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sobre.png"))); // NOI18N
        jtbSobre.setToolTipText("Sobre");
        jtbSobre.setFocusable(false);
        jtbSobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtbSobre.setMaximumSize(new java.awt.Dimension(64, 64));
        jtbSobre.setMinimumSize(new java.awt.Dimension(64, 64));
        jtbSobre.setName("jtbSobre"); // NOI18N
        jtbSobre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbSobreActionPerformed(evt);
            }
        });
        jtbGameSphere.add(jtbSobre);

        jtbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair.png"))); // NOI18N
        jtbSair.setToolTipText("Sair");
        jtbSair.setFocusable(false);
        jtbSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtbSair.setMaximumSize(new java.awt.Dimension(64, 64));
        jtbSair.setMinimumSize(new java.awt.Dimension(64, 64));
        jtbSair.setName("jtbSair"); // NOI18N
        jtbSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbSairActionPerformed(evt);
            }
        });
        jtbGameSphere.add(jtbSair);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gamesphere.png"))); // NOI18N
        lblLogo.setName("lblLogo"); // NOI18N

        menMenu.setName("mnbTabela"); // NOI18N

        menCliente.setText("Pessoas");
        menCliente.setName("menCliente"); // NOI18N

        iteCliente.setText("Cliente");
        iteCliente.setName("Cliente"); // NOI18N
        iteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iteClienteActionPerformed(evt);
            }
        });
        menCliente.add(iteCliente);

        iteFuncionario.setText("Funcionario");
        iteFuncionario.setName("Funcionario"); // NOI18N
        iteFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iteFuncionarioActionPerformed(evt);
            }
        });
        menCliente.add(iteFuncionario);

        iteFornecedor.setText("Fornecedor");
        iteFornecedor.setName("Fornecedor"); // NOI18N
        iteFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iteFornecedorActionPerformed(evt);
            }
        });
        menCliente.add(iteFornecedor);

        menMenu.add(menCliente);

        menProduto.setText("Produto");
        menProduto.setName("menProduto"); // NOI18N

        iteProduto.setText("Produto");
        iteProduto.setName("Produto"); // NOI18N
        iteProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iteProdutoActionPerformed(evt);
            }
        });
        menProduto.add(iteProduto);

        iteTipoproduto.setText("Tipo Produto");
        iteTipoproduto.setName("Tipo Produto"); // NOI18N
        iteTipoproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iteTipoprodutoActionPerformed(evt);
            }
        });
        menProduto.add(iteTipoproduto);

        menMenu.add(menProduto);

        menReserva.setText("Reserva");
        menReserva.setName("menReserva"); // NOI18N

        iteReserva.setText("Reserva");
        iteReserva.setName("Reserva"); // NOI18N
        iteReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iteReservaActionPerformed(evt);
            }
        });
        menReserva.add(iteReserva);

        iteTiporeserva.setText("Tipo Reserva");
        iteTiporeserva.setName("Tipo Reserva"); // NOI18N
        iteTiporeserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iteTiporeservaActionPerformed(evt);
            }
        });
        menReserva.add(iteTiporeserva);

        menMenu.add(menReserva);

        menSobre.setText("Sobre");
        menSobre.setName("menSobre"); // NOI18N
        menSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menSobreMouseClicked(evt);
            }
        });
        menSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSobreActionPerformed(evt);
            }
        });
        menMenu.add(menSobre);

        menSair.setText("Sair");
        menSair.setName("menSair"); // NOI18N
        menSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menSairMouseClicked(evt);
            }
        });
        menSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSairActionPerformed(evt);
            }
        });
        menMenu.add(menSair);

        setJMenuBar(menMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtbGameSphere, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jtbGameSphere, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iteClienteActionPerformed
        abrirCRUD("Cliente");
    }//GEN-LAST:event_iteClienteActionPerformed

    private void iteFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iteFornecedorActionPerformed
        abrirCRUD("Fornecedor");
    }//GEN-LAST:event_iteFornecedorActionPerformed

    private void iteFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iteFuncionarioActionPerformed
        abrirCRUD("Funcionario");
    }//GEN-LAST:event_iteFuncionarioActionPerformed

    private void iteProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iteProdutoActionPerformed
        abrirCRUD("Produto");
    }//GEN-LAST:event_iteProdutoActionPerformed

    private void iteTipoprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iteTipoprodutoActionPerformed
        abrirCRUD("Tipo do Produto");
    }//GEN-LAST:event_iteTipoprodutoActionPerformed

    private void iteReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iteReservaActionPerformed
        abrirCRUD("Reserva");
    }//GEN-LAST:event_iteReservaActionPerformed

    private void iteTiporeservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iteTiporeservaActionPerformed
        abrirCRUD("Tipo da Reserva");
    }//GEN-LAST:event_iteTiporeservaActionPerformed

    private void jtbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbClienteActionPerformed
        abrirCRUD("Cliente");
    }//GEN-LAST:event_jtbClienteActionPerformed

    private void jtbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbProdutoActionPerformed
        abrirCRUD("Produto");
    }//GEN-LAST:event_jtbProdutoActionPerformed

    private void jtbReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbReservaActionPerformed
        abrirCRUD("Reserva");
    }//GEN-LAST:event_jtbReservaActionPerformed

    private void jtbSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbSobreActionPerformed
        FrmSobre mostra = new FrmSobre();
        mostra.setVisible(true);
        dispose();
    }//GEN-LAST:event_jtbSobreActionPerformed

    private void jtbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbSairActionPerformed
       int opcao;
            Object[] botoes = {"Sim","Não"};
            opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo fechar a janela?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
            if (opcao==JOptionPane.YES_OPTION)
            System.exit(0); 
    }//GEN-LAST:event_jtbSairActionPerformed

    private void menSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menSobreActionPerformed

    private void menSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSairActionPerformed

    }//GEN-LAST:event_menSairActionPerformed

    private void menSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menSairMouseClicked
        int opcao;
            Object[] botoes = {"Sim","Não"};
            opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo fechar a janela?","Fechar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
            if (opcao==JOptionPane.YES_OPTION)
            System.exit(0);         // TODO add your handling code here:
    }//GEN-LAST:event_menSairMouseClicked

    private void menSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menSobreMouseClicked
        FrmSobre mostra = new FrmSobre();
        mostra.setVisible(true);
        dispose();
    }//GEN-LAST:event_menSobreMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }
    public void abrirCRUD(String table){
    FrmCrud mostra = new FrmCrud(table);
        mostra.setVisible(true);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem iteCliente;
    private javax.swing.JMenuItem iteFornecedor;
    private javax.swing.JMenuItem iteFuncionario;
    private javax.swing.JMenuItem iteProduto;
    private javax.swing.JMenuItem iteReserva;
    private javax.swing.JMenuItem iteTipoproduto;
    private javax.swing.JMenuItem iteTiporeserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jtbCliente;
    private javax.swing.JToolBar jtbGameSphere;
    private javax.swing.JButton jtbProduto;
    private javax.swing.JButton jtbReserva;
    private javax.swing.JButton jtbSair;
    private javax.swing.JButton jtbSobre;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JMenu menCliente;
    private javax.swing.JMenuBar menMenu;
    private javax.swing.JMenu menProduto;
    private javax.swing.JMenu menReserva;
    private javax.swing.JMenu menSair;
    private javax.swing.JMenu menSobre;
    // End of variables declaration//GEN-END:variables
}
