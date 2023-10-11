/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo76_cuartelbomberos.vistas;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.UIManager;

/**
 *
 * @author Eveel
 */
public class ViewMenu extends javax.swing.JFrame {

    /**
     * Creates new form ViewMenu
     */
    public ViewMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
        public Image getIconImage () { 
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("grupo76_cuartelbomberos/Imagenes/iconbomber.png"));
        return retValue ;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        BBomberos = new javax.swing.JMenu();
        BCuartel = new javax.swing.JMenu();
        BBrigada = new javax.swing.JMenu();
        BSiniestro = new javax.swing.JMenu();
        Siniestro_Declarar = new javax.swing.JMenuItem();
        Sinistro_Concluir = new javax.swing.JMenuItem();
        MenuConsultas = new javax.swing.JMenu();
        BSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cuartel de bomberos Voluntarios");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(1000, 682));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/byn.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1000, 680));

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N

        BBomberos.setBorder(null);
        BBomberos.setText("Bomberos");
        BBomberos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BBomberosMouseClicked(evt);
            }
        });
        jMenuBar1.add(BBomberos);

        BCuartel.setBorder(null);
        BCuartel.setText("Cuarteles");
        BCuartel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCuartelMouseClicked(evt);
            }
        });
        jMenuBar1.add(BCuartel);

        BBrigada.setBorder(null);
        BBrigada.setText("Brigadas");
        BBrigada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BBrigadaMouseClicked(evt);
            }
        });
        jMenuBar1.add(BBrigada);

        BSiniestro.setBorder(null);
        BSiniestro.setText("Siniestros");

        Siniestro_Declarar.setText("Declarar");
        Siniestro_Declarar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Siniestro_DeclararActionPerformed(evt);
            }
        });
        BSiniestro.add(Siniestro_Declarar);

        Sinistro_Concluir.setText("Concluir");
        Sinistro_Concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sinistro_ConcluirActionPerformed(evt);
            }
        });
        BSiniestro.add(Sinistro_Concluir);

        jMenuBar1.add(BSiniestro);

        MenuConsultas.setText("Consultas");
        jMenuBar1.add(MenuConsultas);

        BSalir.setBorder(null);
        BSalir.setText("Salir");
        BSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(BSalir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BSalirMouseClicked
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_BSalirMouseClicked

    private void BBomberosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BBomberosMouseClicked

        escritorio.removeAll();
        escritorio.repaint();
        GestionBomber bomber = new GestionBomber ();
        bomber.setVisible(true);
        escritorio.add(bomber);
        escritorio.moveToFront(bomber); // TODO add your handling code here:
    }//GEN-LAST:event_BBomberosMouseClicked

    private void Siniestro_DeclararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Siniestro_DeclararActionPerformed
        Fondo.setVisible(false);
        escritorio.removeAll();
        escritorio.repaint();
        DeclaracionSiniestro siniestro = new DeclaracionSiniestro();
        siniestro.setVisible(true);
        escritorio.add(siniestro);
        escritorio.moveToFront(siniestro);
    }//GEN-LAST:event_Siniestro_DeclararActionPerformed

    private void BCuartelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCuartelMouseClicked
    
        Fondo.setVisible(false);
        escritorio.removeAll();
        escritorio.repaint();
       Cuarteles cuartel =new Cuarteles ();
       cuartel.setVisible(true);
        escritorio.add(cuartel);
        escritorio.moveToFront(cuartel);
// TODO add your handling code here:
    }//GEN-LAST:event_BCuartelMouseClicked

    private void BBrigadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BBrigadaMouseClicked
    
        Fondo.setVisible(false);
        escritorio.removeAll();
        escritorio.repaint();
        Brigadas brigada =new Brigadas ();
        brigada.setVisible(true);
        escritorio.add(brigada);
        escritorio.moveToFront(brigada);
        // TODO add your handling code here:
    }//GEN-LAST:event_BBrigadaMouseClicked

    private void Sinistro_ConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sinistro_ConcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sinistro_ConcluirActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     /*   try {
    UIManager.setLookAndFeel(new AcrylLookAndFeel());
    } catch (Exception e) {
    e.printStackTrace();
    }*/
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BBomberos;
    private javax.swing.JMenu BBrigada;
    private javax.swing.JMenu BCuartel;
    private javax.swing.JMenu BSalir;
    private javax.swing.JMenu BSiniestro;
    private javax.swing.JLabel Fondo;
    private javax.swing.JMenu MenuConsultas;
    private javax.swing.JMenuItem Siniestro_Declarar;
    private javax.swing.JMenuItem Sinistro_Concluir;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
