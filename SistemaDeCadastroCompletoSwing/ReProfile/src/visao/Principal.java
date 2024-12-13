
package visao;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch (Exception e) {
            System.out.println(e);
        }
        UIManager.put("Menu[Enable].backgroundPainter", null);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        RPDesktop = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        RPBarraMenu = new javax.swing.JMenuBar();
        RPTopBarArquivo = new javax.swing.JMenu();
        RPSeparatorMenuCadastro = new javax.swing.JPopupMenu.Separator();
        RPMenuContatos = new javax.swing.JMenuItem();
        RPTopBarSair = new javax.swing.JMenu();
        RPMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REPROFILE - Register Profile");
        setUndecorated(true);

        RPDesktop.setBackground(new java.awt.Color(51, 51, 51));
        RPDesktop.setForeground(new java.awt.Color(51, 51, 51));
        RPDesktop.setFont(new java.awt.Font("Wide Latin", 0, 24)); // NOI18N
        RPDesktop.setPreferredSize(new java.awt.Dimension(1699, 851));

        javax.swing.GroupLayout RPDesktopLayout = new javax.swing.GroupLayout(RPDesktop);
        RPDesktop.setLayout(RPDesktopLayout);
        RPDesktopLayout.setHorizontalGroup(
            RPDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1788, Short.MAX_VALUE)
        );
        RPDesktopLayout.setVerticalGroup(
            RPDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 851, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        RPBarraMenu.setBackground(new java.awt.Color(0, 0, 0));
        RPBarraMenu.setBorder(null);
        RPBarraMenu.setForeground(new java.awt.Color(255, 255, 255));
        RPBarraMenu.setBorderPainted(false);
        RPBarraMenu.setMaximumSize(new java.awt.Dimension(50, 50));
        RPBarraMenu.setName(""); // NOI18N
        RPBarraMenu.setOpaque(true);
        RPBarraMenu.setPreferredSize(new java.awt.Dimension(70, 70));

        RPTopBarArquivo.setBackground(new java.awt.Color(0, 0, 0));
        RPTopBarArquivo.setBorder(null);
        RPTopBarArquivo.setForeground(new java.awt.Color(255, 255, 255));
        RPTopBarArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_card_index_dividers_70px.png"))); // NOI18N
        RPTopBarArquivo.setMnemonic('A');

        RPSeparatorMenuCadastro.setBackground(new java.awt.Color(0, 0, 0));
        RPSeparatorMenuCadastro.setForeground(new java.awt.Color(0, 0, 0));
        RPTopBarArquivo.add(RPSeparatorMenuCadastro);

        RPMenuContatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        RPMenuContatos.setBackground(new java.awt.Color(0, 0, 0));
        RPMenuContatos.setForeground(new java.awt.Color(255, 255, 255));
        RPMenuContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contato.png"))); // NOI18N
        RPMenuContatos.setText("Contatos");
        RPMenuContatos.setOpaque(true);
        RPMenuContatos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RPMenuContatosActionPerformed(evt);
            }
        });
        RPTopBarArquivo.add(RPMenuContatos);

        RPBarraMenu.add(RPTopBarArquivo);

        RPTopBarSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_exit_sign_70px.png"))); // NOI18N
        RPTopBarSair.setMargin(new java.awt.Insets(3, 6, 3, 15));
        RPTopBarSair.setVerifyInputWhenFocusTarget(false);
        RPTopBarSair.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RPTopBarSairActionPerformed(evt);
            }
        });

        RPMenuSair.setBackground(new java.awt.Color(0, 0, 0));
        RPMenuSair.setFont(new java.awt.Font("Pristina", 0, 18)); // NOI18N
        RPMenuSair.setForeground(new java.awt.Color(255, 255, 255));
        RPMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_power_off_button_50px.png"))); // NOI18N
        RPMenuSair.setText("Sair");
        RPMenuSair.setToolTipText("Sair");
        RPMenuSair.setBorder(null);
        RPMenuSair.setBorderPainted(false);
        RPMenuSair.setFocusable(true);
        RPMenuSair.setOpaque(true);
        RPMenuSair.setPreferredSize(new java.awt.Dimension(100, 50));
        RPMenuSair.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RPMenuSairActionPerformed(evt);
            }
        });
        RPTopBarSair.add(RPMenuSair);

        RPBarraMenu.add(RPTopBarSair);

        setJMenuBar(RPBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(RPDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 1788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(RPDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RPMenuContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPMenuContatosActionPerformed
      // Verifica se a JInternalFrame já está aberta
        boolean frameAberto = false;

        for (JInternalFrame frame : RPDesktop.getAllFrames()) {
            if (frame instanceof ReProFormCadastroContato) {
                frameAberto = true;
                frame.toFront();
                try {
                    frame.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

        // Se não estiver aberta, cria e adiciona ao desktop pane
        if (!frameAberto) {
            ReProFormCadastroContato telaContatos = new ReProFormCadastroContato() {};
            RPDesktop.add(telaContatos);
            telaContatos.setVisible(true);
        }
    

    }//GEN-LAST:event_RPMenuContatosActionPerformed

    private void RPTopBarSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPTopBarSairActionPerformed
              
    }//GEN-LAST:event_RPTopBarSairActionPerformed

    private void RPMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPMenuSairActionPerformed
       int confirm = JOptionPane.showConfirmDialog(this, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        for (JInternalFrame frame : RPDesktop.getAllFrames()) {
            if (frame instanceof ReProFormCadastroContato) {
                ReProFormCadastroContato.salvarCadastrosEmArquivo(((ReProFormCadastroContato) frame).cadastroDAO);
            }
        }
        System.exit(0);
    }

    }//GEN-LAST:event_RPMenuSairActionPerformed

    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar RPBarraMenu;
    private javax.swing.JDesktopPane RPDesktop;
    private javax.swing.JMenuItem RPMenuContatos;
    private javax.swing.JMenuItem RPMenuSair;
    private javax.swing.JPopupMenu.Separator RPSeparatorMenuCadastro;
    private javax.swing.JMenu RPTopBarArquivo;
    private javax.swing.JMenu RPTopBarSair;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
