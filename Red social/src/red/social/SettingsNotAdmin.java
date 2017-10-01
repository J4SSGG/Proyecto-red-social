/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package red.social;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.regex.Pattern;
import static red.social.RedSocial.SEPARADOR;

/**
 *
 * @author Oscar
 */
public class SettingsNotAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Settings
     */
    public SettingsNotAdmin() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      jLabel1 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      btb_modificarInfo = new javax.swing.JButton();
      jButton1 = new javax.swing.JButton();
      btn_deletAccount = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setResizable(false);

      jLabel1.setText("Modificar Información");

      jLabel3.setText("OPCIONES");

      btb_modificarInfo.setText("Ir");
      btb_modificarInfo.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            btb_modificarInfoMouseClicked(evt);
         }
      });

      jButton1.setText("Regresar");
      jButton1.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            jButton1MouseClicked(evt);
         }
      });

      btn_deletAccount.setText("Eliminar Cuenta");
      btn_deletAccount.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            btn_deletAccountMouseClicked(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel3)
                     .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jButton1))))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                  .addComponent(btb_modificarInfo))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addGap(0, 0, Short.MAX_VALUE)
                  .addComponent(btn_deletAccount)))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel3)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel1)
               .addComponent(btb_modificarInfo))
            .addGap(35, 35, 35)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btn_deletAccount)
               .addComponent(jButton1))
            .addContainerGap(147, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String actualUser = FileManager.Search(RedSocial.ACTUALUSER);
        RedSocial.ProfileController(actualUser);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void btn_deletAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deletAccountMouseClicked
        // TODO add your handling code here:
        RedSocial.Delete(RedSocial.ACTUALUSER);
        RedSocial.ACTUALUSER = ""; // Vacio la variable de usuario actual porque se elimino cuenta
        this.dispose();
        RedSocial.LoginController();
    }//GEN-LAST:event_btn_deletAccountMouseClicked

    private void btb_modificarInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btb_modificarInfoMouseClicked
        // TODO add your handling code here:
//        EditInfo editMyInfo = new EditInfo();
//        editMyInfo.ShowInfo(RedSocial.ACTUALUSER,2);
//        editMyInfo.setVisible(true);     
//        this.dispose();
    }//GEN-LAST:event_btb_modificarInfoMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SettingsNotAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsNotAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsNotAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsNotAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsNotAdmin().setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btb_modificarInfo;
   private javax.swing.JButton btn_deletAccount;
   private javax.swing.JButton jButton1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel3;
   // End of variables declaration//GEN-END:variables
}
