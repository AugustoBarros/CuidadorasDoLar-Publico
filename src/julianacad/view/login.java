package julianacad.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Augusto Barros
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnLoginSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 450));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Login:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 280, 60, 20);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 320, 80, 20);
        getContentPane().add(txtLogin);
        txtLogin.setBounds(310, 270, 190, 30);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(310, 310, 190, 30);

        btnLogin.setBackground(new java.awt.Color(77, 166, 255));
        btnLogin.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(200, 370, 140, 40);

        btnLoginSair.setBackground(new java.awt.Color(77, 166, 255));
        btnLoginSair.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnLoginSair.setText("SAIR");
        btnLoginSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoginSair);
        btnLoginSair.setBounds(370, 370, 140, 40);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel4.setText("2019 - Versão 1.2.0 - Cuidadoras do Lar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 460, 250, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaLoginFinal.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 720, 490);

        setSize(new java.awt.Dimension(720, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if((txtLogin.getText().equals("")) && (txtSenha.getText().equals(""))){
            JOptionPane.showMessageDialog(null,"Bem vindo!");
            TelaPrincipal telaPricipal = new TelaPrincipal();
            telaPricipal.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Senha ou Login incorretos!");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnLoginSairActionPerformed

 
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLoginSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
