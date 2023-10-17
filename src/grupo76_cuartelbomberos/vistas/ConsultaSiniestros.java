
package grupo76_cuartelbomberos.vistas;

public class ConsultaSiniestros extends javax.swing.JInternalFrame {

    
    public ConsultaSiniestros() {
        initComponents();
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PConsulSini = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PBotonesConsulta = new javax.swing.JPanel();
        BConsulSini = new javax.swing.JButton();
        BSalirConsulSini = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Consulta Siniestros ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

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

        getContentPane().add(PBotonesConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}