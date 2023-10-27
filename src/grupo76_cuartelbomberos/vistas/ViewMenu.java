/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo76_cuartelbomberos.vistas;


import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class ViewMenu extends javax.swing.JFrame {

    public ViewMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("grupo76_cuartelbomberos/Imagenes/iconbomber.png"));
        return retValue;
    }

    
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
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Siniestro_Concluir = new javax.swing.JMenuItem();
        MenuConsultas = new javax.swing.JMenu();
        MConsulSini = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MConsulBriga = new javax.swing.JMenuItem();
        BSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cuartel de bomberos Voluntarios");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(1000, 682));
        setUndecorated(true);
        setResizable(false
        );
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setBackground(new java.awt.Color(0, 0, 0));
        Fondo.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grupo76_cuartelbomberos/Imagenes/byn.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        escritorio.setOpaque(false);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1000, 690));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N

        BBomberos.setBackground(new java.awt.Color(0, 0, 0));
        BBomberos.setBorder(null);
        BBomberos.setText("Bomberos");
        BBomberos.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        BBomberos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BBomberosMouseClicked(evt);
            }
        });
        jMenuBar1.add(BBomberos);

        BCuartel.setBorder(null);
        BCuartel.setText("Cuarteles");
        BCuartel.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        BCuartel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCuartelMouseClicked(evt);
            }
        });
        jMenuBar1.add(BCuartel);

        BBrigada.setBorder(null);
        BBrigada.setText("Brigadas");
        BBrigada.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        BBrigada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BBrigadaMouseClicked(evt);
            }
        });
        jMenuBar1.add(BBrigada);

        BSiniestro.setBorder(null);
        BSiniestro.setText("Siniestros");
        BSiniestro.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N

        Siniestro_Declarar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Siniestro_Declarar.setText("Declarar");
        Siniestro_Declarar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Siniestro_DeclararActionPerformed(evt);
            }
        });
        BSiniestro.add(Siniestro_Declarar);
        BSiniestro.add(jSeparator1);

        Siniestro_Concluir.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Siniestro_Concluir.setText("Concluir");
        Siniestro_Concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Siniestro_ConcluirActionPerformed(evt);
            }
        });
        BSiniestro.add(Siniestro_Concluir);

        jMenuBar1.add(BSiniestro);

        MenuConsultas.setText("Consultas");
        MenuConsultas.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N

        MConsulSini.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        MConsulSini.setText("Siniestros");
        MConsulSini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MConsulSiniActionPerformed(evt);
            }
        });
        MenuConsultas.add(MConsulSini);
        MenuConsultas.add(jSeparator2);

        MConsulBriga.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        MConsulBriga.setText("Brigadas");
        MConsulBriga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MConsulBrigaActionPerformed(evt);
            }
        });
        MenuConsultas.add(MConsulBriga);

        jMenuBar1.add(MenuConsultas);

        BSalir.setBorder(null);
        BSalir.setText("Salir");
        BSalir.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
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
        Fondo.setVisible(false);
        escritorio.removeAll();
        escritorio.repaint();
        GestionBomber bomber = new GestionBomber();
        Dimension escritorioSize = escritorio.getSize();
        Dimension bomberSize = bomber.getSize();
        bomber.setLocation((escritorioSize.width - bomberSize.width) / 2,
                (escritorioSize.height - bomberSize.height) / 2);
        bomber.setVisible(true);
        escritorio.add(bomber);
        escritorio.moveToFront(bomber); // TODO add your handling code here:
    }//GEN-LAST:event_BBomberosMouseClicked

    private void Siniestro_DeclararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Siniestro_DeclararActionPerformed
        Fondo.setVisible(false);
        escritorio.removeAll();
        escritorio.repaint();
        DeclaracionSiniestro siniestro = new DeclaracionSiniestro();
        Dimension escritorioSize = escritorio.getSize();
        Dimension siniestroSize = siniestro.getSize();
        siniestro.setLocation((escritorioSize.width - siniestroSize.width) / 2,
                (escritorioSize.height - siniestroSize.height) / 2);
        siniestro.setVisible(true);
        escritorio.add(siniestro);
        escritorio.moveToFront(siniestro);
    }//GEN-LAST:event_Siniestro_DeclararActionPerformed

    private void BCuartelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCuartelMouseClicked

        Fondo.setVisible(false);
        escritorio.removeAll();
        escritorio.repaint();
        Cuarteles cuartel = new Cuarteles();
        Dimension escritorioSize = escritorio.getSize();
        Dimension cuartelSize = cuartel.getSize();
        cuartel.setLocation((escritorioSize.width - cuartelSize.width) / 2,
                (escritorioSize.height - cuartelSize.height) / 2);
        cuartel.setVisible(true);
        escritorio.add(cuartel);
        escritorio.moveToFront(cuartel);
