
package grupo76_cuartelbomberos.vistas;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class ConsultaSiniestros extends javax.swing.JInternalFrame {

    private DefaultTableModel tabla = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    public ConsultaSiniestros() {
        initComponents();
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PConsulSini = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Siniestros = new javax.swing.JTable();
        PBotonesConsulta = new javax.swing.JPanel();
        BConsulSini = new javax.swing.JButton();
        BSalirConsulSini = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Consultas de Siniestros");
        setPreferredSize(new java.awt.Dimension(700, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Consulta de Siniestros por fecha ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, 50));

        Tabla_Siniestros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Tabla_Siniestros);

        javax.swing.GroupLayout PConsulSiniLayout = new javax.swing.GroupLayout(PConsulSini);
        PConsulSini.setLayout(PConsulSiniLayout);
        PConsulSiniLayout.setHorizontalGroup(
            PConsulSiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PConsulSiniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PConsulSiniLayout.setVerticalGroup(
            PConsulSiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PConsulSiniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PConsulSini, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 470, 150));

        BConsulSini.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BConsulSini.setText("Consultar");

        BSalirConsulSini.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BSalirConsulSini.setText("Salir");
        BSalirConsulSini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirConsulSiniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PBotonesConsultaLayout = new javax.swing.GroupLayout(PBotonesConsulta);
        PBotonesConsulta.setLayout(PBotonesConsultaLayout);
        PBotonesConsultaLayout.setHorizontalGroup(
            PBotonesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBotonesConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PBotonesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BConsulSini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BSalirConsulSini, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addContainerGap())
        );
        PBotonesConsultaLayout.setVerticalGroup(
            PBotonesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBotonesConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BConsulSini, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(BSalirConsulSini, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(PBotonesConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jDateChooser1.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 130, -1));

        jDateChooser2.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Desde:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Hasta:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSalirConsulSiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirConsulSiniActionPerformed

        ViewMenu ventana = new ViewMenu();
        ventana.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BSalirConsulSiniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BConsulSini;
    private javax.swing.JButton BSalirConsulSini;
    private javax.swing.JPanel PBotonesConsulta;
    private javax.swing.JPanel PConsulSini;
    private javax.swing.JTable Tabla_Siniestros;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    // Metodos sin eventos
    private void iniciarTabla() {
        //Inicializar las columnas de la tabla
        tabla.addColumn("COD");
        tabla.addColumn("TIPO");
        tabla.addColumn("FECHA INICO");
        tabla.addColumn("FECHA FIN");
        tabla.addColumn("BRIGADA");
        tabla.addColumn("CUARTEL");
        tabla.setRowCount(0);

        Tabla_Siniestros.setModel(tabla);
        PConsulSini.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                "Siniestros e Incidentes", TitledBorder.CENTER, TitledBorder.TOP));
        Tabla_Siniestros.setBackground(Color.gray);
        Tabla_Siniestros.setForeground(Color.white);
        Tabla_Siniestros.setSelectionBackground(Color.green);
        Tabla_Siniestros.setSelectionForeground(Color.black);
    }
}