// TODO add your handling code here:
    }//GEN-LAST:event_BCuartelMouseClicked

    private void MConsulSiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MConsulSiniActionPerformed

         Fondo.setVisible(false);
        escritorio.removeAll();
        escritorio.repaint();
        ConsultaSiniestros consul = new ConsultaSiniestros();
        Dimension escritorioSize = escritorio.getSize();
        Dimension consulSize = consul.getSize();
        consul.setLocation((escritorioSize.width - consulSize.width) / 2,
                (escritorioSize.height - consulSize.height) / 2);
        consul.setVisible(true);
        escritorio.add(consul);
        escritorio.moveToFront(consul);
        // TODO add your handling code here:
    }//GEN-LAST:event_MConsulSiniActionPerformed

    private void MConsulBrigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MConsulBrigaActionPerformed

        Fondo.setVisible(false);
        escritorio.removeAll();
        escritorio.repaint();
        ConsultaBrigada consulBri = new ConsultaBrigada();
        Dimension escritorioSize = escritorio.getSize();
        Dimension consulBriSize = consulBri.getSize();
        consulBri.setLocation((escritorioSize.width - consulBriSize.width) / 2,
                (escritorioSize.height - consulBriSize.height) / 2);
        consulBri.setVisible(true);
        escritorio.add(consulBri);
        escritorio.moveToFront(consulBri);
        // TODO add your handling code here:
    }//GEN-LAST:event_MConsulBrigaActionPerformed

    private void BBrigadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BBrigadaMouseClicked

        Fondo.setVisible(false);
        escritorio.removeAll();
        escritorio.repaint();
        Brigadas brigada = new Brigadas();
        Dimension escritorioSize = escritorio.getSize();
        Dimension brigadaSize = brigada.getSize();
        brigada.setLocation((escritorioSize.width - brigadaSize.width) / 2,
            (escritorioSize.height - brigadaSize.height) / 2);
        brigada.setVisible(true);
        escritorio.add(brigada);
        escritorio.moveToFront(brigada);
        // TODO add your handling code here:
    }//GEN-LAST:event_BBrigadaMouseClicked

    private void Siniestro_ConcluirActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Fondo.setVisible(false);
        escritorio.removeAll();
        escritorio.repaint();
        ConcluirSiniestro concluir = new ConcluirSiniestro();
        Dimension escritorioSize = escritorio.getSize();
        Dimension concluirSize = concluir.getSize();
        concluir.setLocation((escritorioSize.width - concluirSize.width) / 2,
                (escritorioSize.height - concluirSize.height) / 2);
        concluir.setVisible(true);
        escritorio.add(concluir);
        escritorio.moveToFront(concluir);
    }

    /**
     import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiApp {
    private JDesktopPane escritorio;
    private JLabel fondo;

    public MiApp() {
        // Inicializa tu JDesktopPane y fondo aquí
        escritorio = new JDesktopPane();
        fondo = new JLabel(new ImageIcon("ruta/a/tu/imagen.png"));

        // Configura el fondo
        fondo.setBounds(0, 0, escritorio.getWidth(), escritorio.getHeight());
        escritorio.add(fondo);
        escritorio.moveToBack(fondo);

        // Crea un método para restaurar el fondo
        restaurarFondo();
    }

    public void restaurarFondo() {
        escritorio.add(fondo);
        escritorio.moveToBack(fondo);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Mi Aplicación");
            MiApp app = new MiApp();

            // Agrega otros componentes y configuraciones a la aplicación aquí

            frame.add(app.escritorio);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setVisible(true);
        });
    }

     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
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
       */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    UIManager.setLookAndFeel(new BernsteinLookAndFeel());
                    new ViewMenu().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(ViewMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        //JFrame principal = new JFrame ();
        //ViewMenu menu = new ViewMenu ();
        
        //principal.add(menu.escritorio);
        //principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //principal.setSize(1000, 628);
        //principal.setVisible(true);
        /*public void restaurarFondo() {
        escritorio.add(fondo);
        escritorio.moveToBack(fondo);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Mi Aplicación");
            MiApp app = new MiApp();

            // Agrega otros componentes y configuraciones a la aplicación aquí

            frame.add(app.escritorio);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setVisible(true);
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BBomberos;
    private javax.swing.JMenu BBrigada;
    private javax.swing.JMenu BCuartel;
    private javax.swing.JMenu BSalir;
    private javax.swing.JMenu BSiniestro;
    private static javax.swing.JLabel Fondo;
    private javax.swing.JMenuItem MConsulBriga;
    private javax.swing.JMenuItem MConsulSini;
    private javax.swing.JMenu MenuConsultas;
    private javax.swing.JMenuItem Siniestro_Concluir;
    private javax.swing.JMenuItem Siniestro_Declarar;
    private static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables

    
    public static void restaurarFondo () { 
//        JDesktopPane menu = new JDesktopPane();
//        JLabel fondis = new JLabel(new ImageIcon ("grupo76_cuartelbomberos.Imagenes.byn.jpg"));
//        
//        //configuro el fondo
//        fondis.setBounds(0, 0,1000,682);
//        menu.add (fondis);
//        menu.moveToBack(fondis);
       // escritorio.add(menu);
       escritorio.add(Fondo);
        escritorio.moveToBack(Fondo);
        Fondo.setVisible(true);
    }
/*  public void restaurarFondo() {
        escritorio.add(fondo);
        escritorio.moveToBack(fondo);
    }*/
}
